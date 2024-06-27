
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="/css/Home.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
<div class="Homepage">
    <div class="title">
    <h1>Victoria's Garage</h1><br>
    <h2> Greetings, ${user.firstname}!</h2>
</div>
</div>
</body>
</html>