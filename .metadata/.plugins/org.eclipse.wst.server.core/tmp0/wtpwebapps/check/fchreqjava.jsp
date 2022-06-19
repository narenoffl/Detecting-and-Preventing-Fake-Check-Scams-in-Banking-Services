<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css1/bootstrap.min.css">
<link rel="stylesheet" href="css1/style.css">
<title>Insert title here</title>
</head>
<%String name=request.getParameter("rname");
String rname=request.getParameter("remail");
String cname=request.getParameter("cemail");%>
<body>
<button style="float:right;margin-top:-60px;" class="btn btn-outline-danger"><a href="Fakecharmain.jsp" ">Back</a></button>
<div class="container">  
  <form id="contact" action="charityreq" method="post">
 

    <fieldset>
      <input placeholder="Your name" value="<%=name %>" type="text" name="rname" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Your Email Address" value="<%=rname %>" type="email" name="remail" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input  type="text"  value="<%=cname %>" name="cemail"  tabindex="3" required>
    </fieldset>
    <fieldset>
      <input placeholder="Contact No" type="number" name="number" tabindex="4" required>
    </fieldset>
    <fieldset>
      <textarea placeholder="Type your message here...." name="message" tabindex="5" required></textarea>
    </fieldset>
      <fieldset>
      <input type="text" placeholder="Charity Name" name="cname" tabindex="5" required></textarea>
    </fieldset>
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
    </fieldset>
 
  </form>
</div>
</body>
</html>