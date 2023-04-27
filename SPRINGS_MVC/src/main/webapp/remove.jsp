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
	<form:form action="removejs" modelAttribute="key">
		<h2>Delete</h2>
		<table>
			<tr>
				<h2>Enter the Id to remove from the database</h2>
				<td><label for="id">ID</label></td>
				<td><form:input type="text" path="id" placeholder="id" id="id" /></td>
			</tr>
			<tr>
				<td><form:button>Submit</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>