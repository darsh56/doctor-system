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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author darshparikh
 */
public class city3 extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
             RequestDispatcher rd3= request.getRequestDispatcher("Header.html");
            rd3.include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet city3</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"#FFFAFA\">");
String cname=request.getParameter("c");
        
       out.print("<br/>");
               out.print("<br/>");
	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
	   Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1","sa","darsh56");
                             
           PreparedStatement ps=cn.prepareStatement("select * from dtable,ptable,mtable where ptable.did=dtable.did and mtable.mid=ptable.mid and city='"+cname+"'");
           
         // PreparedStatement ps=cn.prepareStatement("select * from dtable,ptable,mtable where ptable.did=dtable.did and mtable.mid=ptable.mid and city='ahmedabad'");
           ResultSet rs2=ps.executeQuery();
            if(rs2.next())
         {
             
         out.print("<table border=1 align=center>");
	 out.print("<tr><th>Diseasename</th><th>medicinename</th></tr>");
         
          String dn = rs2.getString("diseasename");
                 String mn = rs2.getString("medicinename");
                
                 out.println("<tr><td>"+dn+"</td><td>"+mn+"</td></tr>");
					 
            while(rs2.next())
	     {
                  dn = rs2.getString("diseasename");
                  mn = rs2.getString("medicinename");
                
                 out.println("<tr><td>"+dn+"</td><td>"+mn+"</td></tr>");
						
             }

  
          out.print("</table>");
          out.print("<br/>");
               out.print("<br/>");
                                  
         }
            else
            {
                
                RequestDispatcher rd5= request.getRequestDispatcher("padmin1.jsp");
            rd5.forward(request, response);    
            }
              RequestDispatcher rd4= request.getRequestDispatcher("Footer.html");
            rd4.include(request, response);
            
            out.println("</body>");
            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(city3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(city3.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(city3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(city3.class.getName()).log(Level.SEVERE, null, ex);
        }
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
