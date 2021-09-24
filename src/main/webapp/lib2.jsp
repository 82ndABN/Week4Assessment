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
	<title>Lib 2</title>
</head>

<body>
	<p>Billy liked to play with his ${wordGroup.getNounA()}.<br />
		One day he lost it at the ${wordGroup.getNounB()}.<br />
		Ever since then, he ${wordGroup.getVerbA()}s himself to sleep.<br />
	</p>
</body>

</html>