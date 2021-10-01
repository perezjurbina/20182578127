<%-- 
    Document   : index
    Created on : 7/09/2021, 10:17:48 AM
    Author     : 57311 Jeniffer Perez Urbina - 20182578127
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
        <title>Taller Java Web</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    </head>
    <body>
        <h1>Control de acceso</h1>
        <div class="card col-sm 4">
            <div class="card-body ">
                <form>
                    
                    <div class="form-gruop text-center">
                        <p><strong>Bienvenidos al sistema de Login</strong></p>
                    </div>
                    
                    <div class="form-group">
                        <label>Nombre de Usuario:</label>
                        <input class="form-control" type="text" name="txt_nombre_usu" required>
                    </div>
                    <div class="form-group">
                        <label>Clave de Acceso:</label>
                        <input class="form-control" type="password" name="txt_clave" required>
                    </div>
                    <input class="btn-success" type="submit" name="Accion" value="Ingresar">
                </form>
            </div>
        </div>
        <a href="ProductoCTO?accion=Listar">Gestionar Productos</a>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>
