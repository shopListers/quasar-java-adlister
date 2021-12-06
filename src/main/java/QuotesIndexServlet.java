import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "QuotesIndexServlet", urlPatterns = "/quotes")
public class QuotesIndexServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Quotes quotesDao = DaoFactory.getQuotesDao();

           List<Quote> currentQuotes = new ArrayList<>();

            currentQuotes = quotesDao.all();
            System.out.println(currentQuotes);
            request.setAttribute("allQuotes", currentQuotes);
            request.getRequestDispatcher("/quotes/indexQuotes.jsp").forward(request, response);



        request.getRequestDispatcher("/quotes/indexQuotes.jsp").forward(request, response);

    }


}
