package com.spring.jpa.app.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.jpa.app.models.entity.Producto;
import com.spring.jpa.app.models.service.IProductoService;
import com.spring.jpa.app.util.paginator.PageRender;

@Controller
@Primary
@SessionAttributes("producto")

public class ProductoController {

	@Autowired // esto encontrará el repo
//	@Qualifier("IProductoDaoJPA") // Para mapear en caso de ambiguedad
	private IProductoService productoService;
	private final static String UPLOADS_FOLDER = "uploads";
	private final Logger log = org.slf4j.LoggerFactory.getLogger(getClass());

	/**
	 * ---------------------------------------------------------------------- 
	 * Busca un producto y muestra sus datos
	 * 
	 * @param id
	 * @param model
	 * @param flash
	 * @return
	 */
	@GetMapping(value = "/ver/{id}")
	public String ver(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		// Lo busca
		Producto producto = productoService.findOne(id);
		if (producto == null) {
			// Si no existe
			flash.addFlashAttribute("msg", "true");
			flash.addFlashAttribute("info", "El producto no existe en la base de datos");
			return "redirect:/listar";
		}
		// Muestra sus datos
		model.put("producto", producto);
		model.put("titulo", "Detalles del producto: " + producto.getNombre());
		return "/ver";
	}

	/**
	 * ---------------------------------------------------------------------- Lista
	 * todos los usuarios (por GET)
	 * 
	 * @param model
	 * @return Lista de productos
	 */
	@RequestMapping(value = { "listar", "", "/" }, method = RequestMethod.GET)
	public String listar(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "resultados", defaultValue = "10") int resultados, RedirectAttributes flash,
			Model model, SessionStatus status) {
		// Si el numero de resultados por página es mayour que 0, lo guarda
		if (resultados > 0) {

			model.addAttribute("resultados", resultados);
		} else {
			// Sino, establece 10 como predeterminado
			status.setComplete();
			model.addAttribute("resultados", "10");
			resultados = 10;
			flash.addFlashAttribute("msg", "true");
			// Si no es uno de los valores predefinidios y no es válido (que se meta 0, por
			// ejemplo)
			flash.addFlashAttribute("warning",
					"por favor, no juegues con los parametros de la página, te he pillado...");
			return "redirect:listar";
		}
		// Lista los usuarios por grupos
		Pageable pageRequest = PageRequest.of(page, resultados);
		Page<Producto> productos = productoService.findAll(pageRequest);
		PageRender<Producto> pageRender = new PageRender<>("/listar", productos);
		model.addAttribute("titulo", "Listado de productos");
		model.addAttribute("productos", productos);
		model.addAttribute("page", pageRender);
		model.addAttribute("resultados", resultados);
		return "/listar";
	}

	/**
	 * ---------------------------------------------------------------------- Crea
	 * formulario de registro
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String crear(Map<String, Object> model) {
		Producto producto = new Producto();
		model.put("producto", producto);
		model.put("titulo", "Formulario de Producto");
		model.put("accion", "crear producto");
		model.put("whatis", "false");

		return "form";
	}

	/**
	 * ---------------------------------------------------------------------- Guarda
	 * un producto en la BD
	 * 
	 * @param producto
	 * @param result
	 * @param model
	 * @param foto
	 * @param flash
	 * @param status
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("producto") Producto producto, BindingResult result, Model model,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status) {
		// Si existen errores
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Producto");
			model.addAttribute("accion", "Intentelo de nuevo");
			model.addAttribute("whatis", "true");

			return "form";
		}
		// Si introduce una foto, se almacena
		if (!foto.isEmpty()) {
			if(producto.getId() != null
					&& producto.getId() > 0
					&& producto.getFoto() != null
					&& producto.getFoto().length() > 0){
				Path rootPath = Paths.get(UPLOADS_FOLDER).resolve(producto.getFoto()).toAbsolutePath();
				File archivo = rootPath.toFile();

				// Si tiene foto y además se puede leer
				if (archivo.exists() && archivo.canRead()) {
					archivo.delete();
				}
			}
			
			// Path directorioRecursos = Paths.get("src//main//resources//static/uploads");
			String uniqueFilename = UUID.randomUUID().toString() + "_" + foto.getOriginalFilename();
			Path rootPath = Paths.get(UPLOADS_FOLDER).resolve(uniqueFilename);
			Path rootAbsolutPath = rootPath.toAbsolutePath();
			log.info("rootPath: " + rootPath);
			log.info("rootPath: " + rootAbsolutPath);
			// Obtiene las rutas de la foto y la sube
			try {
				Files.copy(foto.getInputStream(), rootAbsolutPath);
				flash.addFlashAttribute("info", "Has subido correctamente '" + foto.getOriginalFilename() + "'");
				flash.addFlashAttribute("msg", "true");
				producto.setFoto(foto.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// Guarda el producto
		productoService.save(producto);
		status.setComplete();
		flash.addFlashAttribute("msg", "true");
		flash.addFlashAttribute("success", "Producto guardado con éxito");
		return "redirect:listar";

	}

	/**
	 * ---------------------------------------------------------------------- Edita
	 * un producto
	 * 
	 * @param id
	 * @param model
	 * @param flash
	 * @return
	 */
	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		Producto producto = null;
		if (id > 0) {
			producto = productoService.findOne(id);
			// Si el producto no existe en la BD
			if (producto == null) {
				flash.addFlashAttribute("msg", "true");
				flash.addFlashAttribute("error", "El ID del producto no existe en la base de datos");

			}
		} else {
			flash.addFlashAttribute("msg", "true");
			// Si el id es 0
			flash.addFlashAttribute("error", "El ID del producto no puede ser 0");

			return "redirect:/listar";
		}
		// Guarda el producto
		model.put("producto", producto);
		model.put("titulo", "Editar ".concat(producto.getNombre()));
		model.put("accion", "Editar producto");
		model.put("whatis", "true");

		return "form";

	}

	/**
	 * ----------------------------------------------------------------------
	 * Elimina un producto y su foto
	 * 
	 * @param id
	 * @param flash
	 * @return
	 */
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
		// Si su id es mayor que cero (válida)
		if (id > 0) {
			Producto producto = productoService.findOne(id);

			Path rootPath = Paths.get(UPLOADS_FOLDER).resolve(producto.getFoto()).toAbsolutePath();
			File archivo = rootPath.toFile();
			// Si tiene foto y además se puede leer
			if (archivo.exists() && archivo.canRead()) {
				if (archivo.delete()) {
					flash.addFlashAttribute("msg", "true");
					flash.addFlashAttribute("success", "Foto  eliminada con éxito");
				}
			}
			productoService.delete(id);
			flash.addFlashAttribute("msg", "true");
			flash.addFlashAttribute("success", "Producto eliminado con éxito");

		}
		return "redirect:/listar";
	}

}
