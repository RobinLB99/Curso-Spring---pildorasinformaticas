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

	<h1>Formulario Alumno</h1>
	<form action="formulario_procesado2" method="get">
		<label for="nombre-alumno">Nombre del alumno</label><br>
		<input type="text" name="nombreAlumno" id="nombre-alumno">
		<br>
		<input type="submit" value="Enviar">
	</form>

</body>
</html>