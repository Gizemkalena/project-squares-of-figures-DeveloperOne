<%--
  Created by IntelliJ IDEA.
  User: ANTON
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Расчет площади квадрата</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>

<div class="w3-container w3-left-align w3-pale-red">
    <h1>Площади геометрических фигур</h1>
</div>

<div class="w3-container w3-center w3-grey w3-padding-24">
    <h2>Расчет площади квадрата</h2>


<div>
    <img src="img/square2.JPG" class="w3-border w3-margin">
</div>

    <form method="post">
        <label>A (м):<input type="text" name="A" autocomplete="off" required placeholder="введите значение" class="w3-border-black"></label>
        <br> <br>
        <button type="submit" class="w3-btn w3-khaki">Рассчитать площадь</button>
    </form>

    <button onclick="location.href='/'" class="w3-btn w3-khaki">В главное меню</button>

</div>

</body>
</html>
