<%-- 
    Document   : formView
    Created on : 23-jul-2013, 19:13:09
    Author     : yepesk8r
--%>
<%@taglib uri= "http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenid@s</title>
    </head>
    <body>
        <h1>Entre su nombre</h1>
        <spring:nestedPath path="nombre">
            <form action="" method="post">
                Name:
                <spring:bind path="valor">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>