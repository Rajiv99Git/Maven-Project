<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
<h1>processor List</h1>  
<table border="2" width="80%" cellpadding="2">  
<tr><th>serial_no</th><th>graphic_card</th><th>RAM</th><th>Company</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="laptop" items="${list}">   
   <tr>  
   <td>${laptop.serial_no}</td>  
   <td>${laptop.graphic_card}</td>  
   <td>${laptop.ram}</td>  
   <td>${laptop.company}</td> 
    <td><a href="editLaptop/${laptop.serial_no}">Edit</a></td>   
   <td><a href="deleteLaptop/${laptop.serial_no}">Delete</a></td>   
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  <a href="Register">Add New Processor</a>
   
</body>
</html>