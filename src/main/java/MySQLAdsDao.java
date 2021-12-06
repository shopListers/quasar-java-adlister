import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;
    private Config config = new Config();

    public MySQLAdsDao() throws SQLException {
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    };

    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM albums";

        ResultSet rs = null;

            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(selectQuery);

        List<Ad> ads = new ArrayList<>();

        while (rs.next()) {
            System.out.println("Here's an album:");
            System.out.println("  id: " + rs.getLong("id"));
            System.out.println("  artist: " + rs.getString("author_first_name"));
            System.out.println("  name: " + rs.getString("author_last_name"));
            System.out.println("  name: " + rs.getString("content"));

        }
        return null;
    }
}
