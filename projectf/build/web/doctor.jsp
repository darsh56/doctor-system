<%-- 
    Document   : doctor
    Created on : Sep 19, 2015, 11:15:10 AM
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
          <form action="FirstServlet" method="post">  
        Username:<input type="text" name="uname"/><br/><br/>  
        password:<input type="text" name="pass"/><br/><br/>    

        <input type="submit" value="login"/>  
        </form> 
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
