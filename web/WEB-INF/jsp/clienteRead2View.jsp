<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:forEach items="${clienteMensaje}" var="cliente">
           ID cliente ${cliente.CId} ${cliente.CNombre} ${cliente.CTipo} <br>
        </c:forEach>
        <a href="index.htm">Inicio</a>
    </body>
</html>
