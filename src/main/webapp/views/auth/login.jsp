<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="auth" method="post">
			<p>
				<label>Usuario:</label>
				<input type="text" name="username" placeholder="Ingrese su usuario"/>
		<%-- 		<select name="empleado_id">
						<c:forEach var="empleado" items="${empleados}">
							<option value="${empleado.id}">${empleado.nombre}</option>
						</c:forEach>
				</select> --%>
			</p>
			<p>
				<label>Contraseña: </label>
				<input type="password" name="pass" placeholder="Ingrese su contraseña"/>
			</p>
			 <input type="submit" value="Ingresar"/>
		</form>
	</div>
</body>
</html>