<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />


<div class="container">
    <h1>Welcome, ${sessionScope.user.username}!</h1>
</div>

<<<<<<< HEAD:src/main/webapp/WEB-INF/partials/profile.jsp
=======
<a href="/editProfile">
    <input type="button" value="Edit profile" />
</a>

>>>>>>> e1fbdfc1549a9e3de7861173a5458fb05edd82ee:src/main/webapp/WEB-INF/profile.jsp


</body>
</html>