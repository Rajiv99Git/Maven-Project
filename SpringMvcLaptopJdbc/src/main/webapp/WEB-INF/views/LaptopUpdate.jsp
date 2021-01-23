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
<h2>laptop details</h2>

<form:form method="post" action="/SpringMvcLaptopJdbc/LaptopUpdate">
<table>


<tr>
<td><form:label path="serial_no">serial_no</form:label></td>
<td><form:input path="serial_no" /></td>
</tr>
<tr>
<td><form:label path="graphic_card">graphic_card</form:label></td>
<td><form:input path="graphic_card" /></td>
</tr>
<tr>
<td><form:label path="ram"> ram </form:label></td>
<td><form:input path="ram" /></td>
</tr>

<tr>
<td><form:label path="company"> company</form:label></td>
<td><form:input path="company" /></td>

</tr>
<tr>
<td colspan="2"><input type="submit" value="submit">
<a href="index.jsp">back</a>

</tr>

</table>

</form:form>
</body>
</html>