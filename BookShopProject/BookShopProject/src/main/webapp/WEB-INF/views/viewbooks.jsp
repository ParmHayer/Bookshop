<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	table, th, td {
    border: 1px solid black;
    } 
</style>
<title>Books</title>
<h1 align="center">Parm's Book Store</h1><br>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Books</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active" onclick="window.location.href='/'"><a href="#">Home</a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="#" onclick="window.location.href='/register'"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      <li><a href="#" onclick="window.location.href='/login'"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
    </ul>
    <form class="navbar-form navbar-right">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search"><button class="btn btn-default" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button>
      </div>
    </form>
  </div>
</nav>

</head>
<h3>Books available to buy</h3><br>
<body>

<table style="width:75%">
  <tr>
    <th>ID</th>
    <th>Book Name</th> 
    <th>Author</th>
    <th>Publisher</th>
    <th>Overview</th>
    <th>ISBN</th>
    <th>Price (£)</th>
  </tr>
<c:forEach items="${allBooks}" var="book">
	<tr>
	<td>${book.id}</td>
    <td>${book.bookname}</td> 
    <td>${book.author}</td>
    <td>${book.publisher}</td>
    <td>${book.overview}</td>
    <td>${book.isbn}</td>
    <td>${book.price}</td>
    </tr>
</c:forEach>
</table>


</body>
</html>