<%-- 
    Document   : city3
    Created on : Sep 11, 2015, 9:46:14 AM
    Author     : darshparikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function app(form)
            {
                var Name = form.cn.value;
               


                if (Name.length == 0) {
                    alert("you must enter City Name");
                    return false;
                }





            }

        </script>
    </head>
    <body>
           <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         <form action="city3" onSubmit= "return app(this);">
            <table>
             <tr><td> cityname:</td><td><input type="text" name="c" id="cn"/></td></tr>
            <tr><td><input type="submit" value="login" name="lbutton" /></td></tr>
        </form></table>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
     
    </body>
</html>
