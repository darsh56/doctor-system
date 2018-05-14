<%-- 
    Document   : padmin
    Created on : Sep 29, 2015, 10:16:57 AM
    Author     : darshparikh
--%>

<%@page import="javax.swing.JOptionPane"%>
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
                sorry,invalid entry enter by you choose any one below functionality</br></br>
          <a href='doctord.jsp'>insert doctor detail </a><br/>
        <a href='ddoctord.jsp'>delete doctor detail </a><br/> 
        <a href='city.jsp'>wish to see citywise all diseases</a><br/>
        <a href='city2.jsp'>wish to see citywise particular disease with medicines</a><br/>
        <a href='city3.jsp'>wish to see citywise all diseases with applied medicines</a><br/>
        <a href='city4.jsp'>wish to see all cities 's diseases with applied medicines</a><br/>
        <a href='city5.jsp'>wish to see all cities with particular disease with applied medicines</a><br/>
        <a href='doctorwise.jsp'>wish to see doctorwise applied medicines for particular disease</a><br/>
                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %> 
       
    </body>
</html>
