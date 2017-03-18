<%-- 
    Document   : lista
    Created on : 17/03/2017, 22:36:09
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
        <title>Lista de pessoas cadastradas</title>
    </head>
    <body>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <td>Nome</td>
                        <td>Endereco</td>
                        <td>Telefone</td>
                        <td>Email</td>
                    </tr>              
                </thead>
                <tbody>
                    <c:forEach items="${listaCadastro}" var="cadastro">
                        <tr>
                            <td>${cadastro.nome}</td>
                            <td>${cadastro.endereco}</td>
                            <td>${cadastro.telefone}</td>
                            <td>${cadastro.email}</td>                          
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
