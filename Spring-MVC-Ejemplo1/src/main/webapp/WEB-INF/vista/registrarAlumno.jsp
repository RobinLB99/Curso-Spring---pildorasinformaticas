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
		<form:errors path="nombre" cssClass="error" />
		<br><br>
		<label for="apellidoAlumno">Apellido:</label><br>
		<form:input id="apellidoAlumno" path="apellido"/>
		<form:errors path="apellido" cssClass="error" />
		<br><br>
		<label for="edadAlumno">Edad:</label><br>
		<form:input id="edadAlumno" path="edad"/>
		<form:errors path="edad" cssClass="error" />
		<br><br>
		<label for="emailAlumno">Email:</label><br>
		<form:input id="emailAlumno" path="email"/>
		<form:errors path="email" cssClass="error" />
		<br><br>
		<label for="asignatura">Asignatura Optativa:</label><br>
		<form:select id="asignatura" path="optativa" multiple="true">
			<form:option value="Ajedrez" label="Ajedrez"/>
			<form:option value="Cultura" label="Cultura"/>
		</form:select>
		<br> <br>
		Ciudad de Estudios: <br>
		<form:radiobutton path="ciudadEstudio" value="Guayaquil"/> Guayaquil <br>
		<form:radiobutton path="ciudadEstudio" value="Quito"/> Quito <br>
		<form:radiobutton path="ciudadEstudio" value="Cuenca"/> Cuenca <br>
		<br>
		Idiomas a cursar: <br>
		<form:checkbox path="idiomas" value="Ingles"/> Ingles <br>
		<form:checkbox path="idiomas" value="Portugues"/> Portugues <br>
		<form:checkbox path="idiomas" value="Frances"/> Frances <br>
		
		<input type="submit" value="Enviar">
		
	</form:form>

</body>
</html>