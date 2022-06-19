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
<title>Charity Mainpage</title>
<link rel="stylesheet" href="css1/bootstrap.min.css">

<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #cccc00;
}

li {
  float: right;
  padding-right:85px;
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
    background-image: url("bgimages/charity4.jpg");  
   background-repeat: no-repeat;  
   background-size: cover;
   
  
}
.notification {
  background-color: ;
  color: red;
  text-decoration: none;
  padding: 15px 26px;
  position: relative;
  display: inline-block;
  border-radius: 4px;
}

.notification:hover {
  background:;
}

notification.badge {
  position: absolute;
  top: -1px;
  right: -10px;
  padding: 5px 10px;
  border-radius: 10%;
  background: red;
  color: black;
}

</style>


</head>
<body>
<%String charity=session.getAttribute("cemail").toString(); %>
 <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`checkdetails` where status='Donation' and Charityemail='"+charity+"'");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
        
    	   int count=rs.getInt(1);
    	 
   
    	
    
    	  
    	   
       %>

<ul>

		
        <li><a href="homepage.jsp" class="btn btn-danger">Logout</a></li> 
        <li><a href="accountdetails.jsp" class="btn btn-outline-primary">Account</a></li> 
        <li><a href="charitydonationview.jsp" id="notification" class="btn btn-outline-primary">Donation<span class="badge">(<%=count%>)</span></a></li>       
        <!-- <li><a href="publiccheckview.jsp" class="btn btn-outline-primary">RequestView</a></li>  -->
        <li><a href="charityrequest.jsp" class="btn btn-outline-primary">Request</a></li>       
        <li><a href="homepage.jsp" >Home</a></li>
  
</ul>
<br><br>
<center>
<div class="myDiv2">
Charity Mainpage
</div></center>
<%} %>
</body>
</html>