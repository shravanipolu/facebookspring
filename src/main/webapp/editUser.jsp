<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update user details</title>
</head>
<body>
<h3>Update Details</h3>
<form action="updateUser">
Name:<input type="text" name="name" value="${editList.name}"><br></br>
Mobile:<input type="text" name="mob" value="${editList.mob}"><br></br>
Mail:<input type="text" name="mail" value="${editList.mail}"><br></br>
City:<input type="text" name="city"value="${editList.city}"><br></br>
password:<input type="password" name="pwd" value="${editList.pwd}"><br></br>
<input type="submit" value="Update"><br>
</form>

</body>
</html>