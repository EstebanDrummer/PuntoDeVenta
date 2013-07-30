<%-- 
    Document   : clienteDelete1View
    Created on : 30-jul-2013, 14:27:37
    Author     : yepesk8r
--%>

<%@taglib uri= "http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese ID del cliente a borrar</h1>
               <spring:nestedPath path="cliente">
            <form action="" method="post">
                CId:
                <spring:bind path="CId">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                <input type="submit" value="CONSULTAR">
            </form>
        </spring:nestedPath>
    </body>
</html>
