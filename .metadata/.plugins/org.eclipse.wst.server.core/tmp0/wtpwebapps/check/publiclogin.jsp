<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Public Login</title>
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
color: #ffffff; 
}
.myDiv3 {
  font-size:25px;  
  font-style:bold;
font-weight: bold;
color: Blue; 
}

body{


 background-image: url(Local/char3.jpg);
 background-size:cover;

}


</style>



</head>
<body>

<br><br><br>
<center>
<div class="myDiv2">
Public Login
</div>
</center>
<br><br>

<div class="myDiv">
<center>
  <form action="Publicloginservlet" method="post">
  <input type="text" class="fa fa-user" name="username" placeholder="Username" autocomplete="off"style="width:280px;height:40px;text-align:center;"><br><br>
  <input type="password" class="fa fa-user" name="password" placeholder="Password" id="myInput" style="width:280px;height:40px;text-align:center;"><br><br>
  <input type="checkbox" onclick="myFunction()">Show Password<br><br>
  <input type="submit" value="Login" style="width:100px;height:40px;border-radius: 10px;background-color:yellow;background-color:blue;color:white;"><br><br>

   
   <div class="myDiv3">
New User <a href="publicregister.jsp">Signup</a>
</div>
   
  </form>
  </center>
</div>


</body>
<script>
function myFunction() {
  var x = document.getElementById("myInput");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>
</html>