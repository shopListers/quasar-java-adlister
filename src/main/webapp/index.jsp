<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome Shop-Listers" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Welcome to the Shop-lister!</h1>
</div>
<br>
<div class="container">
    <h4>Already a user?</h4>
    <form action="/login">
        <input type="submit" class="btn btn-primary" value="Log In Here">
    </form>

</div>
<br>
<div class="container">
    <h4 >Click here to register a new lister!</h4>
    <form action="/register">
        <input type="submit" class="btn btn-primary" value="Create user">
    </form>
</div>

<%--    <li><a href="/login">Login</a></li>--%>
<%--    <li><a href="/logout">Logout</a></li>--%>
<%--    <li><a href="/register">Register</a> </li>--%>
</body>
</html>



