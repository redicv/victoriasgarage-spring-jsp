<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
    <link rel="stylesheet" href="/css/Cart.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
    
    <div class="cartpage">
        
        <h1>Your Cart:</h1>
    
      <c:forEach var="item" items="${cartitems}">
        <a href="/${item.id}">
         <div class="cartitems">
            <img src="${item.photoUrl}"/>
             <p style= "color: lightblue;">${item.model} - ${item.year} ${item.manufacturerName}</p>  
             <p style="color: lightblue;">${item.price}</p>
            <a href ="cart/remove/${item.id}"class="btn btn-primary">Remove</a>
       
        </div>
        

          </c:forEach>
          <a href="create-session" style="color: lightblue;">Proceed To Checkout</a>
        </div>
      
        

    <!-- </div> -->
</body>
</html>