<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="/test3/testButton" method="post">
	<h1>
		Hello world!  
	</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<input type="submit" value="testbtn">
</form>
</body>
</html>
