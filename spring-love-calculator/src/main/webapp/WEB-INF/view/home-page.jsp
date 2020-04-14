<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red;
position: fixed;
text-align: left;
margin-left: 30px;
}
</style>
<script type="text/javascript">

function validateUsername() {
	
	var username=document.getElementById('yn').value;
	if(username.length<1)
		{
		alert("your name should have atleast one char");
		return false;
		}
	else{
		return true;
	}
}
</script>
</head>
<body>

<h1 align="center">Love Calculator</h1>
<hr/>
<form:form action="process-homepage" method="get" modelAttribute="userinfo">
<div align="center">
<p>
<label for="yn">Your Name:</label>
<form:input id="yn" path="username"/>
<form:errors path="username" cssClass="error"></form:errors>
</p>
<p>
<label for="cn">Crush Name:</label>
<form:input id="cn" path="crushname"/>
<form:errors path="crushname" cssClass="error"></form:errors>
</p>
<p>
<form:checkbox path="termsandcondition" id="check"/>
<label>I agree that this is for fun</label>
<form:errors path="termsandcondition" cssClass="error"></form:errors>
</p>
<input type="submit" value="calculate"/>
</div>
</form:form>
</body>
</html>