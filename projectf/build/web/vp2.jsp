<%-- 
    Document   : vp2
    Created on : Sep 24, 2015, 5:41:07 AM
    Author     : darshparikh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="mypack.viewsetget"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
            <%@include file="Header.html" %>
            <br/>
            <br/>
             <table align="center">
              <%
        
            if(request.getAttribute("al") != null)
            {
                ArrayList<viewsetget> al1 = (ArrayList<viewsetget>) request.getAttribute("al");
                
                for(viewsetget v1 : al1)
                {
                    String name = v1.getName();
                    String email=v1.getEmail();
                    String condition=v1.getCondition();
                     String dise=v1.getDname();
                      String med=v1.getMname();
                    %>
                    <tr>
                        <th>Name</th> <td> <%= name%></td>
                        </tr>
                        <tr>
                        <th>email</th> <td> <%= email%></td>
                        </tr>
                        <tr>
                        <th>condition</th><td>  <%= condition%></td>
                    </tr>
                    <tr>
                        <th>disease</th><td>  <%= dise%></td>
                    </tr>
                    <tr>
                        <th>medicine</th><td>  <%= med%></td>
                    </tr>
                  
        
        <%
                }
            }
        %> 
      

        </table>
        <br/>
        <br/>
        
          <%@include file="Footer.html" %>
    </body>
</html>
 <table>
            
           