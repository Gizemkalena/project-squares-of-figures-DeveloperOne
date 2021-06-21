<%--
  Created by IntelliJ IDEA.
  User: ANTON
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Результат расчета (триугольник)</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>

<div class="w3-container w3-left-align w3-pale-red">
    <h1>Площади геометрических фигур</h1>
</div>

<div class="w3-container w3-center w3-grey w3-padding-24">

    <h2>Площадь триугольника составляет:
        <br>
        <%
            out.println(request.getAttribute("triangleArea") + " м2");
        %>
    </h2>

    <button onclick="location.href='/'" class="w3-btn w3-khaki">В главное меню</button>

</div>

</body>
</html>
