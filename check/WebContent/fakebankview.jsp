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
 <%-- <% String cemail=session.getAttribute("cemail").toString(); %>  --%>
 <style>
 body{
 background-color:#B676B1;
 
 }
 
 </style>
<body><br><br><br>
<center>
<button type="button" class="btn btn-primary" onclick="history.back()">back</button>
</center><br><br>
<div class="container">
              <div class="table-responsive-sm">  
  <table class="table table-striped">
    <thead>
      <tr>
       
        <th>Charity Name</th>
         <th>Charity mail</th>
        <th>People Email</th>
      
         <th>Amount</th>
        <th>Forword</th>
       
       
      
        
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`fakecheck` where status='complaint' ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	   
    	
    	
    	   
       %>
    <tbody>
      <tr>
      
	 
      
         <td><%=rs.getString(4)%></td>
        <td><%=rs.getString(7)%></td>

      
      <td><%=rs.getString(11)%></td> 
  
         <td><%=rs.getString(6)%></td>
     <!-- <td><p class="card-text"><img class="card-img-top" src="Local1/" width="40" height="150" alt="Card image cap"></p></td> -->  
      
      

  <td><a href="fakecheck.jsp?checkno=<%=rs.getString(1)%>&&checkword=<%=rs.getString(2)%>&&date=<%=rs.getString(3)%>&&cname=<%=rs.getString(4)%>&&desc=<%=rs.getString(5)%>&&amount=<%=rs.getString(6)%>&&cmail=<%=rs.getString(7)%>&&city=<%=rs.getString(8)%>&&pic=<%=rs.getString(9)%>&&encrypt=<%=rs.getString(10)%>&&pemail=<%=rs.getString(11)%>&&address=<%=rs.getString(12)%>"><button class="btn btn-primary">View check</button></a> 
       
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</div>
</body>
</html>