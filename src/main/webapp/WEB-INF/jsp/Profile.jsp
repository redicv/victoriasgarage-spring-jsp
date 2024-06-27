<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" href="/css/Profile.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

<div class="profilepage">
<div class="profileinfo">

    <div class="m-b-25">
      
        <img src="${buyer.photoUrl}" style="height: 90px;"/>
    </div>
<h1>${buyer.firstname} ${buyer.lastname}</h1>
<label>Address</label>
<p>${buyer.address}</p>
<label>Email</label>
<p>${buyer.email}</p>
<label>Phone Number</label>
<p>${buyer.phonenumber}</p>

<a type="Submit" style="height: 40px; width: 80px;" href ="/editprofile/${buyer.id}"class="btn btn-primary">Edit</a>

</div>
</div>


</body>
</html> 