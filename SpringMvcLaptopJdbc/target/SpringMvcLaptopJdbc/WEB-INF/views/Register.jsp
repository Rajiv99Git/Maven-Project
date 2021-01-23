<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - Employee</title>
</head>
<body>
<h2>Proecessor Details</h2>
<form:form method="post" modelAttribute="Register" action="Register">
<table>
<tr>



<tr>
<td><form:label path="id">Id :</form:label></td>
<td><form:input path="id" /></td>
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
<td colspan="2"><input type="submit" value="Register" /></td>
</tr>
</table>
</form:form>
</body>
</html>
