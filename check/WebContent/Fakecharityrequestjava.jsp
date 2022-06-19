<%@ page import="dbcon.Dbconn" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.*"%>
<%

String name=request.getParameter("name");
String age=request.getParameter("age");
String email=request.getParameter("email");

String doctor=request.getParameter("doctor");
String description=request.getParameter("description");

/* String address="";
String city="";
String state="";
String country=""; */
try{
	Connection con=Dbconn.create();
	PreparedStatement ps=con.prepareStatement("INSERT INTO `specialist`.`suggest` VALUES(?,?,?,?,?)");
	ps.setString(1, name);
	ps.setString(2, age);
	ps.setString(3, email);
	ps.setString(4, doctor);
	ps.setString(5, description);

	ps.executeUpdate();
	response.sendRedirect("suggestsend?msg=vaild");
}
catch(Exception e)
{
	System.out.print(e);
	response.sendRedirect("signup.jsp?msg=invaild");
}
%>