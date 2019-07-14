<%--
  Created by IntelliJ IDEA.
  User: kaleb
  Date: 7/12/2019
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h1>Profile Information</h1>
    <p>Full Name: ${name}</p>
    <p>Username: ${username}</p>
    <p>Password: ${password}</p>
    <form method="post" action="logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
