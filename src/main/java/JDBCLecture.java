import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCLecture {
    public static void main(String[] args) throws SQLException {


// ...
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );



        Statement statement = connection.createStatement();
//        statement.executeUpdate("INSERT INTO quotes (author_first_name, author_last_name, content) VALUES('Herman', 'Melville', 'Call me Ishmael.')");

        ResultSet resultSet = null;
        resultSet = statement.executeQuery("SELECT * FROM quotes");

        while (resultSet.next()) {
            System.out.println("Here's a quote:");
            System.out.println("  id: " + resultSet.getLong("id"));
            System.out.println("  First name: " + resultSet.getString("author_first_name"));
            System.out.println("  Last name: " + resultSet.getString("author_last_name"));
            System.out.println("  Quote: " + resultSet.getString("content"));

        }

    }


}
