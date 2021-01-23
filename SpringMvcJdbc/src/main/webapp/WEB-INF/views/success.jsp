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
<h1>Employees List</h1>  
<table border="2" width="80%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
   <c:forEach var="employee" items="${list}">   
   <tr>  
   <td>${employee.id}</td>  
   <td>${employee.name}</td>  
   <td>${employee.salary}</td>  
   <td>${employee.designation}</td>  
   
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  
</body>
</html>