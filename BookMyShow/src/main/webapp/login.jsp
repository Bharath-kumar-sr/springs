<%@page import="dto.BookMyShowAccount"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="login.css">
<title>Insert title here</title>
</head>
<body>
	<div class="brand">
		<H1>BOOK MY SHOW</H1>
	</div>
	<div class="main">
		<form action="login" method="post">
			<h1>LOGIN</h1>

			<label for="b">EMAIL :</label> <input type="text" name="mail" id="b"
				placeholder="abc@gmail.com"> <label for="a">PASSWORD
				:</label> <input type="password" name="password" id="a"
				placeholder="password">

			<button>Login</button>
			<p>
				not a member? <a href="signup.jsp">sign up</a>
			</p>
		</form>
	</div>

	<%
	if (request.getAttribute("message") != null) {
	%>

	<div class="incorrect">
		<p>incorrect username or password</p>
	</div>
	<%
	}
	%>



</body>
<script src="script.js"></script>
</html>