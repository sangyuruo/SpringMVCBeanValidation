<%@taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<springForm:form method="POST" commandName="user" action="/Bean-Validation/formTwo">
		<table>
			<tr>
				<td>State:</td>
				<td><springForm:input path="state" /></td>
				<td><springForm:errors path="state" cssClass="error" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><springForm:input path="city" /></td>
				<td><springForm:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><springForm:input path="country" /></td>
				<td><springForm:errors path="country" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><springForm:input path="mobileNumber" /></td>
				<td><springForm:errors path="mobileNumber" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Save"></td>
			</tr>
		</table>

	</springForm:form>
</body>
</html>