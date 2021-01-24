<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Bank Management System</title>

<script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>

<script type="text/javascript">
   $(document).ready(function(){
	   $('#button').click(function() {
		   var s="<table id=\"donor\" style=\"width: 900px;font-size: medium; margin-left: 230px;\"><tr><th>Donor Id</th><th>Mobile Number</th><th>Donor Name</th><th>Gender</th><th>Location</th><th>Blood Group</th>"+
		   "<th>Email id</th><th>Date Of Birth</th></tr>";
		   var urlval="http://localhost:2020/donor-service/donorservice/donors/eligible";
			$.ajax({
				type : 'GET',
				url :urlval,
				dataType : 'json',
				contentType : 'application/json',
				success : function(result) {
					$.each(result, function(key,value) {
                    s+="<tr><td>"+value.donorId+"</td><td>"+value.mobNo+"</td><td>"+value.donorName+"</td><td>"+value.gender+"</td><td>"+value.location+"</td><td>"+value.bloodGroup+"</td><td>"+value.email+"</td><td>"+value.dateOfBirth+"</td></tr>";
					
					});
					s+="</table>"
					$('#display').html(s);
				}
			});
		});
   });
   </script>

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
  border: 1px solid #ffffb3;
  padding: 8px;
}
#donor tr:nth-child(even){background-color: #FFF8DC;}
#donor tr:hover {background-color: #ffffb3;}
#donor th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #CD5C5C;
  color: white;
}
</style>
</head>
<body>

<header>
<jsp:include page="menu.jsp" />
</header>


<h3 style="text-align: center;size: 22px">Donation history:</h3><br>
<table id="donor" style="width: 900px;font-size: medium; margin-left: 260px;">
<tr>
<th>Registration Id</th>
<th>Donor ID</th>
<th>CampId</th>
<th>Date and time</th>


<c:forEach items="${donReg}" var="donor">
<tr>
<td><c:out value="${donor.registrationId }"/></td>
<td><c:out value="${donor.donorId }"/></td>
<td><c:out value="${donor.campId }"/></td>
<td><c:out value="${donor.currentDate}"/></td>

</tr>
</c:forEach>
</tr>
</table>
<br>
<div style="text-align: center;">
  
     <form name="" method="post">
         <input type="button" value="Eligible Donors " id="button"><br><br>
      </form>
   <div id="display"></div>
</div>
</body>
</html>