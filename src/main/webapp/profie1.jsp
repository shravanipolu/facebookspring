<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function editUser(mail) {
		alert('triggered edit button' + mail);
		document.forms[0].action="${pageContext.request.contextPath}/editView?mailIdToEdit="+mail;
		document.forms[0].method="post";
		document.forms[0].submit();	
		
		
		}
	function deleteUser(mail) {
		alert('triggered delete button' + mail);
		document.forms[0].action="${pageContext.request.contextPath}/deleteUser?mailIdToDelete="+mail;
		document.forms[0].method="post";
		document.forms[0].submit();	
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<font color="green">welcome ${user}successfully logged in</font> ${msg}
	<a href="<c:url value="/logout"/>">logout</a>
	<table border=1>
		<tr>
			<th>name</th>
			<th>Mail</th>
			<th>password</th>
			<th>mobile</th>
			<th>city</th>
		</tr>
		<c:forEach items="${userList}" var="userObject">
			<tr>
				<td>${userObject.name}</td>

				<td>${userObject.mail}</td>

				<td>${userObject.pwd}</td>

				<td>${userObject.mob}</td>

				<td>${userObject.city}</td>
				<td><input type="button"
					onclick="editUser('${userObject.mail}')" value="Edit"></td>
				<td><input type="button"
					onclick="deleteUser('${userObject.mail}')" value="Delete"></td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>