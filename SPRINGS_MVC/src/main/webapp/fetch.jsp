<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="fetchjs" modelAttribute="key">
		<h2>Fetch</h2>
		<table>
			<tr>
				<h3>Enter the Id to Retrieve from the database</h3>
				<td><label for="id">ID</label></td>
				<td><form:input type="text" path="id" placeholder="id" id="id" /></td>
			</tr>
			<tr>
				<td><form:button>submit</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>