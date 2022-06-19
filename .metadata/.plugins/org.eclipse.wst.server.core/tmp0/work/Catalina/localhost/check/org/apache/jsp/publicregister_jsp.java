package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public final class publicregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"appointment.css\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\"> >\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".myDiv {\r\n");
      out.write("border: 5px;\r\n");
      out.write("  background-image:url(Local/char6.jfif);    \r\n");
      out.write("  background-size:cover;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  width:400px;\r\n");
      out.write("  height:390px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  padding-top:40px;\r\n");
      out.write("  opacity:0.9;\r\n");
      out.write("}\r\n");
      out.write(".myDiv2 {\r\n");
      out.write("  font-size:25px;  \r\n");
      out.write("  font-style: italic;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("color: #ffffff; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("background-image:url(Local/char5.jpg);\r\n");
      out.write("background-size:cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3 style=\"font-weight: bold; text-align: center;margin-top: 10px\"> Register Details</h3><br>\r\n");
      out.write("    <form method=\"post\" action=\"Publicregservlet\" enctype=\"multipart/form-data\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"card col-sm-5\" style=\"padding-bottom:10px;background-color: #333;color:#fff;padding:10px;margin-left:30%;width: 38em;margin-bottom: 25px\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"full_name\" style=\"color:#fff;\">  Name:</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"full_name\" placeholder=\"Enter  Name\" name=\"name\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"email\"  style=\"color:#fff;\"> Email:</label>\r\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\" Email\" name=\"email\"  required>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"password1\"  style=\"color:#fff;\">Contact Number</label>\r\n");
      out.write("          <input type=\"number\" class=\"form-control\" onKeyPress=\"if(this.value.length==10) return false;\" id=\"password1\" placeholder=\"Contact Number\" name=\"cnum\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write(" <div class=\"form-group\">\r\n");
      out.write("          <label for=\"password1\"  style=\"color:#fff;\">Password</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"pass\" id=\"password1\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("          <label for=\"password1\"  style=\"color:#fff;\">Confirm Password</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" \" placeholder=\"Confirm Password\" name=\"pass\" id=\"password2\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("         <label for=\"duration\">Gender</label>\r\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"male\" checked> male\r\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"female\"> female\r\n");
      out.write("        </div>\r\n");
      out.write("         <br>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"card_photo\"  style=\"color:#fff;\">Charity Upload photo:</label>\r\n");
      out.write("          <input type=\"file\" class=\"form-control\" placeholder=\"Enter password\" name=\"photo\" accept=\"image/*\" onchange=\"preview_image(event)\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label  style=\"color:#fff;\">Your selected File:</label><br>\r\n");
      out.write("          <img src=\"\" id=\"output_image\"/ height=\"200px\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <center><button id=\"submit\" name=\"donator_register\" class=\"btn btn-primary btn-block\"  style=\"width:50%;\" onclick=\"return Validate()\">Register</button></center><br>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("  function preview_image(event)\r\n");
      out.write("  {\r\n");
      out.write("    var reader = new FileReader();\r\n");
      out.write("    reader.onload = function()\r\n");
      out.write("    {\r\n");
      out.write("      var output = document.getElementById('output_image');\r\n");
      out.write("      output.src = reader.result;\r\n");
      out.write("    }\r\n");
      out.write("    reader.readAsDataURL(event.target.files[0]);\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
