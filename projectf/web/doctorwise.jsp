<%-- 
    Document   : doctorwise
    Created on : Sep 11, 2015, 7:51:47 PM
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
           <form action="doctorwise">
            <table>
             <tr><td> DoctorId:</td><td><input type="text" name="do" /></td></tr>
             <tr><td> Diseasename:</td><td><input type="text" name="d" /></td></tr>
             <tr><td><input type="submit" value="login" name="lbutton" /></td></tr>
            </table>>
        </form>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    
    </body>
</html>
