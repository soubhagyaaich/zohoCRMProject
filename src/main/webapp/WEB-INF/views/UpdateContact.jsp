<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h1>Update Contact</h1>
<form action="updateRecords" method="post">
	<pre>
	<input type="hidden" name="id" value="${contact.id}"/>
		First Name<input type="text" name="firstName" value="${contact.firstName}"/><br>
		Last Name<input type="text" name="lastName" value="${contact.lastName}"/><br>
		Email<input type="text" name="email" value="${contact.email}"/><br>
		Mobile<input type="text" name="mobile" value="${contact.mobile}"/><br>
		Source<select name="source">
			<option value="radio">Radio</option>
			<option value="newsPaper">News Paper</option>
			<option value="tradeShow">Trade Show</option>
			<option value="website">Website</option>
		</select><br>
		<input type="submit" value="Update"/>
	</pre>
	
</form>

</body>
</html>