<%-- 
    Document   : admin
    Created on : Sep 11, 2015, 7:39:42 AM
    Author     : darshparikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body bgcolor="#FFFAFA">
        <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <h1 align="center">Admin login form</h1><br />
                <p align="center">sorry,incorrect username and  password</p><br/>
                <form action="auth" method="post">
                    <table align="center" onSubmit= "return app(this);">
                        <tr><td>username</td><td><input type="text" name="un" id="u" /></td></tr>
                        <tr><td> password</td><td><input type="password" name="pwd" /></td></tr>
                        <tr><td>
                                <input type="submit" value="login" name="lbutton" />
                        </td></tr>
                    </table>
                </form>


            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
