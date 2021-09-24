<!--
 * @author - Aaron Barker
 * CIS175 - Fall 2021
 * Sept 23, 2021
 */-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Barker's MadLibs 2</title>
</head>

<body>
	<h1 style="color: gray; text-align: center; font-family: Arial, Helvetica,
		sans-serif;">Welcome to Barker's 
		<span style="color: rosybrown">MadLibs</span> madness! 
		<span style="font-size: 20px">p 2/2</span>
	</h1>
		
	<form action="getInputServlet2" method="post">
		<div style="margin-bottom: 10px">Enter a noun:
		<input type="text" name="nounA" size="20"></div>
		
		<div style="margin-bottom: 10px">Enter a noun (place):
		<input type="text" name="nounB" size="20"></div>
		
		<div style="margin-bottom: 10px">Enter a (present tense) verb:
		<input type="text" name="verbA" size="20"></div>
		
		<input type="submit" value="Submit Entries"/>
	</form>
		
</body>

</html>