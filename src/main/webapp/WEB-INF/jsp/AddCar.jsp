<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Car</title>
    <link rel="stylesheet" href="/css/AddCar.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
<div class="addcarpage">
    <div class="addcar">
        <h1>Add Car</h1>
<form method="post" action="/addcar">

    <label>Manufacturer Name</label><br>
    <input type="text"class="form-control" name="manufacturerName"/><br>
    <label>Model</label><br>
    <input type="text" class="form-control"name="model"/><br>
    <label>Year</label><br>
    <input type="number" class="form-control"name="year"/><br>
    <label>Date of Purchase</label> <br>
    <input type="date" class="form-control"name="dateofPurchase"/><br>
    <label>VIN</label><br>
    <input type="number"class="form-control" name="vin"/><br>
    <label>Price</label><br>
    <input type="number"class="form-control" name="price"/><br>
    <label>Mileage</label><br>
    <input type="number" class="form-control"name="mileage"/><br>
    <label>Description</label><br>
    <input type="text" class="form-control"name="description"/><br>
    <label>Photo</label><br>
    <input type="text"class="form-control" name="photoUrl"/><br><br>
    <button type="Submit"class="btn btn-primary">Submit</button>

</form>

</div>
</div>



</body>
</html>