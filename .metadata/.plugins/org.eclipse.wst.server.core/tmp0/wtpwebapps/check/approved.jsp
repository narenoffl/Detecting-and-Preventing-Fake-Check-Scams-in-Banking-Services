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
<link rel="stylesheet" href="css1/bootstrap.min.css">
<title>Insert title here</title>
</head>
<style>
.card{
background-color:light-yellow;

background-size:cover;}
. p{
color:blue;}

body{
background-color:#8BA6E9;
}
table{
background-color:#D7B7BC;
}

</style>

<body><br><br>

<div class="container">
<div class="row">


  

   
	
       <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`charityreg` ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	
    	String image=rs.getString(9);
    	  
    	   
       %><br>
<div class="col-md-4">
<div class="card">
	

	  <div class="card-body">
	  <%--      <td><img src="Local/<>" width="70" height="70"/></td> --%>
	  <p class="card-text"><img class="card-img-top" src="Local/<%=image %>" width="40" height="150" alt="Card image cap"></p>
	  
   <p class="card-text">Charity Name: <%=rs.getString(2)%></p>
    <p class="card-text">Charity Email:<%=rs.getString(3)%></p>
    <p class="card-text">contact no:<%=rs.getString(4)%></p>
    <p class="card-text">purpose:<%=rs.getString(5)%></p>    
    <p class="card-text">city :<%=rs.getString(6)%></p>
       <p class="card-text">state:<%=rs.getString(7)%></p>    
  <p class="card-text">Status :<span style="color:Red"><%=rs.getString(10)%></span></p> 

      <a href="verified.jsp?id=<%=rs.getString(1)%>"><button class="btn btn-primary">Verified</button></a>
       <a href="deactivate.jsp?id=<%=rs.getString(1)%>"><button class="btn btn-primary">Deactivate</button></a>
    
      </div>
      </div>
      </div>

	<%} %>
	</div>
 </div>
</body>
</html>