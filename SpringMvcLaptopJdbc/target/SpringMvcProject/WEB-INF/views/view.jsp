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
<tr><th>Id</th><th>Generation</th><th>Company</th><th>Chipset</th></tr>  
   <c:forEach var="processor" items="${list}">   
   <tr>  
   <td>${processor.id}</td>  
   <td>${processor.generation}</td>  
   <td>${processor.company}</td>  
   <td>${processor.chipset}</td>  
   
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  
</body>
</html>