<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div id="signup">
	<form action="signup" method="POST">
	  <div>
	    <h1>Sign Up</h1>
	    <p>Please fill in this form to create an account.</p>
	    <hr>
	
	    <label for="email"><b>Email</b></label>
	    <input type="text" placeholder="Enter Email" name="email" required>
	
	    <label for="psw"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="psw" required>
	
	    <label for="psw-repeat"><b>Repeat Password</b></label>
	    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
	
	    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms and Privacy</a>.</p>
	
	    <div class="clearfix">
	      <button type="button" class="cancelbtn">Cancel</button>
	      <button type="submit" class="signupbtn">Sign Up</button>
	    </div>
	  </div>
	</form>
</div>