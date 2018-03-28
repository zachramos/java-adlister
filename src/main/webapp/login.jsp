<%--
  Created by IntelliJ IDEA.
  User: zacharyramos
  Date: 3/27/18
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("POST")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    } else if (!username.equals("username") || !password.equals("password")){
        response.sendRedirect("/login.jsp");
        }
    }
%>





<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Please Login</h1>
    <div>
        <form method="post" action="login.jsp">
            <input type="text" name="username" placeholder="Enter Username:">
            <input type="password" name="password" placeholder="Enter Password:"><br>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
