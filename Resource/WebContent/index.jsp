<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Testing</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js" ></script>
	<meta charset="ISO-8859-1">
	<script>    <%@include file="js/scripts.js" %>	</script>
	<style>	    <%@include file="css/style.css" %>	</style>
	

</head>
<body onload="updateClock(); setInterval('updateClock()', 1000 )"><div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
				 
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="navbar-toggler-icon"></span>
				</button> <a class="navbar-brand" href="https://google.es" target="_blank">Ival testing area</a>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="navbar-nav">
						<li class="nav-item active">
							 <a class="nav-link" href="#">Link <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							 <a class="nav-link" href="#">Link</a>
						</li>
						<li class="nav-item dropdown">
							 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
								 <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
								<div class="dropdown-divider">
								</div> <a class="dropdown-item" href="#">Separated link</a>
							</div>
						</li>
					</ul>
					<form class="form-inline">
						<input class="form-control mr-sm-2" type="text" /> 
						<button class="btn btn-primary my-2 my-sm-0" type="submit">
							Search
						</button>
					</form>
					<ul class="navbar-nav ml-md-auto">
						
						<li class="nav-item dropdown">
							 <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link</a>
							<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
								 <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
								<div class="dropdown-divider">
								</div> <a class="dropdown-item" href="#">Separated link</a>
							</div>
						</li>
						<li class="nav-item active"> 
							 <a class="nav-link" href="https://time.is/es/Spain" target="_blank"><span id="clock">&nbsp;</span></a> <!-- RELOJ -->
						</li>
					</ul>
				</div>
			</nav>
			<div class="row">
				<div class="col-md-3 text-center">
					 
					<button type="button" class="btn btn-success" onclick="callJqueryAjax('testconection')">
						Servlet
					</button>
				</div>
				<div class="col-md-3 text-center">
					 
					<button type="button" class="btn btn-secondary">
						Button
					</button>
				</div>
				<div class="col-md-3 text-center">
					 
					<button type="button" class="btn btn-info">
						Button
					</button>
				</div>
				<div class="col-md-3 text-center">
					 
					<button type="button" class="btn btn-warning">
						Button
					</button>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 align-center">
					
						<div class="form-group text-center">
							 
							<label for="Username" class="text-center">
								Username
							</label>
							<input type="text" class="form-control text-center" id="Username" name="user" placeholder="your username"/>
						</div>
						<div class="form-group text-center">
							 
							<label for="pasword" class="text-center">
								Password
							</label>
							<input type="password" class="form-control text-center" id="password" name="password" placeholder="your password"/>
						</div>
						<div class="checkbox text-right">
							 
							<label>
								<input type="checkbox" /> Check me out
							</label>
						</div> 
						<button onclick="moveUserData('SecureLogin')" class="btn btn-primary">
							Submit
						</button>
					
				</div>
				<div class="col-md-6 bg-dark text-light text-center" id="resultServlet">
				UwU
				</div>
				<div class="col-md-3">
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>