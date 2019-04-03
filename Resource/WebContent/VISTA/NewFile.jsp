<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

    <title>IvAl - Tu tienda online</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/pricing/">

    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
	      html {
	  font-size: 14px;
	}
	@media (min-width: 768px) {
	  html {
	    font-size: 16px;
	  }
	}
	
	.container {
	  max-width: 960px;
	}
	
	.pricing-header {
	  max-width: 700px;
	}
	
	.card-deck .card {
	  min-width: 220px;
	}
    </style>
</head>

<body>
   <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm fixed-top">
  <h5 class="my-0 mr-md-auto font-weight-normal">IvAl - Tu tienda OnLine</h5>
  <nav class="my-2 my-md-0 mr-md-3 " >
    <a class="p-2 text-dark" href="#">Alimentación</a>
    <a class="p-2 text-dark" href="#perfumeria">Perfumeria</a>
    <a class="p-2 text-dark" href="#ropa">Ropa</a>
    <a class="p-2 text-dark" href="#bazar">Bazar</a>
  </nav>
  <a class="btn btn-outline-primary" href="#">Sign up</a>
</div>
<hr>
<div class="container">
<!-- Section alimentacion -->
<section id="alimentacion">
<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">

  <h1 class="display-4">Alimentación</h1>
  <p class="lead">Desde nuestra tienda puedes comprar los productos más frescos del mercado.</p>
</div>


  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Pechuga de pollo</h4>
      </div>
      <div class="card-body">
      <img src="img/1.jpg" alt="Pechuga de pollo" height="175" width="175" >
        <h1 class="card-title pricing-card-title">5,99 &#8364; <small class="text-muted">/ kilo</small></h1>          
        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Pescado congelado</h4>
      </div>
      <div class="card-body">
      <img src="img/2.png" alt="Pez espada" height="175" width="175" >
        <h1 class="card-title pricing-card-title">8,99 &#8364; <small class="text-muted">/ kilo</small></h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Gamba fresca</h4>
      </div>
      <div class="card-body">
      <img src="img/3.png" alt="Gamba fresca" height="175" width="175" >
        <h1 class="card-title pricing-card-title">11,99 &#8364; <small class="text-muted">/ kilo</small></h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
  </div>
</section>



<hr>


<!-- Section perfumeria -->
<section id="perfumeria">
<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
  <h1 class="display-4">Perfumeria</h1>
  <p class="lead">Encuentra en nuestra tienda las mejores fragancias </p>
</div>


  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Eau de Toilette Pivoine</h4>
      </div>
      <div class="card-body">
      <img src="img/4.png" alt="Eau de Toilette Pivoine" height="175" width="175" >
        <h1 class="card-title pricing-card-title">15,99 &#8364; <small class="text-muted">/ 50ml</small></h1>          
        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">LA VIE EST BELLE </h4>
      </div>
      <div class="card-body">
      <img src="img/5.jpg" alt="LA VIE EST BELLE " height="175" width="175" >
        <h1 class="card-title pricing-card-title">87,99 &#8364; <small class="text-muted">/ 100ml</small></h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">CK ONE</h4>
      </div>
      <div class="card-body">
      <img src="img/6.jpg" alt="clone" height="175" width="175" >
        <h1 class="card-title pricing-card-title">34,85 &#8364; <small class="text-muted">/ 200ml</small></h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
  </div>
</section>


<hr>


<!-- Section ropa -->
<section id="ropa">
<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
  <h1 class="display-4">Ropa</h1>
  <p class="lead">Encuentra en nuestra tienda la mejor moda que hay en la actualidad </p>
</div>


  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Camisa de Hombre</h4>
      </div>
      <div class="card-body">
      <img src="img/7.jpg" alt="camishombre" height="175" width="175" >
        <h1 class="card-title pricing-card-title">30.70 &#8364; </h1>          
        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Conjunto para bebe</h4>
      </div>
      <div class="card-body">
      <img src="img/8.jpg" alt="LA VIE EST BELLE " height="175" width="175" >
        <h1 class="card-title pricing-card-title">17,99 &#8364;</h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Camiseta para mujer</h4>
      </div>
      <div class="card-body">
      <img src="img/9.jpg" alt="clone" height="175" width="175" >
        <h1 class="card-title pricing-card-title">9,99 &#8364;</h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
  </div>
</section>

<hr>
<!-- Section bazar -->
<section id="bazar">
<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
  <h1 class="display-4">Bazar</h1>
  <p class="lead">Pasaté por la sección de bazar en nuestra tienda para llevarte productos de 1º calidad</p>
</div>


  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Juego de herramientas</h4>
      </div>
      <div class="card-body">
      <img src="img/10.jpg" alt="juegoherramienta" height="175" width="175" >
        <h1 class="card-title pricing-card-title">22,76 &#8364; </h1>          
        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Aspiradora de mano</h4>
      </div>
      <div class="card-body">
      <img src="img/11.jpg" alt="aspiradoramano" height="175" width="175" >
        <h1 class="card-title pricing-card-title">19,89 &#8364;</h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Cafetera Cecotec</h4>
      </div>
      <div class="card-body">
      <img src="img/12.png" alt="cafetera" height="175" width="175" >
        <h1 class="card-title pricing-card-title">30,99 &#8364;</h1>

        <button type="button" class="btn btn-lg btn-block btn-primary">Añadir al carrito</button>
      </div>
    </div>
  </div>
</section>


  <footer class="pt-4 my-md-5 pt-md-5 border-top">
    <div class="row">
      <div class="col-12 col-md">
        <img src="img/carrito.png" alt="carro" width="24" height="24">
        <small class="d-block mb-3 text-muted">&copy; 2019</small>
      </div>
      <div class="col-6 col-md">
        <h5>Creadores</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" target="_blank" href="https://github.com/albertogomezp">Alberto Gomez Peña</a></li>
          <li><a class="text-muted" target="_blank" href="https://github.com/ivanperezmolina">Iván Pérez Molina</a></li>
        </ul>
      </div>
      <div class="col-6 col-md">
        <h5>Repositorio</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="https://github.com/albertogomezp/Ival/tree/master">Repositorio Oficial</a></li>
                  </ul>
      </div>
      <div class="col-6 col-md">
        <h5>Herramientas</h5>
        <ul class="list-unstyled text-small">
          <li><a class="text-muted" href="https://getbootstrap.com/">Bootstrap</a></li>
          <li><a class="text-muted" href="https://www.gitkraken.com/">GitKraken</a></li>
          <li><a class="text-muted" href="https://www.eclipse.org/">Eclipse</a></li>
          <li><a class="text-muted" href="https://www.viewnext.com/">ViewNext</a></li>
        </ul>
      </div>
    </div>
  </footer>
</div>
</body>
</html>