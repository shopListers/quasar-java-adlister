import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HackerServlet", urlPatterns = "/userInput")
public class HackerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("searchTerm", "<script>alert('We are HACKERS :D')</script>");
        request.getRequestDispatcher("/userInput.jsp").forward(request, response);

    }

}
