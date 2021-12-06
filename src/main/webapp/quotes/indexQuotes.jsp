<%--
  Created by IntelliJ IDEA.
  User: kennethhowell
  Date: 12/6/21
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>CAN WE SEE THIS H1?</h1>

<c:forEach items="${allQuotes}" var="quote">
    <div>${quote.getAuthorFirstName()}  ${quote.getAuthorLastName()}</div>
    <p>${quote.getContent()}</p>
    <br>

</c:forEach>
</body>
</html>
