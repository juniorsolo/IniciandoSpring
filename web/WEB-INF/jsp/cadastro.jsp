<%-- 
    Document   : cadastro
    Created on : 07/03/2017, 22:11:40
    Author     : Junior
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Tela de cadastro</h1>
        
        <div>
            <form >
                <div class="form-group">
                   Nome
                   <input type="text" name="nome" id="nome" class="form-control" required="">
                </div>
                
                <div class="form-group">
                   Endereço
                   <input type="text" name="endereco" id="endereco" class="form-control" required="">
                </div>
                
                <div class="form-group">
                   Telefone
                   <input type="number" name="telefone" id="telefone" class="form-control" required="">
                </div>
                
                <div class="form-group">
                   E-mail
                   <input type="text" name="email" id="email" class="form-control" required="">
                </div>
                <div class="form-group">
                    <input type="submit" id="cadastrar" class="btn btn-info" value="Cadastrar">
                </div>
            </form>
        </div>
        
    </body>
</html>
