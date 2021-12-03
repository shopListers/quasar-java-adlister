<%--
  Created by IntelliJ IDEA.
  User: douglashirsh
  Date: 12/2/21
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${message}</p>
    <p>Guessed characters - ${guessedLetters.getEnteredCharacters()}</p>
    <p>Correct characters - ${guessedLetters.getCorrectLetters()}</p>
    <p>Max incorrect tries count - ${guessedLetters.getTryCount()}</p>
    <p>Your incorrect tries count - ${guessedLetters.getIncorrectTries()}</p>

    <form action="/hello" method="POST">
        <input type="text" name="playerInput">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
