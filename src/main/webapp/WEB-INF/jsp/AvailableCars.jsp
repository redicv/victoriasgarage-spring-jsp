<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AvailableCars</title>
    <link rel="stylesheet" href="/css/AvailableCars.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

    <div class="carlist">
        <div class="image-row">
          
<c:forEach var="car" items="${cars}">
   
    <a href="/${car.id}">
    <div class="caritems">
    <img src="${car.photoUrl}"/>

<p>${car.year} - ${car.manufacturerName} - ${car.model}</p>
</a>
</div>

</c:forEach>

</div>

</div>
</div>
</body>
</html>