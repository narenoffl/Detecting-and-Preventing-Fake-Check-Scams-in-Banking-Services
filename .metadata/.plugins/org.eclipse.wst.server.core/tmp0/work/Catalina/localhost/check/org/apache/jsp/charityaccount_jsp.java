package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbcon.Dbconn;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public final class charityaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/account.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

String cemail=request.getParameter("cemail");
String amount=request.getParameter("amount");

      out.write("\r\n");
      out.write("\r\n");
String chemail=session.getAttribute("cemail").toString(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-color:#8BA6E9;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("background-color:#D7B7BC;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t \r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"dashboardContainer\">\r\n");
      out.write("  <div class=\"menu\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("    \r\n");
      out.write("  ");
	

	 Connection d = Dbconn.create();
	 PreparedStatement p = d.prepareStatement("SELECT sum(amount) FROM `scam`.`transmoney` where cemail='"+chemail+"'");
	 System.out.println(p);
	 ResultSet rp = p.executeQuery();
	
		while (rp.next()){
					
			
			
			amount=rp.getString(1);
	
		}							
	
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("      <div class=\"imgHolder\">\r\n");
      out.write("       <!--  <img src=\"https://i.imgrpost.com/imgr/2017/11/17/001-money.png\" alt=\"001-money.png\" border=\"0\"> -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <h3>CharityBank</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"profile\">\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"details\">\r\n");
      out.write("        ");
      out.print(cemail );
      out.write(" <br> <span>ID: 2014112</span>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"info\">\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("      <h4>Personal Account</h4>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"firstRow\">\r\n");
      out.write("      <div class=\"elemfirst\" id=\"first\">\r\n");
      out.write("        <h5>ACCOUNT DETAILS</h5>\r\n");
      out.write("        <p><strong>ACCOUNT HOLDER</strong><br>");
      out.print(cemail );
      out.write("</p>\r\n");
      out.write("        <p><strong>ACCOUNT NO</strong><br> 211-XXX-3546-XXX</p>\r\n");
      out.write("        <!-- <p><strong>ACCOUNT TYPE</strong><br> Savings Account</p> -->\r\n");
      out.write("        <p></p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"elemfirst\">\r\n");
      out.write("        <h5>BALANCE ( in Indian Rupees  )</h5>\r\n");
      out.write("        <div id=\"balance\" ><i class=\"fa fa-rupee-sign\"></i> Rs.");
      out.print(amount );
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
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
