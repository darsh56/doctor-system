
import java.beans.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import mypack.patientClass;

public class SServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String me = null,de = null;

        String nm = request.getParameter("uid");
        int n1 = Integer.parseInt(nm);
         String nm1 = request.getParameter("puid");
        String p = request.getParameter("uname");
        String e1 = request.getParameter("email1");
        String w1 = request.getParameter("we");
        int w = Integer.parseInt(w1);
        String a1 = request.getParameter("age");
        int a = Integer.parseInt(a1);
        String g = request.getParameter("gender");
        String m = request.getParameter("mob1");
        //int m=Integer.parseInt(mm);
        String c = request.getParameter("co");
        String d11 = request.getParameter("disease");
        int d = Integer.parseInt(d11);
        String m11 = request.getParameter("medicine");
        int m1 = Integer.parseInt(m11);
        String d1 = request.getParameter("dosa");
        String c11 = request.getParameter("city");

        try {
            PreparedStatement ps;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=pro1", "sa", "darsh56");

            ps = con.prepareStatement("insert into ptable values(?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            ps.setInt(1, n1);
            ps.setString(2, p);
            ps.setString(3, nm1);
            ps.setString(4, e1);
            ps.setInt(5, w);
            ps.setInt(6, a);
            ps.setString(7, g);
            ps.setString(8, m);
            ps.setString(9, c);
            ps.setInt(10, d);
            ps.setInt(11, m1);
            ps.setString(12, d1);
            ps.setString(13, c11);
		//int i = stmt.executeUpdate("insert into ptable values ()");

            int i = ps.executeUpdate();
            if (i > 0 && e1 != null) {
                
                ps = con.prepareStatement("select medicinename,diseasename from mtable,dtable where mtable.did=dtable.did and mid=?");
                ps.setInt(1, m1);
                ResultSet rs2=ps.executeQuery();
                   
                while(rs2.next())
	     {
                     me = rs2.getString("medicinename");
                    de = rs2.getString("diseasename");
                 
						
             }
                
                patientClass ps1 = new patientClass();
                ps1.setDname(de);
                ps1.setMname(me);
                ps1.setEmailaddress(e1);
                ps1.setName(p);
                ps1.setPuid(nm1);
                ps1.setDosage(d1);
                request.setAttribute("ps", ps1);
                RequestDispatcher rd= request.getRequestDispatcher("NewServlet");
                rd.forward(request, response);

            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//      out.print(n2);
//   
//    out.print(n1);
//    out.print(p);
//    out.print(e1);
//    out.print(w);
//    out.print(a);
//    out.print(g);
//    
//    out.print(m);
//    out.print(c);
//    out.print(d);
//    out.print(m1);
//    out.print(d1);

    }
}
