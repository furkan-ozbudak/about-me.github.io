
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome ${name}</h1>
        <p>You logged in successfully. Here is the homepage.</p>
        <p><a href="profile.jsp">Profile Info</a></p>
        <form method="post" action="logout">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
