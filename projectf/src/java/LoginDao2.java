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
  
public class LoginDao2 {  
public static boolean validate(int n,String m){  
boolean status=false;  
try{  


	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pro1","sa","darsh56");
      
PreparedStatement ps=con.prepareStatement(  "select * from mtable where did='"+n+"' and medicinename='"+m+"' ");
//ps.setInt(1,n);
//ps.setString(1,m);


  

      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
out.println(status);          

}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  