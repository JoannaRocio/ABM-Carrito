<%-- <%@page import="repositories.EmpleadosRepoSingleton"%>
<%@page import="models.Empleado"%>
<%@page import="repositories.interfaces.EmpleadoRepo"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%
/* 	EmpleadoRepo repo = EmpleadosRepoSingleton.getInstance();

	Empleado emple = repo.findById(2);
	
	request.setAttribute("empleado", emple); */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Empleado</title>
</head>
<body>

<h1>Empleado</h1>
<p>Nombre: <c:out value="${empleado.nombre}"></c:out> </p>
<p>Edad: <c:out value="${empleado.edad}"></c:out> </p>
<p>Sueldo: <c:out value="${empleado.sueldo}"></c:out> </p>

<form action="empleados" method="post">
	<input type="hidden" name="id" value="${empleado.id}">	
	<input type="hidden" name="accion" value="delete">
	<input type="submit" value="Eliminar empleado">
</form>


</body>
</html>