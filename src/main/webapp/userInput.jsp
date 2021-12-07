<%--
  Created by IntelliJ IDEA.
  User: kennethhowell
  Date: 12/7/21
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product Search Results</h1>
<h2>Showing Results for <c:out value="${searchTerm}" /></h2> <%-- <-- note this line --%>
<%--<c:forEach var="product" items="${searchResults}">--%>
<%--    <h3>--%>
<%--            ${product.name}--%>
<%--        <small>${product.price}</small>--%>
<%--    </h3>--%>
<%--</c:forEach>--%>

</body>
</html>
