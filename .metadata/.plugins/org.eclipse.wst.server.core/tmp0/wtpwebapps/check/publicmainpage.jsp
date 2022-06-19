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
<title>Public Mainpage</title>
<link rel="stylesheet" href="css1/bootstrap.min.css">

<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #4bc99b;
}

li {
  float: right;
  padding-right:185px;
}

li a {
  display: block;
  color: white;
  text-align: center;
  text-style:bold;
  padding: 14px 16px;
  text-decoration: none;
}

.myDiv2 {
  font-size:25px;  
  font-style: italic;
font-weight: bold;
color:green; 
}

body {
    background-image: url("bgimages/charity3.jpg");  
   background-repeat: no-repeat;  
   background-size: cover;
   
   /* background: linear-gradient(to bottom, #996633 0%, #ff66cc 100%); */
   /* background-image: linear-gradient(to right, red , yellow); */
}

.notification {
  background-color: #F8C471;
  color: black;
  text-decoration: none;
  padding: 7px 26px;
  position: relative;
  display: inline-block;
  border-radius: 2px;
}

.notification:hover {
  background: ;
}

.notification .badge {
  position: absolute;
  top: -4px;
  right: -10px;
  padding: 4px 10px;
  border-radius: 50%;
  background: red;
  color: white;
}
</style>


</head>
<body>

<%String user=session.getAttribute("pemail").toString(); %>
	<%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`charityreq` where status='Request' and remail='"+user+"'");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
        
    	   int count=rs.getInt(1);
    	 
   
    	
    
    	  
    	   
       %>
	
		
	
<ul>
		
        <li><a href="homepage.jsp" class="btn btn-warning">Logout</a></li>        
        <li><a href="publicresptobank.jsp" class="btn btn-warning">Response(Bank)</a></li>
        <li><a href="requestcharityview.jsp" class="notification">Request view(Charity)<span class="badge">(<%=count%>)</span></a></li>       
        <li><a href="homepage.jsp">Home</a></li>
  
</ul>
<br><br>
<center>
<div class="myDiv2">
Public Mainpage
</div></center>
<%} %>
</body>
</html>