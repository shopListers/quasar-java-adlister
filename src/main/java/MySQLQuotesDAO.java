import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLQuotesDAO implements Quotes {
    private Connection connection;
    private Config config = new Config();

    public MySQLQuotesDAO() throws SQLException{new Driver();
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Quote> all() {
        String selectQuery = "SELECT * FROM quotes";
        Statement statement = null;
        ResultSet resultSet = null;
        List<Quote> quoteList = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {

                Quote currentQuote = new Quote( resultSet.getLong("id"), resultSet.getString("author_first_name"), resultSet.getString("author_last_name"), resultSet.getString("content"));

                quoteList.add(currentQuote);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return quoteList;
    }

    public static void main(String[] args) throws SQLException {
        MySQLQuotesDAO mySQLQuotesDao = new MySQLQuotesDAO();

      List<Quote> liveCodeQuotes =  mySQLQuotesDao.all();

        for(Quote individualQuote : liveCodeQuotes){
            System.out.println(individualQuote.getAuthorFirstName() + " " + individualQuote.getAuthorLastName() + " said the following: " + individualQuote.getContent()) ;
        }
    }
}
