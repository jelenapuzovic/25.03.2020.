<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>
	This is add user .jsp page!
	<br /> ${action}
	
	
	<form:form action="/springMvcConfiguration03/users/save" method="post" modelAttribute="user">
		<table>
			<tbody>
			<tr>
				<td>Username:</td>
				<td>
					<form:input path="username" id="username"/>
				</td>
			</tr>
				<tr>
				<td>Password:</td>
				<td>
				<form:input path="password" id="password"/>
				</td>
			</tr>
			<tr>
				<td>First name:</td>
				<td>
				<form:input path="firstname" id="firstname"/>
				</td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td>
				<form:input path="lastname" id="lastname"/>
				</td>
			</tr>
			
			<tr>
				<td>
				<button id="save">Save</button>
				 </td>
			</tr>
		</tbody>
		</table>
	
	</form:form>
</body>
</html>