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
    <h1>Please edit your profile, ${sessionScope.user.username}!</h1>
    <div class="container">
        <h1>Create a new Ad</h1>
        <form action="/editProfile" method="post">
            <div class="form-group">
                <label for="title">What would you like us to call you?</label>
                <input id="title" name="name" class="form-control" type="text">
<%--                <% request.setAttribute("title",title);%>--%>
            </div>
            <div class="form-group">
                <label for="description">What is your favorite kind of food?</label>
                <textarea id="description" name="typeFood" class="form-control" type="text"></textarea>
            </div>
            <div class="form-group">
                <label for="description">What is your birthday? (mm/dd/year)</label>
                <textarea id="birthday" name="bday" class="form-control" type="text"></textarea>
            </div>
            <div class="form-group">
                <label for="description">Where are you currently living?</label>
                <textarea id="location" name="location" class="form-control" type="text"></textarea>
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</div>


</body>
</html>