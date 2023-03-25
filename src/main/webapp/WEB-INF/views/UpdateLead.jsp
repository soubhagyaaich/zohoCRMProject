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
<h1>Update Lead</h1>
<form action="updateLead" method="post">
	<pre>
	<input type="hidden" name="id" value="${findByLeadId.id}"/>
		First Name<input type="text" name="firstName" value="${findByLeadId.firstName}"/><br>
		Last Name<input type="text" name="lastName" value="${findByLeadId.lastName}"/><br>
		Email<input type="text" name="email" value="${findByLeadId.email}"/><br>
		Mobile<input type="text" name="mobile" value="${findByLeadId.mobile}"/><br>
		Source<select name="source" >
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