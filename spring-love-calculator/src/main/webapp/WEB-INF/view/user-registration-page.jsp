<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration</title>
</head>
<body>
<h1 align="center">please register here</h1>
<form:form action="registration-sucess" method="GET" modelAttribute="userReg">
<div align="center">
<label>User :</label>
<form:input path="name"/>
<br/>
<label>User Name :</label>
<form:input path="userName"/>
<br/>
<label>Password : </label>
<form:password path="password"/>
<br/>
<label>Country : </label>
<form:select path="countryName">
<form:option value="Ind" label="India"></form:option>
<form:option value="usa" label="USA"></form:option>
<form:option value="pak" label="Pakistan"></form:option>
<form:option value="sri" label="Srilanka"></form:option>
</form:select>
<br/>
<label>Hobby : </label>
Cricket : <form:checkbox path="hobbies" value="cricket"/>
Reading : <form:checkbox path="hobbies" value="reading"/>
Tennis : <form:checkbox path="hobbies" value="tennis"/>
Programming : <form:checkbox path="hobbies" value="programming"/>
ThrowBall : <form:checkbox path="hobbies" value="throwball"/>
<br/>
<label>Gender : </label>
Male<form:radiobutton path="gender" value="male"/>
Female<form:radiobutton path="gender" value="female"/><br/>
<input type="submit" value="register"/>
</form:form>
</div>
</body>
</html>