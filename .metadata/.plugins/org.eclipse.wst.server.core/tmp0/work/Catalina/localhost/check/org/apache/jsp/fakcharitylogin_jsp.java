package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fakcharitylogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/all.css\" >\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".myDiv {\r\n");
      out.write("  border: 5px;\r\n");
      out.write("  background-image:url(Local/123.jpg);    \r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  width:360px;\r\n");
      out.write("  height:290px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  padding-top:40px;\r\n");
      out.write("  opacity:0.9;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".myDiv2 {\r\n");
      out.write("  font-size:25px;  \r\n");
      out.write("  font-style: italic;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("color:black; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\r\n");
      out.write("/* background-image: linear-gradient(to bottom, #00ccff 0%, #33cc33 100%); */\r\n");
      out.write(" background-image:url(Local/800px_COLOURBOX36656707.jpg);\r\n");
      out.write("background-size: cover;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<div class=\"myDiv2\">\r\n");
      out.write("Charity Login Page\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"Fakecharservlet\" method=\"post\">\r\n");
      out.write("<div class=\"myDiv\">\r\n");
      out.write("<center>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div class=\"font\">\r\n");
      out.write("  \r\n");
      out.write("  <input  type=\"text\" name=\"username\" placeholder=\"Username\" style=\"width:280px;height:40px;text-align:center;\"></div><br><br>\r\n");
      out.write("  <input type=\"password\" class=\"fa fa-user\" name=\"\" placeholder=\"Password\" style=\"width:280px;height:40px;text-align:center;\" minlength=\"4\" required><br><br>\r\n");
      out.write("  <input type=\"submit\" value=\"Login\" style=\"width:100px;height:40px;border-radius: 10px;background-color:linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(13,121,9,1) 0%, rgba(0,212,255,1) 100%);\"><br><br>\r\n");
      out.write(" \r\n");
      out.write(" </div>\r\n");
      out.write("  </center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
      out.write("\r\n");
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
