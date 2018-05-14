import java.sql.*;  
  
public class LoginDao {  
public static boolean validate(String u,String p){  
boolean status=false;  
try{  


	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=pro1","sa","darsh56");
      
PreparedStatement ps=con.prepareStatement(  
"select * from dotable where uname=? and password=? ");  
ps.setString(1,u);  
ps.setString(2,p);
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  