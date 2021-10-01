<%-- 
    Document   : ProductoVTA
    Created on : 1/10/2021, 02:47:46 PM
    Author     : 57311 Jeniffer Perez Urbina - 20182578127
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width-device-width, initial-scale=1.0">

        <title>Gestionar Producto</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    </head>
    <body>
        <h1>Productos</h1>
        <div class="d-flex">
        <div class="card col-sm 8">
            <table class="table table-hover table-dark">
                <thead>
                    <tr>
                        <th>N° ID</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Unidades</th>
                        <th>Valor</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="objp" items="${lista_productos}">
                        <tr>
                            <td>$objp.getId_pro()</td>
                            <td>$objp.getNombre_pro()</td>
                            <td>$objp.getDescripcion_pro()</td>
                            <td>$objp.getUnidades_pro()</td>
                            <td>$objp.getValor_pro()</td>
                            <td></td>
                        </tr>
                    </c:forEach>
                 
                </tbody>
            </table>
        </div>
        </div>
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>
