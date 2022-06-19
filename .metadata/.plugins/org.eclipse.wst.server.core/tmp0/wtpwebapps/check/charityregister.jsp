<html lang="en">
<head>
<script type="text/javascript" src="https://github.com/rubyeffect/easy_fill/tree/master/lib/easy_fill-0.0.1.min.js"></script>
  <title>Reach Me</title>
  <link rel="stylesheet" type="text/css" href="appointment.css" />
  <link rel="stylesheet" href="css1/bootstrap.min.css">
</head>
<Style>
body{
background-color:#5DADE2;

}
</Style>


<body>

  <div class="container">
    <h3 style="font-weight: bold; text-align: center;margin-top: 10px">Charity Register Details</h3><br>
    <form method="post" action="charityreg" enctype="multipart/form-data">
     <div class="row">
       <div class="card col-sm-5" style="padding-bottom:10px;background-color: #333;color:#fff;padding:10px;margin-left:30%;width: 38em;margin-bottom: 25px">
        <div class="form-group">
          <label for="full_name" style="color:#fff;">Charity  Name:</label>
          <input type="text" class="form-control" id="full_name" placeholder="Enter Charity Name" name="name" required>
        </div>
        <div class="form-group">
          <label for="email"  style="color:#fff;">Charity Email:</label>
          <input type="email" class="form-control" id="email" placeholder="Charity Email" name="email"  required>
          
        </div>
        <div class="form-group">
          <label for="password1"  style="color:#fff;">Contact Number</label>
          <input type="number" class="form-control" onKeyPress="if(this.value.length==10) return false;" id="password1" placeholder="Contact Number" name="area" required>
        </div>
       <div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">ABOUT INFO</label>
  <textarea class="form-control" name="about" id="exampleFormControlTextarea1" rows="3"></textarea>
</div>
 <div class="form-group">
          <label for="password1"  style="color:#fff;">City</label>
          <input type="text" class="form-control" placeholder="City" name="city" required>
        </div>
         <div class="form-group">
          <label for="password1"  style="color:#fff;">State</label>
          <input type="text" class="form-control" " placeholder="State" name="state" required>
        </div>
        <div class="form-group">
          <label for="address"  style="color:#fff;">password </label>
          <input type="text" class="form-control"  id="address" placeholder="Enter Password" name="pass" required>
        </div>
         
        <div class="form-group">
          <label for="card_photo"  style="color:#fff;">Charity Upload photo:</label>
          <input type="file" class="form-control" placeholder="Enter password" name="photo" accept="image/*" onchange="preview_image(event)" required>
        </div>
        <div class="form-group">
          <label  style="color:#fff;">Your selected File:</label><br>
          <img src="" id="output_image"/ height="200px">
        </div><br>
        <center><button id="submit" name="donator_register" class="btn btn-primary btn-block"  style="width:50%;" onclick="return Validate()">Register</button></center><br>
      </div>
    </div>
    <hr>
    
  </form>
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