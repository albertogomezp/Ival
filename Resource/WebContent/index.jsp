<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>IvAl - Tu tienda online</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.3/examples/pricing/">

<!-- Bootstrap core CSS -->
<link rel="stylesheet"	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
<%@include file="js/scripts.js" %>
</script>
<style> 
<%@include file="css/style.css" %>
 </style>



<!-- Enlaces para JS -->

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>

<body onload="updateClock(); setInterval('updateClock()', 1000 )">

	<!--BARRA DE NAVEGACION-->



	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
			<a class="navbar-brand" href="#"> <img
				src="vista/img/carrito.png" width="60" alt="">
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#alimentacion">Alimentación</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#perfumeria">Perfumeria</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#ropa">Ropa</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#bazar">Bazar</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="Core?action=listar" >Pagina
							pruebas</a></li>
				</ul>
				<a class="btn btn-info" href="vista/login.jsp" role="button">Sign-In</a>&nbsp;
				&nbsp;
				<!-- Button trigger modal -->
				<ul class="nav navbar-nav navbar-right">
					<li><a data-toggle="modal" data-target="#loginModal"><span
							class="btn btn-outline-primary"> Carrito </span> </a></li>
				</ul>


			</div>
	</div>

	<div id="loginModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4>Carrito</h4>
					<button type="button" class="close" data-dismiss="modal">
						&times;</button>



				</div>
				<div class="modal-body">
					<h1>MODAL TEXT</h1>
				</div>

			</div>
		</div>
	</div>s
	</nav>
	<!--FIN NAV -->


	<div class="container">
		<section id="carousel">
			<hr>
			<hr>
			<hr>
			<hr>
			<hr>
			<hr>
			<hr>
			<hr>
			<!-- Carrousel -->
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">

				<div class="carousel-inner">
					<div class="carousel-item active">
						<img src="vista/img/Carrousel1.png" class="d-block w-100"
							alt="CarrouselFoto1">
					</div>
					<div class="carousel-item">
						<img src="vista/img/Carrousel2.png" class="d-block w-100"
							alt="CarrouselFoto2">
					</div>
					<div class="carousel-item">
						<img src="vista/img/Carrousel3.png" class="d-block w-100"
							alt="CarrouselFoto3">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</section>

		<!-- Section alimentacion -->
		<section id="alimentacion">

			<div
				class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">

				<h1 class="display-4">Alimentación</h1>
				<p class="lead">Desde nuestra tienda puedes comprar los
					productos más frescos del mercado.</p>
			</div>




			<div class="card-deck mb-3 text-center">
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Pechuga de pollo</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/1.png" alt="Pechuga de pollo" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">
							5,99 &#8364; <small class="text-muted">/ kilo</small>
						</h1>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Pescado congelado</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/2.png" alt="Pez espada" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">
							8,99 &#8364; <small class="text-muted">/ kilo</small>
						</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Gamba fresca</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/3.png" alt="Gamba fresca" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">
							11,99 &#8364; <small class="text-muted">/ kilo</small>
						</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Chuletón de ternera</h4>
						<marquee scrollamount="1" scrolldelay="10" truespeed width="200"
							style="color: red">
							<n>¡¡OFERTA!!</n>
						</marquee>
					</div>
					<div class="card-body">
						<img src="vista/img/13.png" alt="Chuleton de ternera" class="zoom"
							height="175" width="175">
						<div id="mismalinea">
							<h1 class="card-title pricing-card-title">
								<span class="tachar">ANTES: 15,99 &#8364;<small
									class="text-muted">/ kilo </small>
							</h1>
							</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<h1 class="card-title pricing-card-title">
								AHORA: 10,99 &#8364;<small class="text-muted">/ kilo</small>
							</h1>
						</div>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-info">Añadir al
							carrito</button>
					</div>
				</div>
			</div>
		</section>



		<hr>


		<!-- Section perfumeria -->
		<section id="perfumeria">
			<div
				class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
				<h1 class="display-4">Perfumeria</h1>
				<p class="lead">Encuentra en nuestra tienda las mejores
					fragancias</p>
			</div>


			<div class="card-deck mb-3 text-center">
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Eau de Toilette Pivoine</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/4.png" alt="Eau de Toilette Pivoine"
							class="zoom" height="175" width="175">
						<h1 class="card-title pricing-card-title">
							15,99 &#8364; <small class="text-muted">/ 50ml</small>
						</h1>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">LA VIE EST BELLE</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/5.png" alt="LA VIE EST BELLE " class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">
							87,99 &#8364; <small class="text-muted">/ 100ml</small>
						</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">CK ONE</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/6.png" alt="clone" class="zoom" height="175"
							width="175">
						<h1 class="card-title pricing-card-title">
							34,85 &#8364; <small class="text-muted">/ 200ml</small>
						</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">JOHNSON'S Colonia suave
							para bebé - 750ml</h4>
						<marquee scrollamount="1" scrolldelay="10" truespeed width="200"
							style="color: red">
							<n>¡¡OFERTA!!</n>
						</marquee>
					</div>
					<div class="card-body">
						<img src="vista/img/14.png" alt="Colonia suave bebe" class="zoom"
							height="175" width="175">
						<div id="mismalinea">
							<h1 class="card-title pricing-card-title">
								<span class="tachar">ANTES: 6,99 &#8364;</span>
							</h1>
							<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
							<h1 class="card-title pricing-card-title">AHORA: 3,99
								&#8364;</h1>
						</div>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-info">Añadir al
							carrito</button>
					</div>
				</div>
			</div>
		</section>


		<hr>


		<!-- Section ropa -->
		<section id="ropa">
			<div
				class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
				<h1 class="display-4">Ropa</h1>
				<p class="lead">Encuentra en nuestra tienda la mejor moda que
					hay en la actualidad</p>
			</div>


			<div class="card-deck mb-3 text-center">
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Camisa de Hombre</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/7.png" alt="camishombre" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">30.70 &#8364;</h1>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Conjunto para bebe</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/8.png" alt="LA VIE EST BELLE " class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">17,99 &#8364;</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Camiseta para mujer</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/9.png" alt="clone" class="zoom" height="175"
							width="175">
						<h1 class="card-title pricing-card-title">9,99 &#8364;</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Pantalón Escalada Turia
							Jean Snow Hombre.</h4>
						<marquee scrollamount="1" scrolldelay="10" truespeed width="200"
							style="color: red">
							<n>¡¡OFERTA!!</n>
						</marquee>
					</div>
					<div class="card-body">
						<img src="vista/img/15.png" alt="pantalon hombre" class="zoom"
							height="175" width="175">
						<div id="mismalinea">
							<h1 class="card-title pricing-card-title">
								</span class="tachar">ANTES: 45,95 &#8364;
							</h1>
							</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<h1 class="card-title pricing-card-title">AHORA: 39,95
								&#8364;</h1>
						</div>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-info">Añadir al
							carrito</button>
					</div>
				</div>
			</div>
		</section>

		<hr>
		<!-- Section bazar -->
		<section id="bazar">
			<div
				class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
				<h1 class="display-4">Bazar</h1>
				<p class="lead">Pasaté por la sección de bazar en nuestra tienda
					para llevarte productos de 1º calidad</p>
			</div>


			<div class="card-deck mb-3 text-center">
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Juego de herramientas</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/10.png" alt="juegoherramienta" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">22,76 &#8364;</h1>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Aspiradora de mano</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/11.png" alt="aspiradoramano" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">19,89 &#8364;</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Cafetera Cecotec</h4>
					</div>
					<div class="card-body">
						<img src="vista/img/12.png" alt="cafetera" class="zoom"
							height="175" width="175">
						<h1 class="card-title pricing-card-title">30,99 &#8364;</h1>

						<button type="button"
							class="btn btn-lg btn-block btn-outline-primary">Añadir
							al carrito</button>
					</div>
				</div>
				<div class="card mb-3 shadow-sm">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">Tumbona de Aluminio -
							FLORABEST</h4>
						<marquee scrollamount="1" scrolldelay="10" truespeed width="200"
							style="color: red">
							<n>¡¡OFERTA!!</n>
						</marquee>
					</div>
					<div class="card-body">
						<img src="vista/img/16.png" alt="tumbona aluminio" class="zoom"
							height="175" width="175">
						<div id="mismalinea">
							<h1 class="card-title pricing-card-title">
								</span class="tachar">ANTES: 44,95 &#8364;
							</h1>
							</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<h1 class="card-title pricing-card-title">AHORA: 34,95
								&#8364;</h1>
						</div>
						<button type="button"
							class="btn btn-lg btn-block btn-outline-info">Añadir al
							carrito</button>
					</div>
				</div>
			</div>
		</section>


		<footer class="pt-4 my-md-5 pt-md-5 border-top">
			<div class="row">
				<div class="col-12 col-md">
					<img src="vista/img/carrito.png" alt="carro" width="24" height="24">
					<small class="d-block mb-3 text-muted">&copy; 2019</small>
				</div>
				<div class="col-6 col-md">
					<h5>Creadores</h5>
					<ul class="list-unstyled text-small">
						<li><a target="_blank" class="text-muted" target="_blank"
							href="https://github.com/albertogomezp">Alberto Gomez Peña</a></li>
						<li><a target="_blank" class="text-muted" target="_blank"
							href="https://github.com/ivanperezmolina">Iván Pérez Molina</a></li>
					</ul>
				</div>
				<div class="col-6 col-md">
					<h5>Repositorio</h5>
					<ul class="list-unstyled text-small">
						<li><a target="_blank" class="text-muted"
							href="https://github.com/albertogomezp/Ival/tree/master">Repositorio
								Oficial</a></li>
					</ul>
				</div>
				<div class="col-6 col-md">
					<h5>Herramientas</h5>
					<ul class="list-unstyled text-small">
						<li><a target="_blank" class="text-muted"
							href="https://getbootstrap.com/">Bootstrap</a></li>
						<li><a target="_blank" class="text-muted"
							href="https://www.gitkraken.com/">GitKraken</a></li>
						<li><a target="_blank" class="text-muted"
							href="https://www.eclipse.org/">Eclipse</a></li>
						<li><a target="_blank" class="text-muted"
							href="https://www.viewnext.com/">ViewNext</a></li>

					</ul>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>