<%--
  Created by IntelliJ IDEA.
  User: zacharyramos
  Date: 3/28/18
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a number</title>
</head>
<body>
<h1 style="text-align: center">Guess a Random Number</h1>
<h1 style="text-align: center">${message}</h1>
<form action="/guess" style="text-align: center">
    <input type="submit" value="Guess Again?">
    <input type="submit" value="Reset Random Number?" name="reset">
</form>

</body>
</html>
