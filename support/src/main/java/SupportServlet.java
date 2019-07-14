import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SupportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Support Form</title></head><body>");
        out.print("<form method='post' action='support'>");
        out.print("<label>Name: <input type='text' name='name'/></label><br/><br/>");
        out.print("<label>Email: <input type='text' name='email'/></label><br/><br/>");
        out.print("<label>Problem: <input type='text' name='problem'/></label><br/><br/>");
        out.print("<label>Problem description: <textarea name='problemDescription'></textarea></label><br/><br/>");
        int id = (int) (Math.random() * 10000);
        req.getSession().setAttribute("id",id);
        out.print("<input type='submit'/>");
        out.print("</form>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        PrintWriter out = resp.getWriter();

        out.print("<html><head><title>Form Confirmation</title></head><body>");
        out.print("<p>Thank you! " + req.getParameter("name") +
                " for contacting us. You should receive" +
                " reply from us within 24 hrs in your email address: " +
                req.getParameter("email") + ". Let us know in our support email: " +
                sc.getInitParameter("support-email") + " if you don't receive reply within" +
                " 24 hrs. Please be sure to attach your reference: " +
                req.getSession().getAttribute("id") + " in your email.</p>");
        out.print("</body></html>");
    }
}
