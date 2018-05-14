<%-- 
    Document   : ddoctord
    Created on : Sep 22, 2015, 10:37:40 AM
    Author     : darshparikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
          <form action="ddoctor">
            <table>
             <tr><td> Doctoruname:</td><td><input type="text" name="c" /></td></tr>
            <tr><td><input type="submit" value="login" name="lbutton" /></td></tr></table>
        </form>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
     
   
    </body>
</html>
