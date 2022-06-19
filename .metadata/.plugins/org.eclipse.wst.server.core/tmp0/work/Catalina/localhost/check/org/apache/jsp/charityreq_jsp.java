package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class charityreq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/style.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
String name=request.getParameter("rname");
String rname=request.getParameter("remail");
String cname=request.getParameter("cemail");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<button style=\"float:right;margin-top:-60px;\" class=\"btn btn-outline-danger\"><a href=\"charitymainpage.jsp\" \">Back</a></button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">  \r\n");
      out.write("  <form id=\"contact\" action=\"charityreq\" method=\"post\">\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <input placeholder=\"Your name\" value=\"");
      out.print(name );
      out.write("\" type=\"text\" name=\"rname\" tabindex=\"1\" required autofocus>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <input placeholder=\"Your Email Address\" value=\"");
      out.print(rname );
      out.write("\" type=\"email\" name=\"remail\" tabindex=\"2\" required>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <input  type=\"text\"  value=\"");
      out.print(cname );
      out.write("\" name=\"cemail\"  tabindex=\"3\" required>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <input placeholder=\"Contact No\" type=\"number\" name=\"number\" tabindex=\"4\" required>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <textarea placeholder=\"Type your message here....\" name=\"message\" tabindex=\"5\" required></textarea>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("      <fieldset>\r\n");
      out.write("      <input type=\"text\" placeholder=\"Charity Name\" name=\"cname\" tabindex=\"5\" required></textarea>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <button name=\"submit\" type=\"submit\" id=\"contact-submit\" data-submit=\"...Sending\">Submit</button>\r\n");
      out.write("    </fieldset>\r\n");
      out.write(" \r\n");
      out.write("  </form>\r\n");
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
