<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>Signin Template · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>



    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
    <form class="form-signin" action="/IvAl/Core?action=login" method="post">
  <img class="mb-4" src="img/carrito.png" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal" >Please log in</h1>
  <label for="inputEmail" class="sr-only">Username</label>
  <input type="text" id="inputEmail" class="form-control" placeholder="Email address" required autofocus name="username">
  <label for="inputPassword" class="sr-only">Password</label>
  <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
  <div class="checkbox mb-3">
    <label>
      <input type="checkbox" value="remember-me"> Remember me (Not Working)
    </label>
  </div>
  <button class="btn btn-lg btn-primary btn-block " type="submit">Log in</button>
  <div class="alert alert-danger collapse m-3" role="alert">
  Error en el login <br>
  usuario y/o contraseña incorrectos
</div>
  <button class="btn btn-lg btn-primary btn-block"><a href="vista/signin">Sign in</a></button>
  <p class="mt-5 mb-3 text-muted">&copy; IvAl 2019</p>
</form>
</body>
</html>
