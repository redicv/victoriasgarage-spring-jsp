<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script> -->
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-Z0FgO0+2zJVWdB9GVKd2c4l/RrA2E8J/i4WdULg0swR+HEuBgp62oG9mZ+RgfVf9W36p+PnsJBaXLbWB/5vziA==" crossorigin="anonymous" /> -->
    <link rel="stylesheet" href="/css/editprofile.css"/>
    <title>Edit Profile</title>
   
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
    <div class="changepage">
        <div class="changebox">
            <h1>Edit Profile</h1>
       
           <form method="post" action="/editprofile"> 

                    <label>Profile Picture</label><br>
                 <div class="mb-3">
          <input type="text"class="form-control" name="photoUrl" value="${buyerprofile.photoUrl}" /><br>
                 </div>
                    <label>First Name</label><br>
            <input type="text"class="form-control" name="firstname" value="${buyerprofile.firstname}"/><br>
    <label>Last Name</label><br>
    <input type="text" class="form-control"name="lastname"value="${buyerprofile.lastname}"/><br>
    <label>Address</label><br>
    <input type="text" class="form-control"name="address"value="${buyerprofile.address}"/><br>
    <label>Phone Number</label><br>
    <input type="text" class="form-control"name="phonenumber"value="${buyerprofile.phonenumber}"/><br>
    <label>Email</label><br>
    <input type="text" class="form-control"name="email"value="${buyerprofile.email}"/><br>
    <label>Password</label><br>
    <input type="password"class="form-control" name="password"value="${buyerprofile.password}"/><br><br>
    <button type="Submit" class="btn btn-primary">Save</button>
          </form>

        </div> 
    </div>
</body>
</html>


    <!-- placeholder="first name" value="${buyerprofile.firstname}"/> -->
<!-- </div> -->
<!-- <div class="mb-3" style="width: 250px;"> -->
    <!-- <label>Last Name</label>
    <input type="text" class="form-control" name="lastname" placeholder="last name"value="${buyerprofile.lastname}" /> -->
   
<!-- </div> -->
<!-- <div class="mb-3" style="width: 250px;"> -->
    <!-- <label>Address</label>
    <input type="text"class="form-control"  name="address" placeholder="address" value="${buyerprofile.address}"/> -->
<!-- </div> -->
<!-- <div class="mb-3" style="width: 250px;"> -->
    <!-- <label>Phone Number</label><br>
    <input type="text" class="form-control" name="phonenumber" placeholder="phone number" value="${buyerprofile.phonenumber}" /> -->
<!-- </div>
<div class="mb-3" style="width: 250px;"> -->
            <!-- <label>Email Address</label>
            <input type= "text" class="form-control"name="email" placeholder="email" value="${buyerprofile.email}"></label> -->
<!-- </div>
<div class="mb-3" style="width: 250px;"> -->
          <!-- <label>Password</label><br>
          <input type="password" class="form-control" name="password"placeholder="password" value="${buyerprofile.password}"/><br> -->
         