package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.viewsetget;
import java.util.ArrayList;

public final class vp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/Footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body  bgcolor=\"#FFFAFA\">\n");
      out.write("         ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>HEART DOCTOR</title>\r\n");
      out.write("        <meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("        <meta name=\"description\" content=\"#\" />\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/styles.css\" />\r\n");
      out.write("\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.2.1-core.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.2-more.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.1.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("            window.addEvents({\r\n");
      out.write("                'domready': function () {\r\n");
      out.write("                    /* thumbnails example , div containers */\r\n");
      out.write("                    new newyorklasik({\r\n");
      out.write("                        overallContainer: 'newyorklasik_outer',\r\n");
      out.write("                        elementScrolled: 'newyorklasik_inner',\r\n");
      out.write("                        thumbsContainer: 'newyorklasik_items',\r\n");
      out.write("                        itemsVisible: 5,\r\n");
      out.write("                        elemsSlide: 2,\r\n");
      out.write("                        duration: 150,\r\n");
      out.write("                        itemsSelector: '.newyorklasik_element',\r\n");
      out.write("                        itemWidth: 158,\r\n");
      out.write("                        showControls: 1});\r\n");
      out.write("                },\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("            function clearText(field)\r\n");
      out.write("            {\r\n");
      out.write("                if (field.defaultValue == field.value)\r\n");
      out.write("                    field.value = '';\r\n");
      out.write("                else if (field.value == '')\r\n");
      out.write("                    field.value = field.defaultValue;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"site_title_bar_wrapper_outter\">\r\n");
      out.write("            <div id=\"site_title_bar_wrapper_inner\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"site_title_bar\">\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"banner_left\">\r\n");
      out.write("                        <div id=\"site_title\">\r\n");
      out.write("                            <h1><a href=\"#\r\n");
      out.write("                                   \">\r\n");
      out.write("                                    Heart <span>POINT</span>\r\n");
      out.write("                                    <span class=\"tagline\">A complete heart care</span>\r\n");
      out.write("                                </a></h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"home.jsp\" class=\"current\"><span></span>Home</a></li>\r\n");
      out.write("                                <li><a href=\"admin.jsp\" target=\"_parent\"><span></span>Admin</a></li>\r\n");
      out.write("                                <li><a href=\"doctor.jsp\" target=\"_parent\"><span></span>Doctor</a></li>\r\n");
      out.write("                              \r\n");
      out.write("                                <li><a href=\"#\"><span></span>Contact Us</a></li>\r\n");
      out.write("                            </ul>    \t\r\n");
      out.write("                        </div> <!-- end of menu -->\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"banner_right\">\r\n");
      out.write("                        <div id=\"banner_box\">\r\n");
      out.write("\r\n");
      out.write("                            <h1>Welcome to Heart Point </h1>\r\n");
      out.write("                            <p>To keep the body in good health is a duty... otherwise we shall not be able to keep our mind strong and clear..<br />\r\n");
      out.write("                                &nbsp;</p>\r\n");
      out.write("                            <div class=\"button\"><a href=\"#\r\n");
      out.write("                                                   \">Hello</a></div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- end of site_title_bar  -->\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- end of site_title_bar_wrapper_inner -->\r\n");
      out.write("        </div> <!-- end of site_title_bar_wrapper_outter  -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div class=\"section_w940\">\n");
      out.write("\n");
      out.write("                <!--Write Here-->\n");
      out.write("           <form action=\"vp\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Doctorusername:</td><td><input type=\"text\" name=\"d\" /></td></tr>\n");
      out.write("             <tr><td> Patientid:</td><td><input type=\"text\" name=\"p\" /></td></tr>\n");
      out.write("            <tr><td><input type=\"submit\" value=\"login\" name=\"lbutton\" /></td></tr>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--End Here-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/styles.css\" />\r\n");
      out.write("\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.2.1-core.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.2-more.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"script/newyorklasik-1.1.js\"></script>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("            window.addEvents({\r\n");
      out.write("                'domready': function () {\r\n");
      out.write("                    /* thumbnails example , div containers */\r\n");
      out.write("                    new newyorklasik({\r\n");
      out.write("                        overallContainer: 'newyorklasik_outer',\r\n");
      out.write("                        elementScrolled: 'newyorklasik_inner',\r\n");
      out.write("                        thumbsContainer: 'newyorklasik_items',\r\n");
      out.write("                        itemsVisible: 5,\r\n");
      out.write("                        elemsSlide: 2,\r\n");
      out.write("                        duration: 150,\r\n");
      out.write("                        itemsSelector: '.newyorklasik_element',\r\n");
      out.write("                        itemWidth: 158,\r\n");
      out.write("                        showControls: 1});\r\n");
      out.write("                },\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("            function clearText(field)\r\n");
      out.write("            {\r\n");
      out.write("                if (field.defaultValue == field.value)\r\n");
      out.write("                    field.value = '';\r\n");
      out.write("                else if (field.value == ''\r\n");
      out.write("                    field.value = field.defaultValue;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"footer_wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"cleaner_h40\"></div>\r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("        \tCopyright Â© 2048 <a href=\"#\r\n");
      out.write("\">Your Company Name</a> | \r\n");
      out.write("           Design by <a href=\"http://www.worldclasslasik.com\">lasik eye surgery</a>\r\n");
      out.write("        </center>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </div> <!-- end of footer -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"cleaner\"></div>\r\n");
      out.write("</div> <!-- end of footer wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
