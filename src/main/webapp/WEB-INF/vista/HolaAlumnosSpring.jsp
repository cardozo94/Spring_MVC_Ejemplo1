<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Respuesta Saludo</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
	</head>
	<body>
		<h1>Hola ${ param.nombreAlumno}. Bienvenido al curso de Spring</h1>
		<p>
			<br/>
			<h2>Atención a todos!!!</h2>
			${mensajeFinal}
		</p>
		<img alt="foto" src="${pageContext.request.contextPath}/recursos/imagenes/JeanOculto.png">	
	</body>
</html>