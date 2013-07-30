<%-- 
    Document   : clienteUpdate1
    Created on : 30-jul-2013, 12:56:26
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
        <h1>Actualizar información empleado</h1>
          <spring:nestedPath path="cliente">
            <form action="" method="post">
                CId:
                <spring:bind path="CId">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                
                DATOS A ACTUALIZAR:<br>
                Nombre:
                <spring:bind path="CNombre">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                Tipo:
                <spring:bind path="CTipo">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                    <input type="submit" value="ACTUALIZAR">
            </form>
        <a href="index.htm">Inicio</a>
        </spring:nestedPath>
    </body>
</html>
