<%-- 
    Document   : city5
    Created on : Sep 11, 2015, 11:08:00 AM
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
                    alert("you must enter Disease Name");
                    return false;
                }





            }

        </script>
    </head>
    <body bgcolor="#FFFAFA">
          <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         <form action="city5" onSubmit= "return app(this);">
            <table>
             <tr><td> Diseasename:</td><td><input type="text" name="d" id="cn" /></td></tr>
             <tr><td><input type="submit" value="login" name="lbutton" /></td></tr></table>
        </form>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
