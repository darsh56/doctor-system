<%-- 
    Document   : vp
    Created on : Sep 23, 2015, 9:30:11 AM
    Author     : darshparikh
--%>

<%@page import="mypack.viewsetget"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  bgcolor="#FFFAFA">
         <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
           <form action="vp">
            <table>
                <tr><td>Doctorusername:</td><td><input type="text" name="d" /></td></tr>
             <tr><td> Patientid:</td><td><input type="text" name="p" /></td></tr>
            <tr><td><input type="submit" value="login" name="lbutton" /></td></tr>
        </form>
        

        </table>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
       
    </body>
</html>
