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
                <input type="submit" value="OK"><br>

                <!-- ciudad Origen -->
                Ciudad Origen:<br>
                <select name="Origen">
                    <option>Medellín (MDE)</option>
                    <option>Bogotá (BOG)</option>
                </select> 
                <!-- Calendar ida -->
                Fecha ida: <input type="date" name="datefield">
                <br>
                Ciudad Destino:<br>
                <select name="Destino">
                    <option>New York (JFK)</option>
                    <option>Paris (ORY)</option>
                </select>   
                <!-- Calendar regreso -->
                Fecha de regreso: <input type="date" name="datefield"> <br>
                
                Cantidad de viajeros:
                <select name="cantidad">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                </select>
                
            </form>
        </spring:nestedPath>
        <a href="index.htm">Inicio</a>
    </body>
</html>
