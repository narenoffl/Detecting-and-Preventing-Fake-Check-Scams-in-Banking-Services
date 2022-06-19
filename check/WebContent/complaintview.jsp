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
<%-- <% String cemail=session.getAttribute("cemail").toString(); %>   --%>
<style>
body{
background-color:#8BA6E9;
}
table{
background-color:#D7B7BC;
}
</style>

<body><br><br><br>
<center>
<button type="button" class="btn btn-primary" onclick="history.back()">back</button>
</center>
<br>
<div class="container">
              <div class="table-responsive-sm">  
  <table class="table table-success table-striped">
    <thead class="table-dark">
      <tr>
       
        <th>Meassage</th>
         <th>Charity mail</th>
        <th>People Email</th>
        <th>Charity Name</th>
         <th>Deactivate Account</th>
        
       
       
      
        
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`fakecheck` where status='complaints' ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	   
    
    	
    	   
       %>
    <tbody>
      <tr>
      
	 
      
         <td><%=rs.getString(5)%></td>
       
       
      
      <td><%=rs.getString(7)%></td> 
        <td><%=rs.getString(11)%></td>
         <td><%=rs.getString(4)%></td>
   
      
      

     <td><a href="Complaintcharlist.jsp?id=<%=rs.getString(7)%>"><button class="btn btn-primary">Charity List</button></a>
       
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</div>
</body>
</html>