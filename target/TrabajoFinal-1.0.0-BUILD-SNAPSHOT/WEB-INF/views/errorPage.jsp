<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Show Error Page</title>
<link rel="icon" href="<c:url value='/resources/images/favicon.ico'/>" type="image/x-icon" />
</head>
<body>
  <h1>Opps...</h1>
  <p>Sorry, an error occurred.</p>
  <p>Here is the exception stack trace:</p>
  <pre>
  <c:forEach var="trace" items="${pageContext.exception.stackTrace}">
    <p>${trace}</p>
  </c:forEach>
</pre>
</body>
</html>