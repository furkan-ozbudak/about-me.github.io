<%--
  Created by IntelliJ IDEA.
  User: kaleb
  Date: 7/12/2019
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome ${name}</h1>
        <p>This is your page......do stuff</p>
        <p><a href="profile.jsp">Profile Info</a></p>
        <form method="post" action="logout">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
