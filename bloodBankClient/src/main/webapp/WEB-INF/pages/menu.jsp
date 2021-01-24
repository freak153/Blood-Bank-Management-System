<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Blood Bank Management System</title>
<style>
body {
  margin: 0;
  font-size: 27px;
  font-family:  Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
}
.header {
  background-color: #f1f1f1;
}
#navbar {
  overflow: hidden;
  background-color:  #800000;
}
#navbar a {
 float:left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 15px 50px;
  font-size: 18px;
}
#navbar a:hover {
  background-color: rgb(153, 53, 53);
  color: rgb(255, 255, 255);
}

.content {
  padding: 50px;
}
.sticky {
  position: fixed;
  top: 0;
  width: 100%;
}
.sticky + .content {
  padding-top: 70px;
}
</style>
</head>
<body>

<div class="header">
    <div style="width:1360px;height:170px;background-color:	 #b30000;);"></div>
    <h1 style="position: absolute;left: 18%;top: 7%;color: #f1f1f1;text-shadow:4px 4px 4px #000000;font-family:  Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"> Blood Bank Management System</h1>
</div>

<div id="navbar">
  
  <a href="/">Home</a>
  <a href="/registerDonor/">Donor Registration</a>
  <a href="/donationcamp/">Donation Camps</a>
  <a href="/donor/">Donors</a>
  
</div>

<script>
window.onscroll = function() {myFunction()};
var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;
function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}
</script>

</body>
</html>