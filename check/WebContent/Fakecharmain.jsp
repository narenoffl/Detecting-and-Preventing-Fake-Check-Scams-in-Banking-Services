<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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

</style>


</head>
<body>

<ul>

		
        <li><a href="homepage.jsp">Logout</a></li> 
        <li><a href="faccountdetails.jsp">Account</a></li> 
        <li><a href="fchdonationview.jsp">Donation</a></li>       
      <!--   <li><a href="fpubliccheckview.jsp">RequestView</a></li>  -->
        <li><a href="fcharityrequest.jsp">Request</a></li>       
        <li><a href="homepage.jsp">Home</a></li>
  
</ul>
<br><br>
<center>
<div class="myDiv2">
Charity Mainpage
</div></center>

</body>
</html>