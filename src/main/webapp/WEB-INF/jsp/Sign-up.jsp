<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/Signup.css"/>
    <title>Sign-Up</title>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
    
    <div class="signuppage">
  
        <div class="signupbox">
            <h1>Sign-Up</h1>
    <form method="post" action="/signup">
        <div class="mb-3">
        <label>First Name</label>
        <input type="text" class="form-control" name="firstname" placeholder="first name"></i>
        </div>
        <div class="mb-3">
        <label>Last Name</label>
        <input type="text" class="form-control" name="lastname" placeholder="last name"/>
       
    </div>
        <div class="mb-3">
        <label>Address</label>
        <input type="address"class="form-control"  name="address" placeholder="address"/>
        </div>
        <div class="mb-3">
        <label>Phone Number</label><br>
        <input type="phone number" class="form-control" name="phone number" placeholder="phone number"/>
        </div>
            <div class="mb-3">
                <label>Email Address</label>
                <input type= "exampleInputEmail1" class="form-control"name="email" placeholder="email"></label>
        
              <div id="emailHelp">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
              <label>Password</label><br>
              <input type="password" class="form-control" name="password"placeholder="password"/><br>
              <button type="Submit"class="btn btn-primary">Submit</button>
      
            </div>
        </div>
    </div>

</form>

</body>
</html>