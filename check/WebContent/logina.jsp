<%@ page import="dbcon.Dbconn" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.sql.Connection" %>
<%
String email=request.getParameter("username");
String password=request.getParameter("password");

if("Admin@gmail.com".equals(email)&& "Admin".equals(password))
{
	
	session.setAttribute("email", email);
	response.sendRedirect("maincharity.jsp");
}
else
{
	response.sendRedirect("erroe.jsp");
}

	
/* int z=0;
try{
	String status="Verified";
	Connection con=Dbconn.create();
Statement ps=con.createStatement();
	ResultSet rs=ps.executeQuery("SELECT * FROM scam.charityreg  where cemail='"+email+"' and password='"+password+"' and Status='Verified' ");
	while(rs.next())
	{
		z=1;
		HttpSession sess=request.getSession();
		session.setAttribute("cemail",email);
		response.sendRedirect("charitymainpage.jsp");
	}
	if(z==0)
		response.sendRedirect("eogin.jsp");
}

catch(Exception e){
System.out.print(e);
response.sendRedirect("login.jsp");
}
} */
%>