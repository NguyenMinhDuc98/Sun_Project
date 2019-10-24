package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/share/signupcss.jsp");
    _jspx_dependants.add("/share/js.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Signup</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/css/signup.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"static/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/signup.js\"></script>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"signupServlet\" method=\"post\" accept-charset=\"utf-8\" id=\"myForm\">\n");
      out.write("            <p>\n");
      out.write("                <label for=\"username\">Username</label>\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"e.g Nguyen Van A\">\n");
      out.write("            <ul>\n");
      out.write("                <li id=\"empty_name\">Enter username</li>\n");
      out.write("                <li id=\"short_name\">Name length > 2</li>\n");
      out.write("            </ul>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <label for=\"email\">Email</label>\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"e.g hello@welcom.com\">\n");
      out.write("        <ul>\n");
      out.write("            <li id=\"empty_email\">Enter your email</li>\n");
      out.write("            <li id=\"invalid_email\">Invalid email</li>\n");
      out.write("        </ul>\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"password\" name=\"password\">\n");
      out.write("    <ul>\n");
      out.write("        <li id=\"empty_password\">Enter password</li>\n");
      out.write("        <li id=\"short_password\">Password length > 2</li>\n");
      out.write("    </ul>\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Signup\">\n");
      out.write("</p>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("\n");
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
