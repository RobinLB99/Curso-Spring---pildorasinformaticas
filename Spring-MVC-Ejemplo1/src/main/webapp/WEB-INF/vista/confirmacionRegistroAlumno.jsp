<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de registro</title>
</head>
<body>

	<h3>Registro exitoso!</h3>
	<p>El alumno ${nuevoAlumno.nombre} ${nuevoAlumno.apellido}, de edad ${nuevoAlumno.edad}, con email ${nuevoAlumno.email}, se registro con exito con la asignatura ${nuevoAlumno.optativa} con cede de estudio ${nuevoAlumno.ciudadEstudio } e idiomas a tomar ${nuevoAlumno.idiomas}</p>

</body>
</html>