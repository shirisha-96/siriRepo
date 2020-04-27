<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="updateAlien">
Id:<input type="text" name="aid" value=${alien.aid }><br>
Name:<input type="text" name="aname" value=${alien.aname }><br>
Tech:<input type="text" name="tech" value=${alien.tech }>
<input type="submit">
</form><br>
</body>
</html>