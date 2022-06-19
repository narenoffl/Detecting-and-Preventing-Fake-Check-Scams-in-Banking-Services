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
<% String cemail=session.getAttribute("cemail").toString();%>
<body>
<center>
<button type="button" class="btn btn-primary" onclick="history.back()">back</button>
</center>
<div class="container">
              <div class="table-responsive-sm">  
  <table class="table table-striped">
    <thead>
      <tr>
       
        <th>Charity Name</th>
         <th>Charity mail</th>
        <th>People Email</th>
        <th>Purpose</th>
         <th>Amount</th>
        <th>Forward</th>
       
       
      
        
      </tr>
    </thead>
     <%
       
       Connection con;
       
       
       con=Dbconn.create();
       PreparedStatement ps=con.prepareStatement("SELECT * FROM `scam`.`checkdetails` where Charityemail='"+cemail+"' ");
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
    
    	 
   
    	   
    	String pic=rs.getString(10);
    	
    	   
       %>
    <tbody>
      <tr>
      
	 
      
         <td><%=rs.getString(5)%></td>
        <td><%=rs.getString(8)%></td>
        <td><%=rs.getString(13)%></td>
      
      <td><%=rs.getString(6)%></td> 
        <td><%=rs.getString(3)%></td>
     <%--  <td><p class="card-text"><img class="card-img-top" src="Local1/<%=pic %>" width="40" height="150" alt="Card image cap"></p></td>  --%>
      
      

      <td><a href="fchcheckview.jsp?id=<%=rs.getString(1)%>&&chckno=<%=rs.getString(2)%>&&chckword=<%=rs.getString(3)%>&&date=<%=rs.getString(4)%>&&charityname=<%=rs.getString(5)%>&&desc=<%=rs.getString(6)%>&&amount=<%=rs.getString(7)%>&&cmail=<%=rs.getString(8)%>&&city=<%=rs.getString(9)%>&&pic=<%=rs.getString(10)%>&&encrypt=<%=rs.getString(11)%>&&status=<%=rs.getString(12)%>&&pemail=<%=rs.getString(13)%>&&address=<%=rs.getString(14)%>"><button class="btn btn-primary">View check</button></a> 
       
      </tr>
    </tbody>
    	<%} %>
  </table>
</div>
</div>
</body>
</html>