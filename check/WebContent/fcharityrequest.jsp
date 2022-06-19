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
  <% String chemail=session.getAttribute("cemail").toString(); %>  
<body>
<center>
<button type="button" class="btn btn-primary" onclick="history.back()">back</button>
</center>
<div class="container">
              <div class="table-responsive-sm">  
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
         <th>Contact Number</th>
        <th>Picture</th>
        <th>Request</th>
      
        
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`pubreg` where status='Allocate'");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	
    	String image=rs.getString(8);
    	  
    	   
       %>
    <tbody>
      <tr>
        <td><%=rs.getString(2)%></td>
        <td><%=rs.getString(3)%></td>
        <td><%=rs.getString(7)%></td>
      
        <td><%=rs.getString(4)%></td>
       
      
     <td class="card-text"><img class="card-img-top" src="Local1/<%=image %>" width="30" height="30" alt="Card image cap"></td>
        <td><a href="fchreqjava.jsp?rname=<%=rs.getString(2) %>&&remail=<%=rs.getString(3)%> &&cemail=<%=chemail%>"><button class="btn btn-primary">Request</button></a>
        
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</div>
</body>
</html>