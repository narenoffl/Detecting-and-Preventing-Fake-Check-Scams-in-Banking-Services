<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%-- <%@page import="dbconn.Dbconn"%> --%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="appointment.css" />
  <link rel="stylesheet" href="css1/bootstrap.min.css"> >

<style>
.myDiv {
border: 5px;
  background-image:url(Local/char6.jfif);    
  background-size:cover;
  border-radius: 5px;
  width:400px;
  height:390px;
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


body{
background-image:url(Local/char5.jpg);
background-size:cover;
}

</style>


</head>
<body>
<div class="container">
    <h3 style="font-weight: bold; text-align: center;margin-top: 10px"> Register Details</h3><br>
    <form method="post" action="Publicregservlet" enctype="multipart/form-data">
     <div class="row">
       <div class="card col-sm-5" style="padding-bottom:10px;background-color: #333;color:#fff;padding:10px;margin-left:30%;width: 38em;margin-bottom: 25px">
        <div class="form-group">
          <label for="full_name" style="color:#fff;">  Name:</label>
          <input type="text" class="form-control" id="full_name" placeholder="Enter  Name" name="name" required>
        </div>
        <div class="form-group">
          <label for="email"  style="color:#fff;"> Email:</label>
          <input type="email" class="form-control" id="email" placeholder=" Email" name="email"  required>
          
        </div>
        <div class="form-group">
          <label for="password1"  style="color:#fff;">Contact Number</label>
          <input type="number" class="form-control" onKeyPress="if(this.value.length==10) return false;" id="password1" placeholder="Contact Number" name="cnum" required>
        </div>
    
 <div class="form-group">
          <label for="password1"  style="color:#fff;">Password</label>
          <input type="password" class="form-control" placeholder="Password" name="pass" id="password1" required>
        </div>
         <div class="form-group">
          <label for="password1"  style="color:#fff;">Confirm Password</label>
          <input type="password" class="form-control" " placeholder="Confirm Password" name="pass" id="password2" required>
        </div>
        <br>
        <div class="form-group">
         <label for="duration">Gender</label>
        <input type="radio" name="gender" value="male" checked> male
        <input type="radio" name="gender" value="female"> female
        </div>
         <br>
        <div class="form-group">
          <label for="card_photo"  style="color:#fff;">Charity Upload photo:</label>
          <input type="file" class="form-control" placeholder="Enter password" name="photo" accept="image/*" onchange="preview_image(event)" required>
        </div>
        <div class="form-group">
          <label  style="color:#fff;">Your selected File:</label><br>
          <img src="" id="output_image"/ height="200px">
        </div>
        <center><button id="submit" name="donator_register" class="btn btn-primary btn-block"  style="width:50%;" onclick="return Validate()">Register</button></center><br>
      </div>
    </div>
    
  </form>
</div>


<script type='text/javascript'>
  function preview_image(event)
  {
    var reader = new FileReader();
    reader.onload = function()
    {
      var output = document.getElementById('output_image');
      output.src = reader.result;
    }
    reader.readAsDataURL(event.target.files[0]);
  }
  </script>
  </body>
</html>


