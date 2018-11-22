<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ include file ="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container" >
<table class="table table-striped" border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>PRODUCT NAME</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>ACTION</th>
	    </tr>
    </thead>
<c:forEach items="${products}" var="p"> <!-- p is product object -->
<tr>
		<td>${p.id }</td>
		<td>${p.productName }</td>
		<td>${p.price }</td>
		<td>${p.quantity }</td>
		<td>
		<a href="<c:url value='/all/getProduct?id=${p.id }'></c:url>"><span class="glyphicon glyphicon-info-sign"></span></a>
		<a href="<c:url value='/admin/deleteProduct?id=${p.id }'></c:url>"><span class="glyphicon glyphicon-trash"></span></a>
		<a href="<c:url value='/admin/getUpdateProductForm?id=${p.id }'></c:url>"><span class="glyphicon glyphicon-pencil"></span></a>
		</td>
          
 </c:forEach>
</body>

</table>
   </div>

</html>