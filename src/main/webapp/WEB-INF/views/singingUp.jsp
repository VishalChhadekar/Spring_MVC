<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up here</title>
</head>
<body>
	Hello ${name} You Sing Up Successfully!<br>
	<!-- Getting data from user model attributes -->
	<h3>Getting data from Model</h3>
	<h4>Your Details</h4>
	Name: ${name}<br>
	Email:${email}<br>
	Password: ${password}<br>
	
	
	<!-- Getting data from user Object -->
	<h3>Getting data from user Object</h3>
	<h4>Your Details</h4>
	Name: ${user.getName()}<br>
	Email:${user.getEmail()}<br>
	Password: ${user.getPassword()}<br>
	
</body>
</html>