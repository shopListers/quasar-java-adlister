import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession currentSession = request.getSession();



        if((boolean) currentSession.getAttribute("isAdmin")){
            System.out.println("this conditional is working");
            System.out.println(currentSession.getAttribute("isAdmin"));
            request.setAttribute("adminView",  true);
        } else {
            request.setAttribute("adminView", false);
        }

        System.out.println(currentSession.getAttribute("isAdmin"));


        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }
}
