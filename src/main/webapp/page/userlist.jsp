<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getAll() {
		var name = document.getElementsByName("uid").length;
		if (name == 0) {
			window.location.href = '/action/userlist';
		}
	}
</script>
</head>
<body onload="getall()">
	<table width="90%" border="1">
		<tr>
			<td><input type="checkbox" value=""></td>
			<td>id</td>
			<td>username</td>
			<td>password</td>
			<td>realName</td>
			<td>sex</td>
		</tr>
		<c:forEach items="${ userlist}" var="user">
			<tr>
				<td><input type="checkbox" name="uid" value="${user.id }"></td>
				<td>${ user.id }</td>
				<td>${ user.username }</td>
				<td>${ user.password }</td>
				<td>${ user.realName }</td>
				<td>${ user.sex}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>