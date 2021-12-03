import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("message", "Hello, Welcome to the game." );
        HttpSession session = req.getSession();
        session.setAttribute("guessedLetters", new Hangman());
        req.getRequestDispatcher("/hello.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", "Hello, " + req.getParameter("playerInput"));
        HttpSession session = req.getSession();
        Hangman hangmanGame = (Hangman) session.getAttribute("guessedLetters");
        hangmanGame.addCharacter(req.getParameter("playerInput").charAt(0));
        session.setAttribute("guessedLetters",  hangmanGame);

        req.getRequestDispatcher("/hello.jsp").forward(req, resp);
    }
}
