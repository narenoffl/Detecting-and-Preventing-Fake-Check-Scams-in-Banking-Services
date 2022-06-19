package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faccountdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>CC08</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("             <meta http-equiv=\"refresh\" content=\"4; URL=Fakecharmain.jsp\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Prime login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\">\r\n");
      out.write("    <script>\r\n");
      out.write("        addEventListener(\"load\", function () {\r\n");
      out.write("            setTimeout(hideURLbar, 0);\r\n");
      out.write("        }, false);\r\n");
      out.write("\r\n");
      out.write("        function hideURLbar() {\r\n");
      out.write("            window.scrollTo(0, 1);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Mukta+Mahee:200,300,400,500,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style></style>\r\n");
      out.write("<body bgcolor=\"\t#99ffff\">\r\n");
      out.write("<div>\r\n");
      out.write("<center>\r\n");
      out.write("<img src=\"bgimages/den.gif\" style=\"width:40%;\">\r\n");
      out.write("<h1>Access Denied...!</h1>\r\n");
      out.write("<h1>Login Properly...!</h1>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
