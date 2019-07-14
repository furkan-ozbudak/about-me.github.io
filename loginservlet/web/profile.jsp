
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
