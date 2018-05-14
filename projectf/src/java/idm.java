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
public class idm extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String de = request.getParameter("d");
            String me = request.getParameter("m");
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1", "sa", "darsh56");

            try {
                PreparedStatement ps, ps1, ps3;
                int dn = 0;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                if(LoginDao1.validate(de)){ 
    	
    	 
         
     }  
                else
                {

                ps = con.prepareStatement("insert into dtable values(?)");
                ps.setString(1, de);
                int j = ps.executeUpdate();
                    //      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                }
                ps1 = con.prepareStatement("select did from dtable where diseasename= ?");
                ps1.setString(1, de);

                ResultSet rs2 = ps1.executeQuery();
                while (rs2.next()) {
                    dn = rs2.getInt("did");

                }
                out.println(dn);
                 out.println(me);
                  if(LoginDao2.validate(dn,me)){ 
    	RequestDispatcher rd=request.getRequestDispatcher("pdoctor.jsp");  
                  rd.forward(request,response); 
    	 
         
     }  
                  else{
                
                ps3 = con.prepareStatement("insert into mtable values(?,?)");
                ps3.setInt(1, dn);
                ps3.setString(2, me);

                int i = ps3.executeUpdate();
                 if (i>0) {
                 RequestDispatcher rd=request.getRequestDispatcher("pdoctor.jsp");  
                 rd.forward(request,response); 
                	} 
                      else
                    {
                      out.print("record not inserted");
                    RequestDispatcher rd=request.getRequestDispatcher("pdoctor.jsp");  
                   rd.forward(request,response);  
                        }
                  }
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(idm.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(idm.class.getName()).log(Level.SEVERE, null, ex);
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
