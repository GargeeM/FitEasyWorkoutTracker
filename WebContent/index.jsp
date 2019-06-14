
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<link
	href='https://fonts.googleapis.com/css?family=Roboto:500,900,100,300,700,400'
	rel='stylesheet' type='text/css'>
<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="css/LoginH.css">
</head>
<body>

<%
session.invalidate();
%>
	<nav class="shift">
		<ul>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
	</nav>
	<br>
	<br>
	<h3 style="text-align: center; color: #ffffff">Welcome to FitEasy!</h3>
	<h5 style="text-align: center; color: #ffffff">Your one stop
		solution to Ftiness</h5>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card bg-light">
				<button id="btn1">Login</button>

				<div id="id01" class="modal">
					<form class="modal-content animate" action="login" method="post">
						<div class="imgcontainer">
							<span id="sp1" class="close" title="Close Modal">&times;</span>
							<h2>Log In</h2>
						</div>

						<div class="container">
							<label for="uname"><b>Username</b></label> 
							<input type="text" placeholder="Enter Username" name="uname" id="uname" required>
							 
							<label for="psw"><b>Password</b></label> 
							<input type="password" placeholder="Enter Password" name="psw" id="psw" required><br><br>

							<button type="submit" class="cancelbtn">Login</button>
							<label>
							<button id="btn2" type="button" class="cancelbtn">Cancel</button>
							</label> 
							<span class="psw">Forgot <a href="#">password?</a></span>
						</div>
					</form>
				</div>

				<button id="btn3">Sign Up</button>

				<div id="id02" class="modal">
					<form class="modal-content animate" action="signup" method="get">
						<div class="container">
							<span id="sp2" class="close" title="Close Modal">&times;</span>
							<h2>Sign Up</h2>
							<p>Please fill in this form to create an account.</p>
							<hr>
							<label for="uname"><b>Username</b></label>
							 <input type="text" placeholder="Enter Username" name="username" id="uname" required> 
							 
							  <label for="email"><b>Email</b></label>
							  <input type="email" placeholder="Enter Email" name="email" id="email" required> 
							  
							  <label for="mobileno"><b>Mobileno</b></label> 
							  <input type="text" placeholder="Enter Mobileno" name="mobileno" id="mobileno" required>
							   
							  <label for="psw"><b>Password</b></label> 
							  <input type="password" placeholder="Enter Password" name="psw" id="psw1" required> 
							  
							  <label for="psw-repeat"><b>Repeat Password</b></label> 
							  <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw2"  required>

							<!-- <label>
            <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
          </label> -->

							<p>
								By creating an account you agree to our <a href="#"
									style="color: dodgerblue">Terms & Privacy</a>.
							</p>

							<div class="clearfix">
								<button id="btn4" type="button" class="cancelbtn">Cancel</button>
								<button type="submit" class="cancelbtn" onclick="return validate()">submit</button>
							</div>
						</div>
					</form>
				</div>

			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/login1.js"></script> 

</body>

<!--Footer text-->
<div class="copy-right-top border-top">
<p class="copy-right text-center py-4" style="color: white">&copy; 2019 Digital. All Rights Reserved | Design by Prabhat</p>
</div>

</html>