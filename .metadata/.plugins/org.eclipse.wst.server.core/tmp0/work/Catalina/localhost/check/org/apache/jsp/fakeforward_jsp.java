package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbcon.Dbconn;
import java.sql.PreparedStatement;
import java.sql.*;

public final class fakeforward_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");



String checkno=request.getParameter("cno");
String checkwrd=request.getParameter("aword");
String date=request.getParameter("date");
String charityname=request.getParameter("cname");
String desc=request.getParameter("description");
String amount=request.getParameter("rs");
String cmail=request.getParameter("charityemail");
String city=request.getParameter("citystate");
String pic=request.getParameter("filename");

String encrypt=request.getParameter("encrypt");
String pemail=request.getParameter("pemail");
String address=request.getParameter("address");


try{
	Connection con=Dbconn.create();
	PreparedStatement ps=con.prepareStatement("INSERT INTO `scam`.`fakecheck` VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
	ps.setString(1, checkno);
	ps.setString(2, checkwrd);
	ps.setString(3, date);
	ps.setString(4, charityname);
	ps.setString(5, desc);
	ps.setString(6, amount);
	ps.setString(7, cmail);
	ps.setString(8, city);
	ps.setString(9, pic);
	ps.setString(10, encrypt);
	ps.setString(11, pemail);
	ps.setString(12, address);
	ps.setString(13, "complaint");

	ps.executeUpdate();
	response.sendRedirect("Fakecharmain.jsp?msg=vaild");
}
catch(Exception e)
{
	System.out.print(e);
	response.sendRedirect("errorr.jsp?msg=invaild");
}

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
