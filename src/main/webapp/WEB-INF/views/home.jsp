<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Welcome to String MVC</h1>
	<%
	String name = (String) request.getAttribute("name");
	%>
	Hello <%=name %>

</body>
</html>