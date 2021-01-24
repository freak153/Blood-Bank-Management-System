<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donor</title>


<style>
body{
background-color: #ff9980
}
#donor {
  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  border-collapse: collapse;
  width: 100%;
}
#donor td, #donor th {
  border: 1px solid #ddd;
  padding: 8px;
}
#donor tr:nth-child(even){background-color: #f2f2f2;}
#donor tr:hover {background-color: #ddd;}
#donor th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #8f3a3a;
  color: white;
}
</style>

<script
  src="https://code.jquery.com/jquery-1.12.4.min.js"
  integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
  crossorigin="anonymous"></script>
  

<script type="text/javascript">
   $(document).ready(function(){
	   $('#findAll').click(function() {
		   var s="<table id=\"donor\" style=\"width: 900px;font-size: medium; margin-left: 115px;\"><tr><th>Donor Id</th><th>Mobile Number</th><th>Donor Name</th><th>Gender</th><th>Location</th><th>Blood Group</th>"+
		   "<th>Email id</th><th>Date Of Birth</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donorservice/donors";
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					$.each(result, function(key,value) {
                    s+="<tr><td>"+value.donorId+"</td><td>"+value.donorMobNo+"</td><td>"+value.donorName+"</td><td>"+value.gender+"</td><td>"+value.location+"</td><td>"+value.bloodGroup+"</td><td>"+value.email+"</td><td>"+value.dateOfBirth+"</td></tr>";
					
					});
					s+="</table><br><br>"
					$('#display0').html(s);
				}
			});
		});
	   $('#byId').click(function() {
		   var s="<table id=\"donor\" style=\"width: 900px;font-size: medium; margin-left: 230px;\"><tr><th>Donor Id</th><th>Mobile Number</th><th>Donor Name</th><th>Gender</th><th>Location</th><th>Blood Group</th>"+
		   "<th>Email id</th><th>Date Of Birth</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donorservice/donors/donorid/"+$("#donorid").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(value) {
					s+="<tr><td>"+value.donorId+"</td><td>"+value.donorMobNo+"</td><td>"+value.donorName+"</td><td>"+value.gender+"</td><td>"+value.location+"</td><td>"+value.bloodGroup+"</td><td>"+value.email+"</td><td>"+value.dateOfBirth+"</td></tr>";
					s+="</table><br><br>"
					$('#display1').html(s);
				}
			});
		});
	   $('#byGroup').click(function() {
		   var s="<table id=\"donor\" style=\"width: 900px;font-size: medium; margin-left: 230px;\"><tr><th>Donor Id</th><th>Mobile Number</th><th>Donor Name</th><th>Gender</th><th>Location</th><th>Blood Group</th>"+
		   "<th>Email id</th><th>Date Of Birth</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donorservice/donors/bloodGroup/"+$("#bloodgroup").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					$.each(result, function(key,value) {
						s+="<tr><td>"+value.donorId+"</td><td>"+value.donorMobNo+"</td><td>"+value.donorName+"</td><td>"+value.gender+"</td><td>"+value.location+"</td><td>"+value.bloodGroup+"</td><td>"+value.email+"</td><td>"+value.dateOfBirth+"</td></tr>";
						
					});
					s+="</table><br><br>"
					$('#display2').html(s);
				}
			});
		});
	   $('#byLoc').click(function() {
		   var s="<table id=\"donor\" style=\"width: 900px;font-size: medium; margin-left: 230px;\"><tr><th>Donor Id</th><th>Mobile Number</th><th>Donor Name</th><th>Gender</th><th>Location</th><th>Blood Group</th>"+
		   "<th>Email id</th><th>Date Of Birth</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donorservice/donors/location/"+$("#loc").val();
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					$.each(result, function(key,value) {
						s+="<tr><td>"+value.donorId+"</td><td>"+value.donorMobNo+"</td><td>"+value.donorName+"</td><td>"+value.gender+"</td><td>"+value.location+"</td><td>"+value.bloodGroup+"</td><td>"+value.email+"</td><td>"+value.dateOfBirth+"</td></tr>";
						
					});
					s+="</table><br><br>"
					$('#display3').html(s);
				}
			});
		});
		
	   
   });
   </script>
</head>
<body>
<header>
<jsp:include page="menu.jsp" />
</header>
<br>
<div style="text-align: center;">
<form name="" method="post">
         <b style="font-size:medium;">Find all donors</b>
         <input type="button" value="Find all donors" id="findAll">
</form>
<div id="display0" style="text-align: center;"></div><br><br>
</div>
<div style="text-align: center;">
<form name="" method="post">
         <b style="font-size:medium;">Find by donor id:</b><br>
         <label style="font-size: medium;">Id:</label>
         <input type="text" name="donorid" id="donorid" value="">
         <input type="button" value="click" id="byId">
</form>
<div id="display1" style="text-align: center;"></div><br><br>
</div>
<div style="text-align: center;">
<form name="" method="post">
         <b style="font-size:medium;">Find donors by bloodgroup:</b><br>
         <label style="font-size: medium;">Blood Group:</label>
         <input type="text" name="bloodgroup" id="bloodgroup" value="">
         <input type="button" value="click" id="byGroup">
</form>
<div id="display2" style="text-align: center;"></div>
</div><br><br>

<div  style="text-align: center;">
<form name="" method="post">
         <b style="font-size:medium;">Find donors by location:</b><br>
         <label style="font-size: medium;">Location:</label>
         <input type="text" name="loc" id="loc" value="">
         <input type="button" value="click" id="byLoc">
</form>
<div id="display3" style="text-align: center;"></div>
</div><br><br>

</body>
</html>