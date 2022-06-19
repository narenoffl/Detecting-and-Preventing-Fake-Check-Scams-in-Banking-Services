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

public final class publicmainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Public Mainpage</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("  list-style-type: none;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #4bc99b;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding-right:185px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-style:bold;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myDiv2 {\r\n");
      out.write("  font-size:25px;  \r\n");
      out.write("  font-style: italic;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("color:green; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background-image: url(\"bgimages/charity3.jpg\");  \r\n");
      out.write("   background-repeat: no-repeat;  \r\n");
      out.write("   background-size: cover;\r\n");
      out.write("   \r\n");
      out.write("   /* background: linear-gradient(to bottom, #996633 0%, #ff66cc 100%); */\r\n");
      out.write("   /* background-image: linear-gradient(to right, red , yellow); */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".notification {\r\n");
      out.write("  background-color: #F8C471;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  padding: 7px 26px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".notification:hover {\r\n");
      out.write("  background: ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".notification .badge {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: -4px;\r\n");
      out.write("  right: -10px;\r\n");
      out.write("  padding: 4px 10px;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  background: red;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
String user=session.getAttribute("pemail").toString(); 
      out.write('\r');
      out.write('\n');
      out.write('	');

       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`charityreq` where status='Request' and remail='"+user+"'");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
        
    	   int count=rs.getInt(1);
    	 
   
    	
    
    	  
    	   
       
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("<ul>\r\n");
      out.write("\t\t\r\n");
      out.write("        <li><a href=\"homepage.jsp\" class=\"btn btn-warning\">Logout</a></li>        \r\n");
      out.write("        <li><a href=\"publicresptobank.jsp\" class=\"btn btn-warning\">Response(Bank)</a></li>\r\n");
      out.write("        <li><a href=\"requestcharityview.jsp\" class=\"notification\">Request view(Charity)<span class=\"badge\">(");
      out.print(count);
      out.write(")</span></a></li>       \r\n");
      out.write("        <li><a href=\"homepage.jsp\">Home</a></li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("<br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<div class=\"myDiv2\">\r\n");
      out.write("Public Mainpage\r\n");
      out.write("</div></center>\r\n");
} 
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
