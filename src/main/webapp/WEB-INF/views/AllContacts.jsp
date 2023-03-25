<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="Link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllContacts</title>
</head>
<body>
	<h2>All Contacts</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>About</th>
		</tr>
		<c:forEach var="contacts" items="${contacts}">
			<tr>
				<td>${contacts.id}</td>
				<td>${contacts.firstName}</td>
				<td>${contacts.lastName}</td>
				<td>${contacts.email}</td>
				<td>${contacts.mobile}</td>
				<td>${contacts.source}</td>
				<td><a href="delete?id=${contacts.id}">Delete</a>
					<a href="update?id=${contacts.id}">Update</a>
					<a href="billing?id=${contacts.id}">Billing</a>
				</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>