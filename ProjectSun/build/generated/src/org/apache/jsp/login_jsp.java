package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/share/logincss.jsp");
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
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/css/signin.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"loginServlet\" method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("            <p>\n");
      out.write("                <label>Username</label>\n");
      out.write("                <input type=\"text\" name=\"username\">\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\">\n");
      out.write("            </p>\n");
      out.write("            <p id=\"submit\">\n");
      out.write("                <input type=\"submit\" name=\"login\" value=\"Login\">\n");
      out.write("                <span>\n");
      out.write("                    <label for=\"rememberMe\">Remember Me?</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"rememberMe\" id=\"rememberMe\" value=\"1\">\n");
      out.write("                </span>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <span>Not registered? <a href=\"signup.jsp\" title=\"\">Create account</a></span>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
