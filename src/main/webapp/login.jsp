<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<font color="red">${user} ${message}</font>
<body>
	<form action="<c:url value='j_spring_security_check'/>"method='POST'>
		Mail:<input type="text" name="mail"><br>
		password:<input type="password" name="pwd"><br>
		<input type="submit" value="login"><br>
	</form>

</body>
</html>