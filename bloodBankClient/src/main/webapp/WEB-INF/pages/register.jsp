<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Bank Management System</title>

</head>
<script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>

<script type="text/javascript">
   $(document).ready(function(){
	   
	   
		  $('#submit').click(function(e){
			  var data={};
			  data.id=$("#id").val();
			  data.mobnumber=$("#mobnumber").val();
			  data.name=$("#name").val();
			  data.gender=$("#gender").val();
			  data.location=$("#location").val();
			  data.bloodgroup=$("#bloodgroup").val();
			  data.emailid=$("#emailid").val();
			  data.dateofbirth=$("#dateofbirth").val();
			  data.lastdonated=$("#lastdonated").val();
			  
			  $.ajax({
					type : 'POST',
					url : "http://localhost:2020/donor-service/donorservice/",
					dataType : 'json',
					data : JSON.stringify(data),
					contentType : 'application/json',
			        success : function(result){
			        	$('#check').text("New entry succussfully added:");
			        	$("#check").fadeOut(10000);
				        }
			  });
			  
		  });
   });
   </script>

<style>
body{
background-color: #ff9980
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=button] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

label{
  font-size:medium;
  font-weight:bold;
}
#entry {
 margin-left: 260px;
  width:550px;
  border-radius: 5px;
  background-color:#ffffcc;
  padding: 20px;
}
</style>
<body>
<header>
<jsp:include page="menu.jsp" />
</header>
<br>
<h3 style="text-align: center;size: 22px">Registration Form:</h3><br>


<div id="entry" >
  <form name="" method="post" >
  
  	<label for="name">Donor Id</label>
    <input type="text" id="donorId" name="donorId" placeholder="Enter donor id">
    
    <label for="mobnumber">Mobile Number</label>
    <input type="text" id="mobnumber" name="mobnumber" placeholder="Enter mobile number">
    
    <label for="name">Donor Name</label>
    <input type="text" id="name" name="name" placeholder="Enter donor name">
    
    <label for="gender">Gender</label>
    <select id="gender" name="gender">
      <option value="male">Male</option>
      <option value="female">Female</option>
    </select>
    
    <label for="address">Location</label>
    <input type="text" id="location" name="location" placeholder="Enter location">
    
    <label for="bloodgroup">Blood Group</label>
    <select id="bloodgroup" name="bloodgroup">
      <option value="apos">Apos</option>
      <option value="aneg">Aneg</option>
      <option value="bpos">Bpos</option>
      <option value="bneg">Bneg</option>
      <option value="opos">Opos</option>
      <option value="oneg">Oneg</option>
      <option value="abpos">ABpos</option>
      <option value="abneg">ABneg</option>
    </select>
    
    <label for="mailid">Email Id</label>
    <input type="text" id="mailid" name="mailid" placeholder="Enter email id">
    
    
    <label for="dateofbirth">Date of Birth</label>
    <input type="text" id="dateofbirth" name="dateofbirth" placeholder="Enter donor's date of birth(yyyy-mm-dd)">
    
    <label for="lastdonated">Last Donated</label>
    <input type="text" id="lastdonated" name="lastdonated" placeholder="Enter last donated date(yyyy-mm-dd)">
   
    <input type="button" value="Submit" id="submit">
  </form>
</div>
<div id="check" style="text-align: center; background-color: green; width:600px"></div>
</body>
</html>