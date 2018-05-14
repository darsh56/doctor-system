/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darshparikh
 */
import static java.lang.System.out;
import java.sql.*;  
  
public class LoginDao1 {  
public static boolean validate(String u){  
boolean status=false;  
try{  


	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pro1","sa","darsh56");
      
PreparedStatement ps=con.prepareStatement(  "select * from dtable where diseasename=? ");
ps.setString(1,u);

  

      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
out.println(status);          

}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  

