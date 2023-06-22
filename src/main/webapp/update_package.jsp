
<%@page import="org.intern.project.dto.Insert_dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="/	css/update.css">
</head>
<%
Insert_dto dto = (Insert_dto) request.getAttribute("update");
%>
<body>
	<div id="main">
		<form class="form" action="/admin/updateby/<%=dto.getId()%>" method="post" enctype="multipart/form-data" >
			<span class="title">Update</span>
			<label for="id" class="label">Travel id</label>
			<input type="number" id="id" name="id" required="required" class="input" readonly="readonly" value="<%=dto.getId()%>">
			<label for="package" class="label">Packages</label> 
			<input type="text" id="package" name="packages" required="required" class="input" value="<%=dto.getPackages()%>">
			<label for="photo" class="label">Photo</label>
			<input type="file" id="photo" name="photo" value="<%=dto.getPicture()%>"> 
			<label for="number" class="label">Cost</label> 
			<input type="number" id="password" name="cost" required="required" class="input" value="<%=dto.getCost()%>">
			<button type="submit" class="submit">Submit</button>
			<a href="/Admin_dashboard.jsp" id="b"><button type="button">Back</button></a>
		</form>
	</div>


</body>
</html>