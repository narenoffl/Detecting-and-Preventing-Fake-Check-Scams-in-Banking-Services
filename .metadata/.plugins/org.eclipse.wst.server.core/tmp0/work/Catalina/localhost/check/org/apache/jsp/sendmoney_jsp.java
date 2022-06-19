package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class sendmoney_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link  rel=\"stylesheet\" href=\"CSS/check.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://github.com/rubyeffect/easy_fill/tree/master/lib/easy_fill-0.0.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
 
String id=request.getParameter("id");
String checkno=request.getParameter("chckno");
String checkwrd=request.getParameter("chckword");
String date=request.getParameter("date");
String charityname=request.getParameter("charityname");
String desc=request.getParameter("desc");
String amount=request.getParameter("amount");
String cmail=request.getParameter("cmail");
String city=request.getParameter("city");
String pic=request.getParameter("pic");
String encrypt=request.getParameter("encrypt");
String status=request.getParameter("status");
String pemail=request.getParameter("pemail");
String address=request.getParameter("address");


      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<div class=\"check\">\r\n");
      out.write("  <div class=\"border\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <form action=\"transfertocharity.jsp\" method=\"post\" >\r\n");
      out.write("      <div class=\"content\">\r\n");
      out.write("        <div class=\"one\">\r\n");
      out.write("        \r\n");
      out.write("          <table class=\"following\">\r\n");
      out.write("            <tr>\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("              <td class=\"line\">This check is in payment of the following</td>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          </table>\r\n");
      out.write("          \r\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.print(id );
      out.write("\"   name=\"id\" ><span class=\"bd\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"number\" >\r\n");
      out.write("        Check no:\r\n");
      out.write("        <input type=\"show\" value=\"");
      out.print( checkno);
      out.write("\"  name=\"cno\" size=\"15\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("  <div class=\"orderof\"><input type=\"text\" value=\"");
      out.print(checkwrd );
      out.write("\" placeholder=\"INSERT_AMOUNT TYPE WORD\"  name=\"amount\" size=\"15\"><span class=\"dollar\"><span class=\"bd\"></span>Rupees</span></div><br>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("<table class=\"info\"><br><br><br>\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<th class=\"chart\">date</th>\r\n");
      out.write("\t<th class=\"chart\">to the order of</th>\r\n");
      out.write("\r\n");
      out.write("\t<th class=\"chart\">description</th>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("<td class=\"blank short\"><input type=\"date\" PLACEHOLDER=\"  \"  value=\"");
      out.print(date );
      out.write("\" name=\"date\" size=\"35\"></td>\r\n");
      out.write("\t<td class=\"blank long\"><input type=\"text\" value=\"");
      out.print(charityname );
      out.write("\" name=\"cname\" size=\"15\" readonly></td>\r\n");
      out.write("\r\n");
      out.write("\t<td class=\"blank long des\"><input type=\"text\"  Value=\"");
      out.print(desc);
      out.write("\" name=\"description\" size=\"15\" readonly></td>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"amount\">\r\n");
      out.write("      <span class=\"amounts\"><p>check</p> <p>amount</p></span>\r\n");
      out.write("      <div class=\"sign\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"box\">\r\n");
      out.write("        <div class=\"whole\"><input type=\"text\" name=\"rs\" placeholder=\"0000\" Value=\"");
      out.print(amount);
      out.write("\" size=\"13\" style=\"width:60px;\"></div>\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("     \t      <input type=\"hidden\" value=\"");
      out.print(cmail );
      out.write("\" name=\"charityemail\" placeholder=\"0000\" size=\"13\" >\r\n");
      out.write("      \r\n");
      out.write("        \t\t  <input type=\"hidden\" value=\"");
      out.print(pemail );
      out.write("\" name=\"pemail\" placeholder=\"0000\" size=\"13\" >\r\n");
      out.write(" \t    \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       <table class=\"add\">\r\n");
      out.write("    \t    <td class=\"lines\"><input type=\"hidden\" PLACEHOLDER=\"INSERT_ADDRESS\" value=\"");
      out.print(address );
      out.write("\" name=\"address\" size=\"13\" required></td>\r\n");
      out.write("    \t    <tr>\r\n");
      out.write("    \t    <td class=\"lin\r\n");
      out.write("    \t    es\"><input type=\"text\" PLACEHOLDER=\"CITY, STATE ZIP\" name=\"citystate\" value=\"");
      out.print(city );
      out.write("\" size=\"13\" required></td>\r\n");
      out.write("    \t    <tr>\r\n");
      out.write("    \t    <td class=\"bank\">Bank Name, N.A.</td>\r\n");
      out.write("     \r\n");
      out.write("       </table>\r\n");
      out.write("\t \r\n");
      out.write("\t   <table class=\"signature\">\r\n");
      out.write("\t  \t\t <td>\r\n");
      out.write("\t\t<!-- <input type=\"show\"  name=\"filename\" value=\"\" size=\"13\" accept=\"image/*\" onchange=\"preview_image(event)\" required></td> -->\r\n");
      out.write("  <img src=\"Local1/");
      out.print(pic );
      out.write("\" id=\"output_image\"/ height=\"100px\"><br><p>signature</p>\t\t\r\n");
      out.write(" <tr>\r\n");
      out.write("\t\t<td class=\"mp\"></td>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        </table>\r\n");
      out.write("\t<table class=\"signature\">\r\n");
      out.write("\t\r\n");
      out.write("<br><br><br><br><br><br><br>\r\n");
      out.write("\t\t<td> <button><input type=\"submit\" value=\"Transfer\"></button></td>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("<td class=\"mp\"></td>\r\n");
      out.write("\t</table>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("  </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
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
      out.write("\r\n");
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
