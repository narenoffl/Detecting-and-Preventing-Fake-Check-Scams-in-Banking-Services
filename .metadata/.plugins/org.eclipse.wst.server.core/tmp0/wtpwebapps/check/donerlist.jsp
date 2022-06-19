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
<Style>
p{
Color:red;
text-align:center;}
body{
background-color:#8BA6E9;
}
table{
background-color:#D7B7BC;
}
</Style>
<body><br><br><br>
<center><button type="button" class="btn btn-primary" onclick="history.back()">back</button></center>
<br><br><div class="container">
             <p> Doner List </p>
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Donation from</th>
        <th>Receiver</th>
        <th>Date</th>
         <th>Amount</th>
       
       
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`moneytrans` ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	
    /* 	String image=rs.getString(8); */
    	  
    	   
       %>
    <tbody>
      <tr>
       <td><%=rs.getString(1)%></td>
        <td><%=rs.getString(2)%></td>
        <td><%=rs.getString(5)%></td>
        <td><%=rs.getString(6)%></td>
     	
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</body>
</html>