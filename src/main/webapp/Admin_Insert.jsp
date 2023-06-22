<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="/css/insert.css">
</head>
<body>
	<div>
		<form class="form" action="admin/insert" method="post" enctype="multipart/form-data">
			<span class="title">Insert</span>  
			<label for="package" class="label">Packages</label>
			<input type="text" id="package" name="packages" required="required" class="input">
			<label for="photo" class="label">Photo</label>
			<input type="file" id="photo" name="photo"> 
			<label for="number" class="label">Cost</label> <input type="number"
			id="password" name="cost" required="" class="input">
			<button type="submit" class="submit">Submit</button>
			<a href="/Admin_dashboard.jsp" id="b"><button type="button" class="submit">
			Back</button></a>
		</form>
	</div>
</body>
</html>