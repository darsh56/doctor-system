<%-- 
    Document   : welcome
    Created on : Sep 11, 2015, 12:48:02 AM
    Author     : darshparikh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>JSP Page</title>

       
        <script>
            function getMedicine(valuedid) {

                
                var xHRObject = new XMLHttpRequest();
                //var url = theUrl;
                xHRObject.open("GET", "optionmedicine?did=" + valuedid, true);
                xHRObject.send();
                xHRObject.onreadystatechange = function () {
                    if (xHRObject.readyState == 4 && xHRObject.status == 200) {
                        var response = xHRObject.responseText;
                   // alert(response);
                        document.getElementById("medid").innerHTML = response;
    //                return response;
                    }
                }

            }
            function getDisease() {

               // alert(valuedid);
                var xHRObject = new XMLHttpRequest();
                //var url = theUrl;
                xHRObject.open("GET", "optionmedicine?desopt=1", true);
                xHRObject.send();
                xHRObject.onreadystatechange = function () {
                    if (xHRObject.readyState == 4 && xHRObject.status == 200) {
                        var response = xHRObject.responseText;
                   // alert(response);
                        document.getElementById("desid").innerHTML = response;
    //                return response;
                    }
                }

            }


        </script>
    </head>

    <body onload="getDisease();">

          <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         <form action="idm" method="post" onSubmit= "return app(this);" >  
            <h1 align="center"></h1><br/>
            <table align="center">

                
                
                

                <tr><td>Disease Name:</td><td> 
                        <input type="text" name="d"/>   <select name="disease" id="desid" onchange="getMedicine(this.value);">
                            <option>select one</option>
                    
                        </select> </td></tr>

                <tr><td>Medicine Name:</td><td>  <input type="text" name="m"/> 
                        <select name="medicine" id="medid">

                        </select>
                    </td></tr>

         
                <tr><td><input type="submit"  value="submit"/>  </td></tr>
                

            </table>
        </form>

                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>

    </body>
</html>
