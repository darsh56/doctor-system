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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.viewsetget;

/**
 *
 * @author darshparikh
 */
public class vp extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vp</title>");            
            out.println("</head>");
            out.println("<body>");
            String dn=request.getParameter("d");
           
            String pname=request.getParameter("p");
       
	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
	   Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1","sa","darsh56");
                             
           PreparedStatement ps=cn.prepareStatement("select name,emailaddress,condition,diseasename,medicinename from ptable,mtable,dtable,dotable where ptable.doid=dotable.doid and ptable.did=dtable.did and ptable.mid=mtable.mid and puid='"+pname+"' and uname='"+dn+"'");
           ResultSet rs2=ps.executeQuery();
	 
            ArrayList<viewsetget> al = new ArrayList<>();
            while(rs2.next())
            {
                viewsetget v1 = new viewsetget();
                v1.setName(rs2.getString("name"));
                v1.setEmail(rs2.getString("emailaddress"));
                v1.setCondition(rs2.getString("condition"));
                v1.setDname(rs2.getString("diseasename"));
                v1.setMname(rs2.getString("medicinename"));
                al.add(v1);
            }
            request.setAttribute("al", al);
            RequestDispatcher rd = request.getRequestDispatcher("vp2.jsp");
            rd.forward(request, response);
					 
//            while(rs2.next())
//	     {
//                 String n = rs2.getString("name");
//                 String em = rs2.getString("emailaddress");
//                 String c = rs2.getString("condition");
//                 String dd = rs2.getString("diseasename");
//                 String mm = rs2.getString("medicinename");
//                  out.print("<table border=1>");
//                 out.println("<tr><th>name:</th><td>"+n+"</td></tr></br>");
//                 out.println("<tr><th>emailaddress:</th><td>"+em+"</td></tr><br/>");
//                 out.println("<tr><th>condition:</th><td>"+c+"</td></tr><br/>");
//                 out.println("<tr><th>diseasename:</th><td>"+dd+"</td></tr><br/>");
//                 out.println("<tr><th>medicinename:</th><td>"+mm+"</td></tr><br/>");
//                 
//                
//						
//             }

  
          out.print("</table>");
                                  
            
            
            
           
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
            Logger.getLogger(vp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vp.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(vp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(vp.class.getName()).log(Level.SEVERE, null, ex);
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
