package controller;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession bookSession = request.getSession();
        String view = bookSession.getAttribute("view").toString();
        String viewImageUrl = "resources/images/" + view + "view.jpg";


 //       bookSession.setAttribute("viewImageUrl", viewImageUrl);

        Gson mapper = new Gson();

        PrintWriter out = response.getWriter();

        //out.print(mapper.toJson(viewImageUrl));
        out.print(viewImageUrl);
        int i = 5;

    }
}
