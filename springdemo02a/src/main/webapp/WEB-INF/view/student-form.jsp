<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Hello world - Student Form-</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student" method="GET">
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
	
		<input type="submit" value="Submit"/>
	</form:form>
</body>


</html>