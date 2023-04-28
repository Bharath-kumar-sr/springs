<%@page import="dto.BookMyShowAccount"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>name</th>
			<th>phone</th>
			<th>mail</th>
			<th>password</th>
		</tr>
		<%
		List<BookMyShowAccount> bms = (List<BookMyShowAccount>) request.getAttribute("key");
		for (BookMyShowAccount details : bms) {
		%>
		<tr>
			<td><%=details.getName()%></td>
			<td><%=details.getPhone()%></td>
			<td><%=details.getMail()%></td>
			<td><%=details.getPassword()%></td>

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>