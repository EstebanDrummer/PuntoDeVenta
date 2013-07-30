<%-- 
    Document   : cliente1View
    Created on : 29-jul-2013, 19:45:43
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
        <h1>Ingresar nuevo cliente</h1>
       <spring:nestedPath path="cliente">
            <form action="" method="post">
                CId:
                <spring:bind path="CId">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                CNombre:
                <spring:bind path="CNombre">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                CTipo:
                <spring:bind path="CTipo">
                    <input type="text" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                    <input type="submit" value="CONSULTAR">
            </form>
        </spring:nestedPath>
    </body>
</html>
