<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="signup.css">
<title>Insert title here</title>
</head>
<div class="brand">
	<h1>BOOK MY SHOW</h1>
	<!-- <p>one click from the place you live and you can enjoy the show</p> -->
</div>
<div class="main">
	<form action="signup" method="post" onsubmit="return verifyPassword()">
		<h1>CREATE ACCOUNT</h1>

		<label for="a">NAME :</label> <input type="text" name="name" id="a"
			placeholder="name"> <label for="b">EMAIL :</label> <input
			type="text" name="mail" id="b" placeholder="abc@gmail.com"> <label
			for="c">PHONE :</label> <input type="text" name="phone" id="c"
			placeholder="phone"> <label for="password">PASSWORD :</label>
		<input type="password" name="password" id="password"
			placeholder="password" value=""><label for="confirmpassword">CONFITM
			PASSWORD :</label> <input type="password" name="confirmpassword"
			id="confirmpassword" placeholder="confirmpassword" value=""><br>
		<span id="message" style="color: red"> </span>

		<button value="">SIGN UP</button>


	</form>
</div>
<script src="script.js"></script>
</body>
</html>