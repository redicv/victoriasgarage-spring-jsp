<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CarDetails</title>
    <link rel="stylesheet" href="/css/CarDetails.css"/>
</head>

<body>
    <jsp:include page="Navbar.jsp"/>
 
    <div class="cardetailspage">
    
    <div class="carimages">
    
    <form method="post" action="/cars">  
    
    <img src="${Cardetails.photoUrl}">
    <p>Year: ${Cardetails.year}</p>
    <p>Manufacturer: ${Cardetails.manufacturerName}</p>
    <p>Model: ${Cardetails.model}</p>
    <p> Description: ${Cardetails.description}</p>
    <p>Mileage ${Cardetails.mileage}</p>
    <P>Date of Purchase ${Cardetails.dateofPurchase}</P>
    <p>Price: ${Cardetails.price}</p>
    <a type="Submit" href="/cart/add/${Cardetails.id}"class="btn btn-primary">Add To Cart</a>

</form>

</div>

</div>
</body>
</html>