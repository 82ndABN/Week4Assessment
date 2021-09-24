<!--
 * @author - Aaron Barker
 * CIS175 - Fall 2021
 * Sept 23, 2021
 */-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Lib 1</title>
</head>

<body>
	<p>Humpty Dumpty sat on a ${wordGroup.getNounA()}<br />
		Humbpy Dumpty had a ${wordGroup.getAdjA()} fall<br />
		All the king's ${wordGroup.getNounB()} and all the king's ${wordGroup.getNounC()}<br />
		Counldn't put poor Humpty together again<br />
	</p>
	
	<a href="index2.jsp">One more for fun!</a>
</body>

</html>