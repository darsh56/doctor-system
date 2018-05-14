<%-- 
    Document   : mail1
    Created on : Oct 9, 2015, 2:29:15 AM
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
         
                <%
            
                String msg = request.getAttribute("msg").toString();
                if(msg==null) msg = "";
        %>
        <%=msg%>
       
        <%
        RequestDispatcher rd=request.getRequestDispatcher("padmin.jsp");
            rd.forward(request, response);
        %>
        
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
        
    </body>
</html>
