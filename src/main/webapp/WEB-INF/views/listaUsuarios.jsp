<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page errorPage="errorPage.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Sistema de Usuarios</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/resources/images/favicon.ico'/>" type="image/x-icon" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="container">

        <jsp:include page="Menu.jsp" >
            <jsp:param name="opcion" value="listar" />
        </jsp:include>

        <table class="table table-striped table-hover table-bordered">
            <thead style="text-align:center;">
                <tr>
                    <th style="text-align:center;">Id</th>
                    <th style="text-align:center;">Nombre</th>
                    <th style="text-align:center;">Correo</th>
                     <th style="text-align:center;">Clave</th>
                    <th style="text-align:center;">#</th> 
                     <th style="text-align:center;">#</th> 
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaUsuarios}" var="usuario">
                    <tr>
                         <td><c:out value="${usuario.id_Usuario}" /></td>
                        <td><c:out value="${usuario.nomBre_Usuario}" /></td> 
                        <td><c:out value="${usuario.deCorre_Usuario}" /></td> 
                             <td><c:out value="${usuario.caContra_Usuario}" /></td>
<%--                         <td><a href="mostrarUsuario?id=${usuario.ID_USUARIO}">Modificar</a></td>  --%>
<%--                         <td><a href="eliminarUsuario?id=${usuario.ID_USUARIO}">Eliminar</a></td>  --%>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>

