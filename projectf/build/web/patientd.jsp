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

        <script type="text/javascript">
            function app(form)
            {
                var Name = form.u.value;
                var Nam = form.v.value;
                var Na = form.un.value;
                var Pemail = form.email.value;
                var Age = form.a.value;
                var We = form.w.value;
                var Med = form.medid.value;
                var Des = form.desid.value;
                var Dosa = form.do.value;
                var C = form.c.value;


                if (Name.length == 0) {
                    alert("you must enter Doctor id");
                    return false;
                }


                else if (Nam.length == 0) {
                    alert("you must enter Patient id");
                    return false;
                }
                else if (Na.length == 0) {
                    alert("you must enter Patient name");
                    return false;
                }
                else if (!document.getElementById("email").value.match("^[\\w-_\.]*[\\w-_\.]\@[\\w]\.+[\\w]+[\\w]$") && (Pemail.length > 0))
                {
                    alert("Invalid Email");
                    return false;
                }
                else if (We.length == 0) {
                    alert("Please enter your Weight");
                    return false;

                }
                else if (Age.length == 0) {
                    alert("Please enter your Age");
                    return false;

                }
                else if (!document.getElementById("mob").value.match("^[0-9]{10}$"))
                {
                    alert("Invalid Mobile No.");
                    return false;
                }
                else if (Des.length == 0) {
                    alert("you must enter disease");
                    return false;

                }

                else if (Med.length == 0) {
                    alert("you must enter medicine name");
                    return false;

                }
                
                else if (Dosa.length == 0) {
                    alert("you must enter dosage");
                    return false;

                }
else if (C.length == 0) {
                    alert("you must enter city name");
                    return false;

                }





            }

        </script>

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

    <body bgcolor="#FFFAFA" onload="getDisease();">

        <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
                <form action="SServlet" method="post" onSubmit= "return app(this);" >  
                    <h1 align="center">Patient Detail Form</h1>
                    <table align="center">



                        <tr><td>Doctor Id:</td><td><input type="text" name="uid" id="u"/></td></tr>
                        <tr><td>Patient Id:</td><td><input type="text" name="puid" id="v"/></td></tr>




                        <tr><td>Patient Name:</td><td><input type="text" name="uname" id="un"/></td></tr>

                        <tr><td>Email:</td><td><input type="text" id="email" name="email1" /></td></tr> 

                        <tr><td>Weight:</td><td><input type="text" name="we" id="w" /></td></tr>

                        <tr><td>Age:</td><td><input type="text" name="age" id="a" /></td></tr>


                        <tr><td>Gender:</td><td><select name="gender">
                                    <option>male</option>
                                    <option>female</option>
                                </select></td></tr>


                        <tr><td>Mobile no:</td><td><input type="text" name="mob1" id="mob"/></td></tr>






                        <tr><td>Condition:</td><td><input type="text" name="co" /></td></tr>

                        <tr><td>Disease Name:</td><td> 
                                <select name="disease" id="desid" onchange="getMedicine(this.value);">
                                    <option>select one</option>

                                </select> </td></tr>

                        <tr><td>Medicine Name:</td><td> 
                                <select name="medicine" id="medid">

                                </select>
                            </td></tr>

                        <tr><td>Dosage:</td><td><input type="text" name="dosa" id="do"/></td></tr>
                        <tr><td>City:</td><td><input type="text" name="city" id="c"/></td></tr>
                        <tr><td><input type="submit"  value="submit"/>  </td></tr>

                    </table>
                </form>



                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>

    </body>
</html>

