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
	<form:form action="signupjs" modelAttribute="key"
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
				<td><label for="c">PHONE :</label></td>
				<td><form:input type="text" path="number" id="c"
						placeholder="phone" /></td>
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
	<!-- <script src="javascript.js"></script> -->
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