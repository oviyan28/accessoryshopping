<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/RegisterForm.css'></c:url>" rel="stylesheet">

<script type="text/javascript"
		src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<script type="text/javascript">

function fillShippingAddress(form){
	if(form.ShippingAddressForm.checked==true){
		//shippingaddress is same as billingaddress
		form["ShippingAddress.ApartmentNumber"].value=form["BillingAddress.ApartmentNumber"].value;
		form["ShippingAddress.StreetName"].value=form["BillingAddress.StreetName"].value;
		form["ShippingAddress.City"].value=form["BillingAddress.City"].value;
		form["ShippingAddress.State"].value=form["BillingAddress.State"].value;
		form["ShippingAddress.Country"].value=form["BillingAddress.Country"].value;
		form["ShippingAddress.ZipCode"].value=form["BillingAddress.ZipCode"].value;
	}
	if(form.ShippingAddressForm.checked==false){
		form["ShippingAddress.ApartmentNumber"].value=""
		form["ShippingAddress.StreetName"].value=""
		form["ShippingAddress.City"].value=""
		form["ShippingAddress.State"].value=""
		form["ShippingAddress.Country"].value=""
		form["ShippingAddress.ZipCode"].value=""
	}
}



$(document).ready(function(){
	$('#form').validate({
		rules:{
			FirstName:{required:true},
			LastName:{required:true},
			PhoneNumber:{required:true,number:true,minlength:10,maxlength:10},
			"User.EMail":{required:true,email:true},
			"User.Password":{required:true,minlength:5,maxlength:10},
			"BillingAddress.ApartmentNumber":{required:true},
			"BillingAddress.StreetName":{required:true},
			"BillingAddress.State":{required:true},
			"BillingAddress.City":{required:true},
			"BillingAddress.Country":{required:true},
			"BillingAddress.ZipCode":{required:true,number:true}
		},
		messages:{
			FirstName:{required:"Firstname is mandatory"},
			PhoneNumber:{required:"Phonenumber is required"},
			"User.EMail":{required:"Email is required",email:"Please enter valid email address"}
		}
	})
})
</script>
</head>
<body>
<div class="container">
<c:url value="/all/RegisterCustomer" var="url"></c:url>
<form:form modelAttribute="Customer" action="${url }" id="Form">

<form:hidden path="id"/>

<form:label path="Firstname">Enter Firstname</form:label>
<form:input path="Firstname" id="Firstname"/>


<form:label path="Lastname">Enter Lastname</form:label>
<form:input path="Lastname" id="Lastname"/>


<form:label path="PhoneNumber">Enter Phonenumber</form:label>
<form:input path="PhoneNumber" id="PhoneNumber"/>

<hr>
<b>Login Credentials</b><br>
<form:label path="User.EMail">Enter Email</form:label>
<form:input path="User.EMail" id="User.EMail" type="EMail"/>
<span style="color:red">${error }</span>
<form:label path="User.Password">Enter password</form:label>
<form:input path="User.Password" id="User.Password" type="Password"/>



<hr>
<b>Billing Address</b><br>

<form:label path="BillingAddress.ApartmentNumber">Enter Apartmentnumber</form:label>
<form:input path="BillingAddress.ApartmentNumber" id="BillingAddress.ApartmentNumber"/>

<form:label path="BillingAddress.StreetName">Enter streetname</form:label>
<form:input path="BillingAddress.StreetName" id="BillingAddress.StreetName"/>

<form:label path="BillingAddress.City">Enter city</form:label>
<form:input path="BillingAddress.City" id="BillingAddress.City"/>

<form:label path="BillingAddress.State">Enter state</form:label>
<form:input path="BillingAddress.State" id="BillingAddress.State"/>

<form:label path="BillingAddress.Country">Enter country</form:label>
<form:input path="BillingAddress.Country" id="BillingAddress.Country"/>

<form:label path="BillingAddress.ZipCode">Enter Zipcode</form:label>
<form:input path="BillingAddress.ZipCode" id="BillingAddress.ZipCode"/>
<hr>
<b>Shipping Address</b><br>
Check this if shipping address is same as billing address
<input type="checkbox" onclick="fillShippingAddress(this.form)" id="ShippingAddressForm">
<form:label path="ShippingAddress.ApartmentNumber">Enter Apartmentnumber</form:label>
<form:input path="ShippingAddress.ApartmentNumber" id="ShippingAddress.ApartmentNumber"/>

<form:label path="ShippingAddress.StreetName">Enter streetname</form:label>
<form:input path="ShippingAddress.StreetName" id="ShippingAddress.StreetName"/>

<form:label path="ShippingAddress.City">Enter city</form:label>
<form:input path="ShippingAddress.City" id="ShippingAddress.City"/>

<form:label path="ShippingAddress.State">Enter state</form:label>
<form:input path="ShippingAddress.State" id="ShippingAddress.State"/>

<form:label path="ShippingAddress.Country">Enter country</form:label>
<form:input path="ShippingAddress.Country" id="ShippingAddress.Country"/>

<form:label path="ShippingAddress.ZipCode">Enter zipcode</form:label>
<form:input path="ShippingAddress.ZipCode" id="ShippingAddress.ZipCode"/>
<br>
<input type="submit" value="Register" style="background-color:maroon;">

</form:form>
</div>


</body>
</html>