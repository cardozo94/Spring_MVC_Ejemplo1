<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Confirmación de registro</title>
	</head>
	<body>
		El alumno con nombre <strong>${alumno.nombre}</strong> y apellido <strong>${alumno.apellido}</strong>, 
		edad <strong>${alumno.edad}</strong>, E-Mail <strong>${alumno.email}</strong>
		 y Código postal <strong>${alumno.codigoPostal}</strong>  se ha registrado con éxito.
		<br/>
		La asignatura escogida es <strong>${alumno.optativa}</strong>
		<br/>
		La ciudad escogida es <strong>${alumno.ciudadEstudios}</strong>
		<br/>
		Los idiomas escogidos por el alumno son <strong>${alumno.idiomas}</strong>
	</body>
</html>