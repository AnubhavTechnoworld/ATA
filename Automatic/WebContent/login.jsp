<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/animate.css">
  <link href="css/animate.min.css" rel="stylesheet">
</head>
<body>
<table>
<tr>
<td>Customer <input type="radio" name="user"/> &nbsp;
Administrator <input type="radio" name="user"/></td>
</tr>
	
	 <form:form id="loginForm" method="post" action="login" modelAttribute="credentialsBean">


			<tr>
			<td><form:label path="userID">Enter your user-name</form:label></td>
           <td><form:input id="userID" name="userID" path="userID" /></td>
		</tr>
		<tr>
            	<td><form:label path="userID">Please enter your password</form:label></td>

        	  <td><form:password id="password" name="password" path="password" /></td>
		<tr>
           <td> <input type="submit" value="Submit" /></td>
</tr>
       </form:form>
	
</table>
</body>
</html>