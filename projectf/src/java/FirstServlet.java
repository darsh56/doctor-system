import java.io.IOException;  

import java.io.PrintWriter;  
  

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  

public class FirstServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("uname");  
     String m=request.getParameter("pass");
    //int w=Integer.parseInt(n);
     
          
    if(LoginDao.validate(n,m)){ 
    	
    	 
         RequestDispatcher rd=request.getRequestDispatcher("pdoctor.jsp");  
        rd.forward(request,response);  
        
    }  
    else{  
     
        RequestDispatcher rd=request.getRequestDispatcher("doctor1.jsp");  
        rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  
