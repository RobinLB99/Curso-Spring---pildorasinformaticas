<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style/pure-min.css">
</head>
<body>

	<img alt="spring-logo" src="${pageContext.request.contextPath}/static/img/spring-logo.png" width="300px">

	<p>Hola, ${param.nombreAlumno}! Bienvenido al curso de Spring.</p>
	<h2>Atensión a todos!</h2>
	<p>${mensajeClaro}</p>
	
</body>
</html>