<%@page import="dto.HEmployee"%>
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
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>number</th>
			<th>dob</th>
			<th>gender</th>
			<th>country</th>
			<th>state</th>
			<th>skills</th>
			<th>photo</th>
		</tr>
		<%
		List<HEmployee> employees1 = (List<HEmployee>) request.getAttribute("key");
		for (HEmployee employee2 : employees1) {
		%>
		<tr>
			<td><%=employee2.getId()%></td>
			<td><%=employee2.getName()%></td>
			<td><%=employee2.getEmail()%></td>
			<td><%=employee2.getNumber()%></td>
			<td><%=employee2.getDob()%></td>
			<td><%=employee2.getGender()%></td>
			<td><%=employee2.getCountry()%></td>
			<td><%=employee2.getState()%></td>
			<td><%=employee2.getSkills()%></td>
			<td><%=employee2.getPhoto()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>