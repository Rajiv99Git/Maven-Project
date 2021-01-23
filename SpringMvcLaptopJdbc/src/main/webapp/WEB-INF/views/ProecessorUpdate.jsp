<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post"  action="/SpringMvcLaptopJdbc/ProecessorUpdate">
<table>
<tr>
<tr>
<td><form:label path="id">Generation  :</form:label></td>
<td><form:input path="id"  /></td>
</tr>
<tr>
<td><form:label path="generation">Generation  :</form:label></td>
<td><form:input path="generation" /></td>
</tr>
<tr>
<td><form:label path="company">Company :</form:label></td>
<td><form:input path="company" /></td>
</tr>
<tr>
<td><form:label path="chipset">Chipset  :</form:label></td>
<td><form:input path="chipset" /></td>
</tr>


<tr>
<td colspan="2"><input type="submit" value="submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>