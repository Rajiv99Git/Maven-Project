<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="put" modelAttribute="processor" action="ProecessorUpdate">
<table>
<tr>
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