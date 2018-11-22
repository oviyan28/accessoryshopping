<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<!-- using action attribute we are going to call handler method -->
<div class="container">
<c:url value='/admin/addProduct' var="url"></c:url>

<form:form action="${url }" method="post" modelAttribute="product"><!-- newly created product object -->
	<table>
	
		<tr>
			<td>Enter Product Name</td>
			<td>
			<form:input path="productName"/>
			<form:errors path="productName" cssStyle="color:red"></form:errors>
			</td>
		</tr>
        <tr>
			<td>Enter Product Description</td>
			<td>
			<form:textarea path="productDesc"/>
			<form:errors path="productDesc" cssStyle="color:red"></form:errors>
			</td>
		</tr>
        <tr>
			<td>Enter Product Price</td>
			<td>
			<form:input path="price"/>
			<form:errors path="price" cssStyle="color:red"></form:errors>
			</td>
		</tr>
		
		<tr>
			<td>Enter Product Quantity</td>
			<td>
			<form:input path="quantity"/>
			<form:errors path="quantity" cssStyle="color:red"></form:errors>
			</td>
		</tr>
		
		<tr>
		<td>Select Category</td>
		<td><form:select path="category.id"><!-- product.category.id=6 -->
		<form:option value="1">leather</form:option>
		<form:option value="2">Bands</form:option>
		<form:option value="3">bracelet</form:option>
		</form:select>
		<form:errors path="category" cssStyle="color:red"></form:errors>
		</td>
		</tr>
		
		<tr><td>
		<input type="submit" value="Add Product">  </td>
		<td></td>
		</tr>
		
	</table>
	</form:form>
	</div>
</body>
</html>

