<%--
  Created by IntelliJ IDEA.
  User: zacharyramos
  Date: 3/28/18
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Pick a number between 1 and 100!</h2>
<form method="post" action="/guess.jsp">
    <input type="text" name="number" placeholder="Enter number">
    <input type="submit">
</form>

</body>
</html>
