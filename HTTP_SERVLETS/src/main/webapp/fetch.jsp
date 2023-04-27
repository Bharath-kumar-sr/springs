<%@page import="java.util.List"%>
<%@page import="dto.HEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <table border="1px">
		<%
		HEmployee employee = (HEmployee) request.getAttribute("key");
		%>
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
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getNumber()%></td>
			<td><%=employee.getDob()%></td>
			<td><%=employee.getGender()%></td>
			<td><%=employee.getCountry()%></td>
			<td><%=employee.getState()%></td>
			<td><%=employee.getSkills()%></td>
			<td><%=employee.getPhoto()%></td>
		</tr>




	</table> --%>
	<%=request.getParameter("id")%>
	<%=request.getParameter("name")%>
</body>
</html>