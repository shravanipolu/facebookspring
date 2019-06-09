<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red"> ${message} <br>${mobilemessage} <br>${mailmessage}</font>
<form action="registerUser">
Name:<input type="text" name="name"><br></br>
Mobile:<input type="text" name="mob"><br></br>
Mail:<input type="text" name="mail"><br></br>
City:<input type="text" name="city"><br></br>
password:<input type="password" name="pwd"><br></br>
<input type="submit" value="enter"><br></br>
</form>
<a href="login.jsp">clickhere</a>for login
<form action="value">
<input type="submit" value="action"><br></br>
</form>
</body>
</html>