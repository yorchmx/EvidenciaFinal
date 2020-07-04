<%-- 
    Document   : registrousuarios
    Created on : 03-jul-2020, 15:01:13
    Author     : Memo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
        <script src="js/registrousuario.js"> </script>
    </head>
    <body>
        <h1>Registro de usuarios</h1>
        <form action="Registro" method="post">
            Nombre Completo:<br>
            <input type="text" name="rnombre" value=""></br>
            Edad: <br>
            <input type="text" name="redad" id="ed" value=""></br>
            Estatura:<br>
            <input type="text" name="restatura" id="est" value=""></br>
            Sexo:<br>
            <input type="checkbox" name="rsexo" id="rs" value="Hombre"> Hombre </br>
            <input type="checkbox" name="rseso" id="rs" value="Mujer"> Mujer </br>
            Usuario:<br>
            <input type="text" name="ruser" id="us" value=""></br>
            Contraseña:<br>
            <input type="password" name="rpass" value=""></br>
            <input type="submit" value="Registrar" id="btn">
        </form>
    </body>
</html>
