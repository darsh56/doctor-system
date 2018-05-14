<%-- 
    Document   : pdoctor
    Created on : Sep 29, 2015, 10:52:11 AM
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
         
                <a href='patientd.jsp'>insert patient detail</a><br/>
       <a href='idm1.jsp'>insert diseases medicine</a><br/>
       <a href='vp.jsp'>view patient detail</a><br/>
                <a href='dpatient.jsp'>delete patient detail</a><br/>
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
