<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Inicio de Sesion</title>
        <link href="<c:url value='/resources/images/favicon.ico'/>" rel="icon" type="image/x-icon" />
        <link href="<c:url value='/resources/css/bootstrap.css' />"  rel="stylesheet" />
        <link href="<c:url value='/resources/css/app.css' />" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
    </head>

    <body>
        <div id="mainWrapper">
            <div class="login-container">
                <div class="login-card">
                    <div class="login-form">
                        <h3><strong>Ingreso al Sistema</strong></h3>
                        <c:url var="loginUrl" value="/login" />
                        <form action="${loginUrl}" method="post" class="form-horizontal">
                            <c:if test="${param.error != null}">
                                <div class="alert alert-danger">
                                    <p>Usuario y/o Clave Inv&aacute;lido.</p>
                                </div>
                            </c:if>
                            <c:if test="${param.logout != null}">
                                <div class="alert alert-success">
                                    <p>Sesi&oacute;n Finalizada Exitosamente.</p>
                                </div>
                            </c:if>
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                                <input type="text" class="form-control" id="username" name="username" placeholder="Ingrese Usuario" required>
                            </div>
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                                <input type="password" class="form-control" id="password" name="password" placeholder="Ingrese Clave" required>
                            </div>

                            <div class="form-actions" style="margin-top:20px;">
                                <input type="submit"
                                    class="btn btn-block btn-primary btn-default" value="Ingresar">
                            </div>
                            <p>The time on the server is ${usuario}.</p>
                        </form>

                    </div>
                </div>
            </div>
        </div>

    </body>
</html>