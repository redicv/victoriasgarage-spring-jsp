
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signin</title>
   <link rel="stylesheet" href="/css/Signin.css"/>
</head>
</head>
<body>

    <!---allows you to include the navbar on this page-->
   <jsp:include page="Navbar.jsp"/>
<div class="signinpage">
   <!--div is a container or a section-->
   <div class="signinbox">
    <h1>Sign-In</h1>
    <form method="post" action="/signin">
      
        <label>Email</label><br>
        <input type="text" class="form-control" name="email"placeholder="email"/><br>
        <label>Password</label><br>
        <input type="password" class="form-control" name="password"placeholder="password"/><br>
        <button type="Submit"class="btn btn-primary">Submit</button>
        
    </form>

</div>
</div>
</body>
</html>