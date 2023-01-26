<%-- 
    Document   : agecalculator
    Created on : Jan 25, 2023, 8:25:50 PM
    Author     : khanhhoanguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            
            ${message}<br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
