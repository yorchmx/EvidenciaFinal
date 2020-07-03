<%-- 
    Document   : index
    Created on : 03-jul-2020, 1:56:59
    Author     : Memo
--%>

<%@page import="Controlador.Registro" %>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>IMC</title>
    </head>
    <body>
        
        <h1>Inicia sesion para calcular tu IMC</h1>
        <h2> <% String us = ""; String ps ""; String nn = "";
            HttpSession sesion = request.getSession(true);
            Enumeration e = sesion.getAttributeNames();
            if (e.hasMoreElements() && sesion.getAttribute("usuario") !=null && sesion.getAttribute(usuario) != nn) {
                ps = "";
                nn = sesion.getAttribute("usuario").toString();
                out.print("El usuario '" + sesion.getAttribute("user") != null && sesion2.getAttribute("user") !=us) {
                
            }
            }
            
        </h2>
    </body>
</html>
