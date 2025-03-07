<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style/pure-min.css">

</head>
<body>

	<h1>Registrar alumno</h1>
	<!-- NO hace falta especificar la direccion principal del requestmapping -->
	<form:form action="registrar_alumno" modelAttribute="nuevoAlumno">
		
		<label for="nombreAlumno">Nombre:</label><br>
		<form:input id="nombreAlumno" path="nombre"/><!-- path -> hace referencia a los getters y setter en la clase Alumno -->
		<br>
		<label for="apellidoAlumno">Apellido:</label><br>
		<form:input id="apellidoAlumno" path="apellido"/>
		
		<button type="submit">Registrar</button>
		
	</form:form>

</body>
</html>