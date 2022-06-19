package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbcon.Dbconn;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Block;
import bean.transfer;
import dbcon.Dbconn;
import imple.imple;
import inter.inter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class moneysending_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


String pemail=request.getParameter("from");
String cemail=request.getParameter("to");
String checkno=request.getParameter("checkno");

String inword=request.getParameter("aword");
String date=request.getParameter("date");
String amount=request.getParameter("amount");
String id=request.getParameter("id");
System.out.println(id);

String prehash="";
String afterhash="";

String status="Transferred";
/* String ad="Admin@gmail.com"; */
Connection con;
con=Dbconn.create();
try {
	PreparedStatement pa=con.prepareStatement("SELECT phash,ahash FROM `scam`.`transmoney`");
	ResultSet rs=pa.executeQuery();
	
/* 	PreparedStatement pa1=con.prepareStatement("UPDATE scam.checkdetails c SET status='"+status+"' where id='"+id+"'");
	ResultSet rs1=pa1.executeQuery(); */
	
	while(rs.next()){
		prehash=rs.getString(1);
		afterhash=rs.getString(2);
		
	}
	 
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try{
	
	Statement st=con.createStatement();
	st.executeUpdate("UPDATE scam.checkdetails c SET status='"+status+"' where id='"+id+"' ");

}
catch(Exception e){
	response.sendRedirect("error.jsp?inval id");
System.out.println(e);
}



System.out.println(afterhash);
prehash=afterhash;

 
 
 
Block genesisBlock = new Block("Hi im the first block", "0");

String phas=genesisBlock.hash;

Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
System.out.println("Hash for block 2 : " + secondBlock.hash);
String aphas=secondBlock.hash;
/* String address="";
String city="";
String state="";
String country=""; */

transfer ap=new transfer();
ap.setPemail(pemail);
ap.setCemail(cemail);
ap.setCheckno(checkno);
ap.setAmountinword(inword);
ap.setDate(date);
ap.setAmount(amount);
ap.setPhash(prehash);
ap.setAhash(aphas);



inter r=new imple();
int m=r.trans(ap);
if(m==1){
	
	response.sendRedirect("bankmainpage.jsp");
	
}
else{
	response.sendRedirect("error.jsp");
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
