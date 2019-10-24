<%-- 
    Document   : signup
    Created on : Oct 23, 2019, 11:09:04 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Signup</title>
        <%@include file="share/signupcss.jsp" %>
        <%@include file="share/js.jsp" %>
    </head>
    <body>
        <form action="signupServlet" method="post" accept-charset="utf-8" id="myForm">
            <p>
                <label for="username">Username</label>
                <input type="text" name="username" placeholder="e.g Nguyen Van A">
            <ul>
                <li id="empty_name">Enter username</li>
                <li id="short_name">Name length > 2</li>
            </ul>
        </p>
        <p>
            <label for="email">Email</label>
            <input type="email" name="email" placeholder="e.g hello@welcom.com">
        <ul>
            <li id="empty_email">Enter your email</li>
            <li id="invalid_email">Invalid email</li>
        </ul>
    </p>
    <p>
        <label>Password</label>
        <input type="password" name="password">
    <ul>
        <li id="empty_password">Enter password</li>
        <li id="short_password">Password length > 2</li>
    </ul>
</p>
<p>
    <input type="submit" name="submit" value="Signup">
</p>
</form>
</body>

</html>
