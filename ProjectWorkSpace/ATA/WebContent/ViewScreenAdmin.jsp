<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail View Of Admin</title>
</head>
<body>
<h1>Admin Details</h1>
<jsp:useBean id="Admin" class="com.training.ata.bean.RouteBean" scope="session"></jsp:useBean>
<table border="1">
		<th>
			<td>Route Id</td>		
			<%-- <td>${Admin.routeID }</td> --%>	
		 </th> 
		
		<th>
			<td>Source</td>		
			<%-- <td>${Admin.source }</td> --%>
		 </th>
				
		<th>
			<td>Destination</td>		
			<%-- <td>${Admin.destination }</td> --%>
		 </th>
		 	 
		<th>
			<td>Distance</td>		
			<%-- <td>${Admin.distance }</td> --%>
		</th>
		 
		
		<th>
			<td>Travel Duration</td>	
			<%-- <td>${Admin.travelDuration }</td> --%>
		</th>
</table>


</body>
</html>