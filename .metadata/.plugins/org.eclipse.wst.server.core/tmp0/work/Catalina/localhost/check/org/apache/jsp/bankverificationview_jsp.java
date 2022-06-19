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

public final class bankverificationview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <link rel=\"stylesheet\" href=\"css1/bootstrap.min.css\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background-color:#D1EEE1;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body><br><br><br>\r\n");
      out.write("<center>\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" onclick=\"history.back()\">back</button>\r\n");
      out.write("</center><br><br>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("              <div class=\"table-responsive-sm\">  \r\n");
      out.write("  <table class=\"table table-striped\">\r\n");
      out.write("    <thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("       \r\n");
      out.write("        <th>Charity Name</th>\r\n");
      out.write("         <th>Charity mail</th>\r\n");
      out.write("        <th>Verified By</th>\r\n");
      out.write("        <th>Purpose</th>\r\n");
      out.write("         <th>Amount</th>\r\n");
      out.write("        <th>Send</th>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("     ");

       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`checkdetails` where status='Verified' ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	   
    	String pic=rs.getString(10);
    	
    	   
       
      out.write("\r\n");
      out.write("    <tbody>\r\n");
      out.write("      <tr>\r\n");
      out.write("      \r\n");
      out.write("\t \r\n");
      out.write("      \r\n");
      out.write("         <td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(rs.getString(13));
      out.write("</td>\r\n");
      out.write("      \r\n");
      out.write("      <td>");
      out.print(rs.getString(6));
      out.write("</td> \r\n");
      out.write("        <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <td><a href=\"sendmoney.jsp?id=");
      out.print(rs.getString(1));
      out.write("&&chckno=");
      out.print(rs.getString(2));
      out.write("&&chckword=");
      out.print(rs.getString(3));
      out.write("&&date=");
      out.print(rs.getString(4));
      out.write("&&charityname=");
      out.print(rs.getString(5));
      out.write("&&desc=");
      out.print(rs.getString(6));
      out.write("&&amount=");
      out.print(rs.getString(7));
      out.write("&&cmail=");
      out.print(rs.getString(8));
      out.write("&&city=");
      out.print(rs.getString(9));
      out.write("&&pic=");
      out.print(rs.getString(10));
      out.write("&&encrypt=");
      out.print(rs.getString(11));
      out.write("&&status=");
      out.print(rs.getString(12));
      out.write("&&pemail=");
      out.print(rs.getString(13));
      out.write("&&address=");
      out.print(rs.getString(14));
      out.write("\"><button class=\"btn btn-primary\">View check</button></a> \r\n");
      out.write("       \r\n");
      out.write("      </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("    \t");
} 
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
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
