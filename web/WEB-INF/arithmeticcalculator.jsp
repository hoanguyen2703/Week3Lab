<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 25, 2023, 9:42:23 PM
    Author     : khanhhoanguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNum}"><br>
            Second: <input type="text" name="secondNum" value="${secondNum}"><br>
            <input type="submit" value="+" name="operation">
            <input type="submit" value="-" name="operation">
            <input type="submit" value="*" name="operation">
            <input type="submit" value="%" name="operation">
        </form>
            
        
        <p>Result: ${result}</p>    
        
        <a href="age">Age Calculator</a>
    </body>
</html>
