<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<form action="home" method="get">
		<table>
			<tr>
				<td>Welcome ${firstname}</td>
			</tr>
			<tr>
			</tr>
			<tr>
			</tr>
			<tr>
				<td><a href="home">Home</a></td>
			</tr>
		</table>
	</form>
</body>
</html>