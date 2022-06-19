<%@ page import="dbcon.Dbconn" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.*"%>
<%


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
%>