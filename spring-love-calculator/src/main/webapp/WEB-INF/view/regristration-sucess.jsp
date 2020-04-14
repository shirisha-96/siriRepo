<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>your registration is successful</h1>
<h1>The details entered by you are : </h1>
User : ${userReg.name }<br/>
User Name : ${userReg.userName }<br/>
Password : ${userReg.password }<br/>
Country : ${userReg.countryName }<br/>
Hobbies :
<c:forEach var="hobby" items="${userReg.hobbies }"> 
  ${hobby }
  </c:forEach>
<br/>
Gender : ${userReg.gender }<br/>
</body>
</html>