<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 5 MVC - Hello World Example</title>
</head>
<body>
	<h2>${helloworld.message}</h2>
	<h4>Server date time is : ${helloworld.dateTime}</h4>
	 

</body>
</html>