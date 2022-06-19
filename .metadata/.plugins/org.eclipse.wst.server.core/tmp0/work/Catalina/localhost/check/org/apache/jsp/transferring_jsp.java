package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class transferring_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://github.com/rubyeffect/easy_fill/tree/master/lib/easy_fill-0.0.1.min.js\"></script>\r\n");
      out.write("  <title>Money Transfer</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"appointment.css\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min1.css\">\r\n");
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
      out.write("<Style>\r\n");
      out.write("body{\r\n");
      out.write("background-image:url(\"image/r11.jpg\");\r\n");
      out.write("background-size:cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</Style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("    <h3 style=\"font-weight: bold; text-align: center;margin-top: 10px\">Money Details</h3><br>\r\n");
      out.write("  \r\n");
      out.write("    <form method=\"post\" action=\"moneysending.jsp\" >\r\n");
      out.write("    \r\n");
      out.write("      <input type=\"hidden\" class=\"form-control\" id=\"from\" value=\"");
      out.print(id);
      out.write("\"placeholder=\"Enter price for year\" name=\"id\" >\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"card col-sm-5\" style=\"padding-bottom:10px;background-color: #333;color:#fff;padding:10px;margin-left:30%;width: 38em;margin-bottom: 25px\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"Pemail\"  style=\"color:#fff;\"><i class=\"fa fa-inr\"></i>Money From.</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"from\" value=\"");
      out.print(pemail);
      out.write("\"placeholder=\"Enter price for year\" name=\"from\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("          <label for=\"Cemail\"  style=\"color:#fff;\"><i class=\"fa fa-inr\"></i>Money To.</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"to\" value=\"");
      out.print(cmail);
      out.write("\"placeholder=\"Enter price for year\" name=\"to\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"Check No\"  style=\"color:#fff;\"><i class=\"fa fa-inr\"></i>Check No.</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"phone_no\" value=\"");
      out.print(checkno);
      out.write("\"placeholder=\"\" name=\"checkno\" required readonly>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"Amount\"  style=\"color:#fff;\">Amount In Word</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"address\" value=\"");
      out.print(checkwrd);
      out.write("\"placeholder=\"\" name=\"aword\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("          <label for=\"date\"  style=\"color:#fff;\">Date </label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"password1\" value=\"");
      out.print(date);
      out.write("\" placeholder=\"\" name=\"date\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"Amount\"  style=\"color:#fff;\">Amount</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"phone_no\" value=\"");
      out.print(amount);
      out.write("\" placeholder=\"\" name=\"amount\" required readonly>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("       <br>\r\n");
      out.write("       \r\n");
      out.write("        <center><button  class=\"btn btn-primary btn-block\"  style=\"width:50%;\" onclick=\"return Validate()\">Submit</button></center><br>\r\n");
      out.write("               \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("     \r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
