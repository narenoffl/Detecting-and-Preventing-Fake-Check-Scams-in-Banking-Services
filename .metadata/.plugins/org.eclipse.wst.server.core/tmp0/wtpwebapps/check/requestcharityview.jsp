<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="dbcon.Dbconn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.FileInputStream" %>
<%@page import="java.io.IOException" %>
<%@page import="java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css1/bootstrap.min.css"> 


</head>
<style>
body{
background-color:#8BA6E9;
}
table{
background-color:#D7B7BC;
}
</style>

<% String email=session.getAttribute("pemail").toString(); %>
<body>
<center><br><br>
<br><button type="button" class="btn btn-primary" onclick="history.back()">back</button>
</center>
<div class="container"><br><br>
              <div class="table-responsive-sm">  
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Name</th>
         <th>Charity Name</th>
        <th>charity Email</th>
        <th>Purpose</th>
         <th>Charity Contact Number</th>
       <th>Donation</th>
       
       
      
        
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`charityreq` where remail='"+email+"'");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	
    	
    	   
       %>
    <tbody>
      <tr>
        <td><%=rs.getString(2)%></td>
         <td><%=rs.getString(7)%></td>
        <td><%=rs.getString(4)%></td>
        <td><%=rs.getString(5)%></td>
      
        <td><%=rs.getString(6)%></td>
      
      

       <td><a href="check.jsp?cname=<%=rs.getString(7)%>&&purp=<%=rs.getString(5)%>&&cemail=<%=rs.getString(4)%>"><button class="btn btn-primary">Donation</button></a>
       
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</div>
</body>
</html>