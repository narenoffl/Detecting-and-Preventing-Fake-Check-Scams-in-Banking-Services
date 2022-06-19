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
<title>Charity Management Home</title>
</head>

<style>
body {
  font-family: "Lato", sans-serif;
  background-image:url("bgimages/c3.jpg");
  background-size: cover;
}

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
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
       PreparedStatement ps=con.prepareStatement("SELECT count(*) FROM `scam`.`charityreg` where status='Verification'");
       
       ResultSet rs=ps.executeQuery();
     
 		PreparedStatement ps1=con.prepareStatement("SELECT count(*) FROM `scam`.`fakecheck` where status='complaints'");
       
       ResultSet rs1=ps1.executeQuery();
       
       while(rs.next() && rs1.next())
       {
        
    	   int count=rs.getInt(1);
    	   int count1=rs1.getInt(1);
    
   
    	
    
    	  
    	   
       %>



<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="approved.jsp" class="notification"> Charity Approved <span class="badge">(<%=count%>)</span></a>
  <a href="publiclist.jsp">Allocation</a>
  <a href="donerlist.jsp">DonaterList</a>
  <a href="complaintview.jsp" class="notification">Complaint view<span class="badge">(<%=count%>)</span> </a>
  <a href="logout.jsp">Logout</a>
</div>
<%} %>

<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span>

<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "200px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}
</script>
   
</body>

</html>