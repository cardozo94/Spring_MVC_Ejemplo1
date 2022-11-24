<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario de Registro</title>
	</head>
	<body>
		<form:form action="procesarFormulario" modelAttribute="alumno">
			Nombre: <form:input path="nombre"/>
			<form:errors path="nombre" style="color:red"/>
			<br/><br/><br/>
			Apellido: <form:input path="apellido"/>
			<br/><br/><br/>
			Edad: <form:input path="edad"/>
			<form:errors path="edad" style="color:red"/>
			<br/><br/><br/>
			Email: <form:input path="email"/>
			<form:errors path="email" style="color:red"/>
			<br/><br/><br/>
			Código Postal: <form:input path="codigoPostal"/>
			<form:errors path="codigoPostal" style="color:red"/>
			<br/><br/><br/>
			Asignaturas Optativas:<br/>
			
			<form:select path="optativa" multiple="true">
				<form:option value="Diseño" label="Diseño"/>
				<form:option value="Karate" label="Karate"/>
				<form:option value="Comercio" label="Comercio"/>
				<form:option value="Danza" label="Danza"/>
			</form:select>
			<br/><br/><br/>
			Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
			Madrid<form:radiobutton path="ciudadEstudios" value="Madrid"/>
			Valencia<form:radiobutton path="ciudadEstudios" value="Valencia"/>
			Bilbao<form:radiobutton path="ciudadEstudios" value="Bilbao"/>
			<br/><br/><br/>
			Inglés<form:checkbox path="idiomas" value="Inglés"/>
			Francés<form:checkbox path="idiomas" value="Francés"/>
			Aleman<form:checkbox path="idiomas" value="Aleman"/>
			Chino<form:checkbox path="idiomas" value="Chino"/>
			<br/><br/><br/>
			<input type="submit" value="Enviar">
		</form:form>
	</body>
</html>