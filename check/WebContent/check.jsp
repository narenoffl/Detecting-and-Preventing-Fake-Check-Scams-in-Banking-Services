<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link  rel="stylesheet" href="CSS/check.css">
<script type="text/javascript" src="https://github.com/rubyeffect/easy_fill/tree/master/lib/easy_fill-0.0.1.min.js"></script>
</head>
<% String cname=request.getParameter("cname");
String purp=request.getParameter("purp");
String cemail=request.getParameter("cemail");
%>
<%

Random r = new Random();
String randno = String.valueOf(r.nextInt(999999999));


%>
 <% String email=session.getAttribute("pemail").toString(); %> 
<body>
<br><br><br>
<div class="check">
  <div class="border">
    <div class="container">
    <form action="check" method="post" enctype="multipart/form-data">
      <div class="content">
        <div class="one">
        
          <table class="following">
            <tr>
         
          
              <td class="line">This check is in payment of the following</td>
     <%--        <tr><td class="empty line"><input type="text" name="email" value="<%=email %> " ></td> --%>
            
            
          </table>
        
        <div class="number" >
        Check no:
        <input type="show" value="<%= randno%>"  name="cno" size="15"></div>
        </div>
        <br><br>
  <div class="orderof"><input type="text" placeholder="INSERT_AMOUNT TYPE WORD"  name="amount" size="15"><span class="dollar"><span class="bd"></span>Rupees</span></div><br>
  
   
<table class="info"><br><br><br>
	<thead>
	<tr>
	
	<th class="chart">date</th>
	<th class="chart">to the order of</th>

	<th class="chart">description</th>
	
	</tr>
	</thead>
	<tbody>
	<tr>
	
<td class="blank short"><input type="date" PLACEHOLDER="  " name="date" size="35"></td>
	<td class="blank long"><input type="text" value="<%=cname %>" name="cname" size="15" readonly></td>

	<td class="blank long des"><input type="text"  Value="<%=purp%>" name="description" size="15" readonly></td>
	
	</tr>
	</tbody>
	</tr>
	</tbody>
</table>

    <div class="amount">
      <span class="amounts"><p>check</p> <p>amount</p></span>
      <div class="sign">
      </div>
      <div class="box">
        <div class="whole"><input type="text" name="rs" placeholder="0000" size="13" style="width:60px;"></div>
      
        </div>
        
         
     	      <input type="hidden" value="<%=cemail %>" name="charityemail" placeholder="0000" size="13" >
      
        		  <input type="hidden" value="<%=email %>" name="pemail" placeholder="0000" size="13" >
 	    
        </div>
        
       <table class="add">
    	    <td class="lines"><input type="text" PLACEHOLDER="INSERT_ADDRESS" name="address" size="13" required></td>
    	    <tr>
    	    <td class="lines"><input type="text" PLACEHOLDER="CITY, STATE ZIP" name="citystate" size="13" required></td>
    	    <tr>
    	    <td class="bank">Bank Name, N.A.</td>
     
       </table>
	 
	   <table class="signature">
	  		 <td><p>signature</p>
			<input type="file"  name="filename" size="13" accept="image/*" onchange="preview_image(event)" required></td>
			<tr>
		<td class="mp"></td>
	</table>
	
	
	<table>
	
         <img src="" id="output_image"/ height="100px">
        </div>
        </table>
	<table class="signature">
	

		<td> <button type="submit" value="Submit">Submit</button></td>
		<tr>
<td class="mp"></td>
	</table>
    </div>
 
  </form>
      </div>
    </div>
    
      </div>
  
</body>
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

</html>