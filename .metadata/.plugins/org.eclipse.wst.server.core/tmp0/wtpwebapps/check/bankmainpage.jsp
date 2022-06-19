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
<title>Bank Mainpage</title>
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
  padding-right:80px;
}

li a {
  display: block;
  color: white;
  text-align: center;
  text-style:bold;
  padding: 12px 15px;
  text-decoration: none;
}

.myDiv2 {
  font-size:25px;  
  font-style: italic;
font-weight: bold;
color:green; 
}

body {
    background-image: url("bgimages/charity5.jpg");  
   background-repeat: no-repeat;  
   background-size: cover;
   
   /* background: linear-gradient(to bottom, #996633 0%, #ff66cc 100%); */
   /* background-image: linear-gradient(to right, red , yellow); */
}

.notification {
  background-color: ;
  color: white;
  text-decoration: none;
  padding: 15px 26px;
  position: relative;
  display: inline-block;
  border-radius: 4px;
}


}

.notification .badge {
  position: absolute;
  top: -10px;
  right: -10px;
  padding: 5px 10px;
  border-radius: 70%;
  background: yellow;
  color: black;
}
</style>


</head>
<body>
 <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`fakecheck` where status='complaint'");
       
       ResultSet rs=ps.executeQuery();
     
      
       while(rs.next())
       {
        
    	   int count=rs.getInt(1);
    
   
    	
    
    	  
    	   
       %>


<ul>
		
        <li><a href="homepage.jsp">Logout</a></li>
         <li><a href="bankverificationview.jsp">Public(verified)</a></li>     
        <li><a href="fakebankview.jsp" class="notification">Check(Suspected) <span class="badge">(<%=count%>)</span></a></li>           
        <li><a href="bankviewchar.jsp">Request(Charity)</a></li>       
        <li><a href="homepage.jsp">Home</a></li>
  
</ul>
<br><br>
<center>
<div class="myDiv2">
Bank Mainpage
</div></center>
<%} %>
</body>
</html>