
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
    <title>Welcome</title>
    <link href="css/index.css" rel="stylesheet"/>
    <script src="js/index.js"></script>
  </head>
  <body>
    <h1>Login Credentials</h1>
    <form method="post" action='login'>
      <%
        String value = "", checkbox = "";
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
          for(Cookie c : cookies){
            if(c.getName().equals("username")){
              value = c.getValue();
              checkbox = "checked";
              break;
            }
          }
        }
      //  value = request.getCookies()[0].getValue();
      %>
      User Name:
      <input name='username' required value='<%=value%>'/></br></br>
      Password:
      <input name='pw' type='password' required/></br></br>
      <div id="warn">
        <%
          if(request.getAttribute("msg")!= null)
          {
            out.println(request.getAttribute("msg"));
          }
        %>
      </div>
      <input type='submit' value='Login'/>
      <label><input id="cb" type='checkbox' name='remember' value="on" <%=checkbox%>/> Remember Me</label>
    </form>
  </body>
</html>
