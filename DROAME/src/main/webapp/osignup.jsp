<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>
			<c:if test="${not empty message }">
				<c:out value="${message }"></c:out>
			</c:if>
		</p>
	</div>
	<form:form action="signupjs" modelAttribute="signup"
		onsubmit="return verifyPassword()">
		<h1>CREATE ACCOUNT</h1>
		<table>
			<tr>
				<td><label for="a">NAME :</label></td>
				<td><form:input type="text" path="name" id="a"
						placeholder="name" /></td>
			</tr>
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
				<td><label for="e">CONFIRM PASSWORD :</label></td>
				<td><form:input type="password" path="confirmpassword" id="e"
						placeholder="password" value="" /></td>
			</tr>

			<tr>
				<td><form:button value="">SIGN UP
					</form:button></td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript">
		function verifyPassword() {
			var a = document.getElementById("d").value;
			var b = document.getElementById("e").value;
			if (a == b) {
				return true;
			} else {
				alert("password donot match.!")
				return false;
			}
		}
	</script>
</body>
</html>