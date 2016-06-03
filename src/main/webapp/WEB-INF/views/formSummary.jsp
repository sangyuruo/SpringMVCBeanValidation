<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>User Saved Successfully</title>
</head>
<body>
<h3>
	User Saved Successfully.
</h3>

<strong>first name:${user.firstname}</strong><br>
<strong>last Name:${user.lastname}</strong><br>
<strong>Email:${user.email}</strong><br>
<strong>Age:${user.age}</strong><br>
<strong>Gender:${user.gender}</strong><br>
<strong>State:${user.state}</strong><br>
<strong>City:${user.city}</strong><br>
<strong>Country:${user.country}</strong><br>
<strong>Mobile Number:${user.mobileNumber}</strong><br>
</body>
</html>
