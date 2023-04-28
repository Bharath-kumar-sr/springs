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
	<form:form action="loginjs"  modelAttribute="login">
		<h1>LOGIN ACCOUNT</h1>
		<table>
			<tr>
				<td><label for="b">EMAIL :</label></td>
				<td><form:input type="text" path="email" id="b"
						placeholder="abc@gmail.com" /></td>
			</tr>
			<tr>
				<td><label for="d">PASSWORD :</label></td>
				<td><form:input type="password" path="password" id="d"
						placeholder="password" value="" /></td>
			</tr>
			<tr>
				<td><form:button value="">LOGIN
					</form:button></td>
			</tr>
		</table>
	</form:form>
	<%
	String s = (String) request.getAttribute("key");
	%>
</body>
</html>