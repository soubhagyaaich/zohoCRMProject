<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form action="saveRecords" method="post">
	<pre>
		First Name<input type="text" name="firstName"/><br>
		Last Name<input type="text" name="lastName"/><br>
		Email<input type="text" name="email"/><br>
		Mobile<input type="text" name="mobile"/><br>
		Source<select name="source">
			<option value="radio">Radio</option>
			<option value="newsPaper">News Paper</option>
			<option value="tradeShow">Trade Show</option>
			<option value="website">Website</option>
		</select><br>
		<input type="submit" value="Save"/>
	</pre>
	
</form>

</body>
</html>