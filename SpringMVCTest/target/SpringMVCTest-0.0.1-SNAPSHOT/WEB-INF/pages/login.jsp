<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login form</title>
</head>
<body>
<div align="center">
<h2 align="center">*** LOGIN ***</h2>
<form:form action="login.do" class="form" method="post" commandName="user">
	<spring:hasBindErrors name="user">
		<div class="alert alert-danger fade in" role = "alert">
		<form:errors path="*"/>
		</div>
	</spring:hasBindErrors>
	<div class="form-group">
		<label class="label label-primary">Username </label>
		<form:input  path="userName" placeholder="eg.admin" required="required"/>
	</div>
	<div class="form-group">
		<label class="label label-primary">Password </label>
		<form:input path="userPassword" placeholder="as@23Mpqw" required="required"/>
	</div>
	<div class="form-group">
		<input type="submit" checked="btn btn-success">
	</div>

</form:form>
</div>
</body>
</html>