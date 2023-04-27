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
	<form:form action="updatejs" modelAttribute="key">
		<h2>Update</h2>
		<table>
			<tr>
				<h3>Enter the Id</h3>
				<td><label for="id">ID</label></td>
				<td><form:input type="text" path="id" placeholder="id" id="id" /></td>
			</tr>
			<tr>
				<h3>Enter new mobile number</h3>
				<td><label for="mn">Mobile No</label></td>
				<td><form:input type="number" id="mn" path="number"
						placeholder="number" /></td>
			</tr>
			<tr>
				<td><form:button>save</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>