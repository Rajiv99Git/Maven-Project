<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="FindById" action="FindById">
<table>
<tr>



<tr>
<td><form:label path="id">Id :</form:label></td>
<td><form:input path="id" /></td>
</tr>
<tr>

<tr>
<td colspan="2"><input type="submit" value="findId" /></td>
</tr>
</table>
</form:form>
</body>
</html>