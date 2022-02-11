<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventory Management</title>
</head>
<body>
	<h1>Inventory Management</h1><br>
	<form action="inventory" method="get">
		<label for="cusname">Customer Name: </label>
		<input type="text" name="cusname" id="cusname"><small style="color:red;">${error}</small><br>
		<label for="itemname">Item Name: </label>
		<input type="text" name="itemname" id="itemname"><br>
		<label for="itemqty">Item Quantity: </label>
		<input type="number" name="itemqty" id="itemqty"><br>
		<label for="itemprice">Item Price: </label>
		<input type="number" name="itemprice" id="itemprice"><br>
		<label for="itemdescription">Item description: </label>
		<input type="text" name="itemdescription" id="itemdescription"><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>