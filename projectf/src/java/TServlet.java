/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.doctorclass;

/**import javax.servlet.http.HttpServlet;

 *
 * @author darshparikh
 */
public class TServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
    
            int n1 = 0;
             String n2=request.getParameter("uid2");  
           
            String p=request.getParameter("Password"); 
            String u=request.getParameter("username");
                String m=request.getParameter("mob1");
              String q=request.getParameter("ql");
               String e=request.getParameter("email1");
              String h=request.getParameter("hn");
             String h1=request.getParameter("hl");
              String s=request.getParameter("sp");
              
                try {
          PreparedStatement ps;
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
	   Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1","sa","darsh56");
                             
		
                ps = con.prepareStatement("insert into dotable values(?,?, ?, ?, ?, ?, ?, ?, ?)");
                
                ps.setString(1, n2);
                ps.setString(2, p);
                ps.setString(3, u);
                ps.setString(4, m);
                ps.setString(5, q);
                ps.setString(6, e);
                ps.setString(7, h);
                ps.setString(8, h1);
                ps.setString(9, s);
		//int i = stmt.executeUpdate("insert into ptable values ()");
		
                int i = ps.executeUpdate();
                if (i>0) {
		 if (i > 0 && e != null) {
                ps = con.prepareStatement("select doid from dotable where uname=?");
                ps.setString(1, n2);
                ResultSet rs2=ps.executeQuery();
                   
                while(rs2.next())
	     {
                  n1 = rs2.getInt("doid");
                
                 
						
             }

                
                doctorclass ds = new doctorclass();
                ds.setUname(n2);
                ds.setDoid(n1);
                ds.setPassword(p);
                ds.setEmailaddress1(e);
                request.setAttribute("ds", ds);
                RequestDispatcher rd= request.getRequestDispatcher("NewServlet1");
                rd.forward(request, response);

            }
		} 
                else
                {
                    out.println("data not inserted");
                     RequestDispatcher rd4=request.getRequestDispatcher("padmin.jsp");  
        rd4.include(request,response);  
                }
    } catch (ClassNotFoundException | SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
