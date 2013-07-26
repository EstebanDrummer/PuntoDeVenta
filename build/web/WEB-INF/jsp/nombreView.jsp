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
                    <input type="text" name="${status.expression}" value="${status.value}"> <br><br><br>
                </spring:bind>
              <h1>  VENTA DE TIQUETES: </h1>
              
                <!-- ciudad Origen -->
                Ciudad Origen:<br>
                <spring:bind path="cOrigen">
                <select name="${status.expression}">
                    <option <c:if test = "${status.value == 'bog'}"></c:if>Bogota </option>
                    <option <c:if test = "${status.value == 'Med'}"></c:if>Medellin</option>
                </select> 
                </spring:bind>
                <!-- Calendar ida -->
                <spring:bind path="fIda">
                Fecha ida: <input type="date" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <br>
                Ciudad Destino:<br>

               <spring:bind path="cDestino">
                <select name="${status.expression}">
                    <option <c:if test = "${status.value == 'JFK'}"></c:if>New York (JFK)</option>
                    <option <c:if test = "${status.value == 'ORY'}"></c:if>Paris</option>
                </select> 
                </spring:bind>
                <!-- Calendar regreso -->
                <spring:bind path="fRegreso">
                Fecha de regreso: <input type="date" name="${status.expression}" value="${status.value}"> <br>
                </spring:bind>
                Cantidad de viajeros:
                <spring:bind path="cantidad">
                <select name="${status.expression}">
                    <option <c:if test = "${status.value == '1'}"></c:if>1</option>
                    <option <c:if test = "${status.value == '2'}"></c:if>2</option>
                    <option <c:if test = "${status.value == '3'}"></c:if>3</option>
                    <option <c:if test = "${status.value == '4'}"></c:if>4</option>
                    <option <c:if test = "${status.value == '5'}"></c:if>5</option>
                    <option <c:if test = "${status.value == '6'}"></c:if>6</option>
                </select><br>
                </spring:bind>
                <input type="submit" value="CONSULTAR">
            </form>
        </spring:nestedPath>
        <a href="index.htm">Inicio</a>
    </body>
</html>
