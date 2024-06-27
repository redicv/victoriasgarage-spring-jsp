<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <title>Navbar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-Z0FgO0+2zJVWdB9GVKd2c4l/RrA2E8J/i4WdULg0swR+HEuBgp62oG9mZ+RgfVf9W36p+PnsJBaXLbWB/5vziA==" crossorigin="anonymous" />
    <link rel="stylesheet" href="/css/Navbar.css"/>
</head>
<body>

       <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="/">
            <img src="https://i.pinimg.com/736x/20/40/c2/2040c270a4c15fd87e0edc5018232c7c.jpg" height="25px" width="35px">
          </a>
        
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <!-- <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/">Home</a>
              </li> -->
              <li class="nav-item">
                <a class="nav-link" href="/cars">Cars</a>
              </li>
              
         <c:if test="${empty sessionScope.user}">

              <li class="nav-item">
                <a class="nav-link" href="/signup">Sign-up</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/signin">Sign-In</a>
              </li>
              
            </c:if>
  <!-- sessionScope is a way to access attributes that are stored in the 'httpsession' object  -->
             
            <c:choose>

              <c:when test="${sessionScope.userType=='Buyer'}">
             <li class="nav-item">
                <a class="nav-link" href="/profile">Profile</a>
              </li>
              
     
             <!-- form action="/searchcar" method="get" -->
           
                <form class="d-flex" action="/searchcar"role="search" method="get" >
                    <input class="form-control me-2" name="model"type="search" placeholder="Search" aria-label="Search">
                  </form>
                    <!-- <button class="btn btn-outline-success" type="submit">Search</button> -->
                
                
              <a class="shopping-cart"><li class="nav-img"></a>
               
               
                <a class="navbar-brand" href="/cart">
                    <img src="https://qph.cf2.quoracdn.net/main-qimg-55dac8d2263be6b070a707ac125f1377-lq"  height="25px" width="35px">
                </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/logout">Logout</a>
                </li>
              </c:when>
              <c:when test="${sessionScope.userType=='Seller'}">
               
                <li class="nav-item">
                  <a class="nav-link" href="/addcar">Add Car</a>
                </li>

                <li class="nav-item">
                  <a class="nav-link" href="/logout">Logout</a>
                </li>
          </c:when>
          </c:choose>
            </div>
                
              
            </ul>

          </div>
          </div>
       
      </nav>
    
    

</body>
</html>