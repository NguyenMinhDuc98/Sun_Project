<%-- 
    Document   : login
    Created on : Oct 23, 2019, 9:58:16 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <%@include  file="share/logincss.jsp"%>
    </head>

    <body>
        <form action="loginServlet" method="post" accept-charset="utf-8">
            <p>
                <label>Username</label>
                <input type="text" name="username">
            </p>
            <p>
                <label>Password</label>
                <input type="password" name="password">
            </p>
            <p id="submit">
                <input type="submit" name="login" value="Login">
                <span>
                    <label for="rememberMe">Remember Me?</label>
                    <input type="checkbox" name="rememberMe" id="rememberMe" value="1">
                </span>
            </p>
            <p>
                <span>Not registered? <a href="signup.jsp" title="">Create account</a></span>
            </p>
        </form>
    </body>

</html>
