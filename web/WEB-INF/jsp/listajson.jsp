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
        <script src="<c:url value="resources/js/jquery-2.2.3.min.js" />"></script>
           
        <title>Lista de pessoas cadastradas</title>
    </head>
    <body>
        <div class="container">
            <table class="table" id="tabela">
                <thead>
                    <tr>
                        <td>Nome</td>
                        <td>Endereco</td>
                        <td>Telefone</td>
                        <td>Email</td>
                    </tr>              
                </thead>
                <tbody>
                   
                </tbody>
            </table>
        </div>
        <script>
            $(document).ready(function(){
                $.ajax({
                    url:"listajson",
                    datatype:"json",
                    sucess:function(data){
                        $.each(data, function(obj){
                            
                            $('#tabela').find('tbody').append('<tr><td>'+obj.nome+'</td>'+'<td>'+obj.endereco+'</td>'++'<td>'+obj.telefone+'</td>'+'<td>'+obj.email+'</td></tr>');
                        });
                    }
                });
            });
        </script> 
    </body>
</html>
