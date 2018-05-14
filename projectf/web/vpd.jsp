<%-- 
    Document   : vpd
    Created on : Oct 11, 2015, 12:45:11 PM
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
          <form action="vpd" onSubmit= "return app(this);">
            <table>
             <tr><td> Doctoruid:</td><td><input type="text" name="c" id="d"/></td></tr>
             <tr><td> diseasename:</td><td><input type="text" name="d" id="p"/></td></tr>
             <tr><td><input type="submit" value="login" name="lbutton" /></td></tr>
             </table>
        </form>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
