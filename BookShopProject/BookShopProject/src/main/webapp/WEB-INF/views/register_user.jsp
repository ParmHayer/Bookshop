<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Register User</title>
</head>
<h1 align="center">Parm's Book Store</h1><br>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Register</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active" onclick="window.location.href='/'"><a href="#">Home</a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="#" onclick="window.location.href='/register'"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      <li><a href="#" onclick="window.location.href='/login'"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<body>
<h3>Register User</h3><br>
<div class-"container">
<form action="registeruser" method="post">
<div class="form-group">
<label for="firstname">First Name</label>
<input type="text" name="firstname"/> <br>
</div>
<div class="form-group">
<label for="lastname">Last Name</label>
<input type="text" name="lastname"/> <br>
</div>
<div class="form-group">
<label for="email">Email</label>
<input type="text" name="email"/> <br>
</div>
<div class="form-group">
<label for="password">Password</label>
<input type="password" name="password"/> <br>
</div>
<button type="submit" class="btn btn-primary">Register</button>
</form>
</div>
</body>
</html>