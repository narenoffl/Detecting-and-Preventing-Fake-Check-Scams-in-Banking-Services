<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Login</title>

<link rel="stylesheet" href="css1/bootstrap.min.css" >
<link rel="stylesheet" href="css1/all.css" >
<style>
.myDiv {
  border: 5px;
  background-image:url(Local/123.jpg);    
  border-radius: 5px;
  width:360px;
  height:290px;
  margin: auto;
  padding-top:40px;
  opacity:0.9;

  
}
.myDiv2 {
  font-size:25px;  
  font-style: italic;
font-weight: bold;
color:black; 
}

body{

background-image:url(Local/char4.jpg);
background-size:cover;
}

</style>

</head>
<body>

<br><br><br>
<center>
<div class="myDiv2">
Bank Login Page
</div>
</center>
<br><br>
<form action="Bankloginservlet" method="post">
<div class="myDiv">
<center>
  
  <input type="text" class="fa fa-user" name="username" placeholder="Username" style="width:280px;height:40px;text-align:center;"><br><br>
  <input type="text" class="fa fa-user" name="password" placeholder="Password" style="width:280px;height:40px;text-align:center;"><br><br>
  <input type="submit" value="Login" style="width:100px;height:40px;border-radius: 10px;background-color:red;"><br><br>
 
  </center>
</div>

 </form>

</body>
</html>