package mum.edu.cs472.labs.lab12.controller;
import mum.edu.cs472.labs.lab12.model.User;
import mum.edu.cs472.labs.lab12.model.Users;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("pw");
        Users users = new Users();
        List<User> list = users.getUsers();
        User match = null;

        for(User u : list){
            if(userName.equals(u.getUsername())){
                if(password.equals(u.getPassword())){
                    match = u;
                    break;
                }
            }
        }

        if(match == null){
            req.setAttribute("msg","Invalid username and/or password");
            RequestDispatcher d = req.getRequestDispatcher("index.jsp");
            d.forward(req, resp);
        }else{
            HttpSession s = req.getSession();
            s.setAttribute("name", match.getFullName());
            s.setAttribute("username", match.getUsername());
            s.setAttribute("password", match.getPassword());
            s.setAttribute("user",match);
            String r = req.getParameter("remember");
            if(r != null){
                Cookie c = new Cookie("username", match.getUsername());
                c.setMaxAge(2592000);
                resp.addCookie(c);
            } else {
                for(Cookie c : req.getCookies()){
                    if(c.getValue().equals(userName)){
                        Cookie d = new Cookie("username", "");
                        d.setMaxAge(0);
                        resp.addCookie(d);
                        break;
                    }
                }
            }

            String value = "", checkbox = "";
            Cookie[] cookies = req.getCookies();
            if(cookies != null){
                for(Cookie c : cookies){
                    if(c.getName().equals("username")){
                        value = c.getValue();
                        checkbox = "checked";
                        break;
                    }
                }
            }

            RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
            rd.forward(req, resp);
            resp.sendRedirect("welcome.jsp");
        }

    }
}
