<%-- 
    Document   : doctord
    Created on : Sep 22, 2015, 9:59:36 AM
    Author     : darshparikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
               <title>JSP Page</title>
 
<script type="text/javascript">
function app(form)
{

var Na=form.un.value;
var Pa=form.p.value;
var Ua=form.u.value;
var Ql=form.ql.value;
var Pemail=form.email.value;
var Hn=form.hnn.value;
var Ho=form.hll.value;

if(Na.length==0){
	alert("you must enter Doctor username");
	return false;
}
else if(Pa.length==0){
	alert("you must enter Doctor password");
	return false;
}
else if(Ua.length==0){
	alert("you must enter Doctor Name");
	return false;
}
else if (!document.getElementById("mob").value.match("^[0-9]{10}$"))
{
   alert("Invalid Mobile No.");
   return false;
 }
 else if(Ql.length==0){
	alert("you must enter Qulification");
	return false;
}
else if (!document.getElementById("email").value.match("^[\\w-_\.]*[\\w-_\.]\@[\\w]\.+[\\w]+[\\w]$")&&(Pemail.length>0))
{
   alert("Invalid Email");
   return false;
 }
 else if(Hn.length==0){
	alert("you must enter Hospital Name");
	return false;
	
}

else if(Ho.length==0){
	alert("you must enter Hospital Location");
	return false;
	
}


else{
	alert("suggestion saved successfully");
	return true;
}


}

</script>
</head>
                            
    <body>
  <%@include file="Header.html" %>
        <div id="content">
            <div class="section_w940">

                <!--Write Here-->
         
                    
       
<form action="TServlet" method="post" onSubmit= "return app(this);" >  
    <h1 align="center">Doctor Detail Form</h1><br/>
    <table align="center">
   

<tr><td>Username:</td><td><input type="text" name="uid2" id="un"/></td></tr>
<tr><td>Doctor Password:</td><td><input type="text" name="Password" id="p"/></td></tr>
<tr><td>Doctor Name:</td><td><input type="text" name="username" id="u"/></td></tr>

<tr><td>Mobile no:</td><td><input type="text" name="mob1" id="mob"/></td></tr>
<tr><td>Qualification:</td><td><input type="text" name="ql" id="ql"/></td></tr>
<tr><td>Email:</td><td><input type="text" id="email" name="email1" /></td></tr>


<tr><td>Hospital Name:</td><td><input type="text" name="hn" id="hnn" /></td></tr>

<tr><td>Hospital Location:</td><td><input type="text" name="hl" id="hll" /></td></tr>

<tr><td>Specialization:</td><td><input type="text" name="sp" id="sp" /></td></tr>


<tr><td><input type="submit"  value="submit"/>  </td></tr>

</table>
</form>

                
                
                <!--End Here-->
            </div>
        </div>
        <%@include file="Footer.html" %>
  
</body>
</html>


