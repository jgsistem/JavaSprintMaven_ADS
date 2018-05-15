<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Usuario</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="<c:url value='/resources/images/favicon.ico'/>" type="image/x-icon" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">

        <jsp:include page="Menu.jsp">
            <jsp:param name="opcion" value="crear" />
        </jsp:include>

        <form action="crearUsuario" method="post">
            <input type="hidden" name="operacion" value="crear">
            <div class="form-group">
                <label for="usuario">Nombre</label>
                <input type="text" class="form-control" id="usuario" name="usuario" placeholder="Ingrese Nombre">
            </div>
            <div class="form-group">
                <label for="correo">Correo</label>
                <input type="text" class="form-control" id="correo" name="correo" placeholder="Ingrese Correo">
            </div>
            <div class="form-group">
                <label for="clave">Clave</label>
                <input type="password" class="form-control" id="clave" name="clave" placeholder="Ingrese Clave">
            </div>
           
            <br />
            <button type="submit" class="btn btn-primary">Grabar</button>
        </form>
    </div>
</body>
</html>