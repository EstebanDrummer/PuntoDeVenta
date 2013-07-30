<%-- 
    Document   : clienteRead1View
    Created on : 29-jul-2013, 23:37:11
    Author     : yepesk8r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <spring:nestedPath path="cliente">
            <form action="" method="post">
                    <input type="submit" value="Lista">
            </form>
        </spring:nestedPath>
    </body>
</html>
