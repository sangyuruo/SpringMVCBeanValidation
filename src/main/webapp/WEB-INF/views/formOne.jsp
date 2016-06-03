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
<springForm:form method="POST" commandName="user" action="/Bean-Validation/formOne">
		<table>
			<tr>
				<td>First Name:</td>
				<td><springForm:input path="firstname" /></td>
				<td><springForm:errors path="firstname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><springForm:input path="lastname" /></td>
				<td><springForm:errors path="lastname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><springForm:input path="email" /></td>
				<td><springForm:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><springForm:input path="age" /></td>
				<td><springForm:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><springForm:select path="gender">
						<springForm:option value="" label="Select Gender" />
						<springForm:option value="MALE" label="Male" />
						<springForm:option value="FEMALE" label="Female" />
					</springForm:select></td>
				<td><springForm:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Save"></td>
			</tr>
		</table>

	</springForm:form>
</body>
</html>