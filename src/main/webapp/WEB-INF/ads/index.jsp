<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Listings" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/newNavbar2.jsp" />

<div class="container">
    <div>
    <form method="POST" action="/ads/search">
        <label name="searchTerm" for="myInput"></label>
        <input name="searchTerm" type="text" id="myInput" placeholder="Search for an Ad">
        <button>Search</button>
    </form>
    </div>

    <h1>Here Are all the Listings</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>

</div>

</body>
</html>