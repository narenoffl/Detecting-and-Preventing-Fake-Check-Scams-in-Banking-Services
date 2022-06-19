<html lang="en">
<%@ page import="java.util.*"%>
<head>
<script type="text/javascript" src="https://github.com/rubyeffect/easy_fill/tree/master/lib/easy_fill-0.0.1.min.js"></script>
  <title>Money Transfer</title>
  <link rel="stylesheet" type="text/css" href="appointment.css" />
  <link rel="stylesheet" href="css1/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min1.css">
</head>
<% String id=request.getParameter("id");
String checkno=request.getParameter("chckno");
String checkwrd=request.getParameter("chckword");
String date=request.getParameter("date");
String charityname=request.getParameter("charityname");
String desc=request.getParameter("desc");
String amount=request.getParameter("amount");
String cmail=request.getParameter("cmail");
String city=request.getParameter("city");
String pic=request.getParameter("pic");
String encrypt=request.getParameter("encrypt");
String status=request.getParameter("status");
String pemail=request.getParameter("pemail");
String address=request.getParameter("address");
%>
<Style>
body{
background-image:url("image/r11.jpg");
background-size:cover;
}

</Style>



<body>


  <div class="container">
  
    <h3 style="font-weight: bold; text-align: center;margin-top: 10px">Money Details</h3><br>
  
    <form method="post" action="moneysending.jsp" >
    
      <input type="hidden" class="form-control" id="from" value="<%=id%>"placeholder="Enter price for year" name="id" >
     <div class="row">
       <div class="card col-sm-5" style="padding-bottom:10px;background-color: #333;color:#fff;padding:10px;margin-left:30%;width: 38em;margin-bottom: 25px">
        
        
        <div class="form-group">
          <label for="Pemail"  style="color:#fff;"><i class="fa fa-inr"></i>Money From.</label>
          <input type="text" class="form-control" id="from" value="<%=pemail%>"placeholder="Enter price for year" name="from" required>
        </div>
        
          <div class="form-group">
          <label for="Cemail"  style="color:#fff;"><i class="fa fa-inr"></i>Money To.</label>
          <input type="text" class="form-control" id="to" value="<%=cmail%>"placeholder="Enter price for year" name="to" required>
        </div>
        
  
        <div class="form-group">
          <label for="Check No"  style="color:#fff;"><i class="fa fa-inr"></i>Check No.</label>
          <input type="text" class="form-control" id="phone_no" value="<%=checkno%>"placeholder="" name="checkno" required readonly>
        </div>
        <div class="form-group">
          <label for="Amount"  style="color:#fff;">Amount In Word</label>
          <input type="text" class="form-control" id="address" value="<%=checkwrd%>"placeholder="" name="aword" required>
        </div>
         <div class="form-group">
          <label for="date"  style="color:#fff;">Date </label>
          <input type="text" class="form-control" id="password1" value="<%=date%>" placeholder="" name="date" required>
        </div>
        <div class="form-group">
          <label for="Amount"  style="color:#fff;">Amount</label>
          <input type="text" class="form-control" id="phone_no" value="<%=amount%>" placeholder="" name="amount" required readonly>
        </div>
      
       <br>
       
        <center><button  class="btn btn-primary btn-block"  style="width:50%;" onclick="return Validate()">Submit</button></center><br>
               
      </div>
    </div>
    <hr>
     
  </form>
</div>
</body>

</html>