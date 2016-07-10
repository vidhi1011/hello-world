package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> site </title>\n");
      out.write("<link rel=\"stylesheet\" href=\"try.css\">\n");
      out.write("<body >\n");
      out.write("<div>\n");
      out.write("    <h1>\n");
      out.write("    My secret diary \n");
      out.write("    <form action=\"loginprocess\" method=\"get\">\n");
      out.write("<input class=\"e\" type=\"email\" name=\"email1\"  placeholder=\"abc@gmail.com\">  \n");
      out.write("<input class=\"p\" type=\"password\" name=\"password1\" placeholder=\"password\" >\n");
      out.write("<input type=\"submit\" name=\"login\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("             \n");
      out.write("</h1>\n");
      out.write("   \n");
      out.write("    <form action=\"process\" >\n");
      out.write("        <fieldset class=\"f\"><br>\n");
      out.write("          \n");
      out.write("            <h2><center> Sign up!</center> </h2><br>\n");
      out.write("          <table height=\"300px\"> \n");
      out.write("            <tr><td>First name:</td>\n");
      out.write("                <td><input type=\"text \"  placeholder=\"enter name\"  name=\"firstname\" class=\"yellow\" size=\"20\"></td></tr>\n");
      out.write("            <tr><td>Last name:</td>\n");
      out.write("                <td><input type=\"text \"  placeholder=\"enter name\"  name=\"lastname\" class=\"pink\" size=\"20\"></td></tr>\n");
      out.write("            <tr><td>Gender:</td>\n");
      out.write("                <td> Male\n");
      out.write("                <input type=\"radio\" name=\"gender\" size=\"20\"></td>\n");
      out.write("                <td>Female\n");
      out.write("                <input type=\"radio\" name=\"gender\" size=\"20\"></td></tr>\n");
      out.write("            <tr><td>email-id:</td>\n");
      out.write("                <td><input  type=\"email\" name=\"email\"  placeholder=\"abc@gmail.com\"></td></tr>\n");
      out.write("            <tr><td>password:</td>\n");
      out.write("                <td><input class=\"p\" type=\"password\" name=\"password\"></td></tr>\n");
      out.write("            <tr><td>confirm password:</td>\n");
      out.write("                <td><input class=\"p\" type=\"password\" name=\"password\" ></td></tr>\n");
      out.write("            <tr><td>submit:</td>\n");
      out.write("                <td><input type=\"submit\" value=\"submit\" name=\"m5\"></td></tr>\n");
      out.write("\n");
      out.write("   </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </form>\n");
      out.write("    ");
 String n=request.getParameter("firstname");
    session.setAttribute("firstname",n);  
      out.write("\n");
      out.write("</div>   \n");
      out.write("</body>\n");
      out.write("</head>\n");
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
