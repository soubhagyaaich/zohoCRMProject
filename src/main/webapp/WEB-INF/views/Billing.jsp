<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h1>Billing Form</h1>
<form action="billingForm" method="post">
	<pre>
		Id<input type="hidden" name="id" value="${findByContact.id}"/>
		First Name<input type="text" name="firstName" value="${findByContact.firstName}"/><br>
		Last Name<input type="text" name="lastName" value="${findByContact.lastName}"/><br>
		Email<input type="text" name="email" value="${findByContact.email}"/><br>
		Mobile<input type="text" name="mobile" value="${findByContact.mobile}"/><br>
		AdharNo<input type="text" name="adharNo"/><br>
		At/Post<input type="text" name="ap"/><br>
		District<input type="text" name="district"/><br>
		State<input type="text" name="state"/><br>
		Regst.No<input type="text" name="regstNo"/><br>
		
		Source<select name="source">
			<option value="radio">Radio</option>
			<option value="newsPaper">News Paper</option>
			<option value="tradeShow">Trade Show</option>
			<option value="website">Website</option>
		</select><br>
		<input type="submit" value="Generated"/>
	</pre>
	
</form>

</body>
</html>