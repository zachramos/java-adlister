<%--
  Created by IntelliJ IDEA.
  User: zacharyramos
  Date: 3/28/18
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1>All Ads</h1>
    <c:forEach var="Ad" items="${ads}">
        <h1>${Ad.title}</h1>
        <p>${Ad.description}</p>
    </c:forEach>

</div>
</body>
</html>