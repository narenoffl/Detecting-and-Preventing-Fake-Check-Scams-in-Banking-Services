<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
<link rel="stylesheet" href="css1/bootstrap.min.css">

<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   background: linear-gradient(to right, #0000ff 0%, #00ffff 100%);
}

li {
  float: right;
  padding-right:185px;
}

li a {
  display: block;
  color: white;
  text-align: center;
  text-style:bold;
  padding: 14px 16px;

  text-decoration: none;
}

body {
  background-image: url("bgimages/che.PNG");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size:100% 100%;
}

</style>


</head>
<body>

<ul>
<li><a href="banklogin.jsp" class="btn btn-outline-danger">Bank</a></li>
<li><a href="publiclogin.jsp">Public</a></li>
  <li><a href="charitylogin.jsp">Charity</a></li>
   <li><a href="maincharitylogin.jsp">Charity Management</a></li>
        
</ul>

</body>
</html>