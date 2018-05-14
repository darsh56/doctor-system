<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
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
        RequestDispatcher rd=request.getRequestDispatcher("pdoctor.jsp");
            rd.forward(request, response);
        %>
        
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
