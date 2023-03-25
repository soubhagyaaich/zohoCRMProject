<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Record</title>
</head>
<body>
	<h1>Recent Save Record</h1>
	Id :${lead.id}<br>
	First Name: ${lead.firstName}<br>
	Last Name: ${lead.lastName}<br>
	Email: ${lead.email}<br>
	Mobile: ${lead.mobile}<br>
	Source: ${lead.source}<br>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${lead.email}"/>
		<input type="submit" value="SendEmail">
	</form>
	<br>
	<form action="convertRecord" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Convert">
	</form>
	<br>
	<form action="deleteRecord" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Delete">
	</form>
	<br>
	<form action="updateRecord" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Update">
	</form>
</body>
</html>