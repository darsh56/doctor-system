<%-- 
    Document   : dpatient
    Created on : Sep 23, 2015, 11:53:42 PM
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
                     var Nam = form.c.value;


                if (Name.length == 0) {
                    alert("you must enter Patient id");
                    return false;
                }
else if (Nam.length == 0) {
                    alert("you must enter your id");
                    return false;
                }




            }

        </script>

    </head>
      <body  bgcolor="#FFFAFA">
       <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         
                   <form action="dpatient" onSubmit= "return app(this);">
            <table>
             <tr><td> patientid:</td><td><input type="text" name="p" id="cn"/></td></tr>
             <tr><td> doctorid:</td><td><input type="text" name="d"  id="c"/></td></tr>
            <tr><td><input type="submit"  /></td></tr></table>
        </form>
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
     
   
    </body>
</html>
