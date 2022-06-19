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

public final class maincharity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
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
      out.write("<title>Charity Management Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: \"Lato\", sans-serif;\r\n");
      out.write("  background-image:url(\"bgimages/c3.jpg\");\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  width: 0;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  background-color: #111;\r\n");
      out.write("  overflow-x: hidden;\r\n");
      out.write("  transition: 0.5s;\r\n");
      out.write("  padding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a {\r\n");
      out.write("  padding: 8px 8px 8px 32px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 25px;\r\n");
      out.write("  color: #818181;\r\n");
      out.write("  display: block;\r\n");
      out.write("  transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a:hover {\r\n");
      out.write("  color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav .closebtn {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  right: 25px;\r\n");
      out.write("  font-size: 36px;\r\n");
      out.write("  margin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-height: 450px) {\r\n");
      out.write("  .sidenav {padding-top: 15px;}\r\n");
      out.write("  .sidenav a {font-size: 18px;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".notification {\r\n");
      out.write("  background-color: ;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  padding: 15px 26px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".notification .badge {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: -10px;\r\n");
      out.write("  right: -10px;\r\n");
      out.write("  padding: 5px 10px;\r\n");
      out.write("  border-radius: 70%;\r\n");
      out.write("  background: yellow;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");

       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`charityreg` where status='Verification'");
       
       ResultSet rs=ps.executeQuery();
     
 		PreparedStatement ps1=con.prepareStatement("SELECT count(*) FROM `scam`.`fakecheck` where status='complaints'");
       
       ResultSet rs1=ps1.executeQuery();
       
       while(rs.next() && rs1.next())
       {
        
    	   int count=rs.getInt(1);
    	   int count1=rs1.getInt(1);
    
   
    	
    
    	  
    	   
       
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("  <a href=\"approved.jsp\" class=\"notification\"> Charity Approved <span class=\"badge\">(");
      out.print(count);
      out.write(")</span></a>\r\n");
      out.write("  <a href=\"publiclist.jsp\">Allocation</a>\r\n");
      out.write("  <a href=\"donerlist.jsp\">DonaterList</a>\r\n");
      out.write("  <a href=\"complaintview.jsp\" class=\"notification\">Complaint view<span class=\"badge\">(");
      out.print(count);
      out.write(")</span> </a>\r\n");
      out.write("  <a href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</div>\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; open</span>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openNav() {\r\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"200px\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeNav() {\r\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("   \r\n");
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
