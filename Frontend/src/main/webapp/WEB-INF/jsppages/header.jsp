<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="<c:url value='C:\Users\Dell\eclipse-workspace\Frontend\src\main\webapp\WEB-INF\resource\css\navbar.css'></c:url>">
<link rel="stylesheet" href="<c:url value='/resource/css/RegisterForm.css'></c:url>">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- JQuery -->

    <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

 
    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
<title>Insert title here</title>

</head>
<body>
<div class="container">
<nav class="navbar navbar-inverse">
<div class="navbar-header">
				<a href="" class="navbar-brand"><img src="/Frontend/resource/images/download.jpg" alt="ADORABLE" height="50px" width="70px"></a>
				<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#navbar" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
</div>
<div class="collapse navbar-collapse" id="navbar">
<ul class="nav navbar-nav">
	
<li><a href="<c:url value='/home'></c:url>" ><span class="glyphicon glyphicon-home"></span>Home</a></li>
	
<li><a href="#">AboutUs</a></li>
<li><a href=""><span class="glyphicon glyphicon-plus"></span>Add Product</a></li>
<li><a href=" <c:url value ='/all/getAllProducts'></c:url>">Browse all products</a></li>
<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Select By Category<span class="caret"></span></a>
				<ul class="dropdown-menu">
				<li><a href="#">Leather</a></li>
				<li><a href="#">Band</a></li>
				<li><a href="#">Bracelet</a></li>
				</ul>
</li>
<li><a href=""><span class="glyphicon glyphicon-registration-mark"></span>Sign up</a></li>
<li><a href="#"><span class="glyphicon glyphicon-log-out"></span>Sign Out</a></li>		
<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sign In</a></li>

</ul>
</div>
</nav>

</div>
</body>
</html>