<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/temperature/su">

<c:forEach var="list" items="${list }">

pid:<input type="text" name="paramid" value="${list.paramid }" >
cid:<input type="text" name="clientid">
date:<input type="text" name="dom" value="${list.dom }" >
uid:<input type="text" name="unitid">
val:<input type="text" name="tempval">
<input type="submit" value="update">

</c:forEach>
</form>

</body>
</html>