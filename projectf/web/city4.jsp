<%-- 
    Document   : city4
    Created on : Sep 11, 2015, 10:27:27 AM
    Author     : darshparikh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#FFFAFA">
       <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         
                 
        <%
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
	   Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1","sa","darsh56");
                             
           PreparedStatement ps=cn.prepareStatement("select * from dtable,ptable,mtable where ptable.did=dtable.did and ptable.mid=mtable.mid");
           ResultSet rs2=ps.executeQuery();
         out.print("<table border=1>");
	 
		out.print("<tr><th>Diseasename</th><th>medicinename</th></tr>");			 
            while(rs2.next())
	     {
                 
                
                  String dn = rs2.getString("diseasename");
                 String mn = rs2.getString("medicinename");
                
                 out.println("<tr><td>"+dn+"</td><td>"+mn+"</td></tr>");
						
             }

  
          out.print("</table>");
                                  
            
            
            
            
            
       %>
        
        
         
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
    </body>
</html>
