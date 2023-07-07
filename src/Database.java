import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

    public Database()
    {
        connect();
    }

    public static List<Book> retrieveBooks() throws SQLException {

        Connection connection = null;
        List<Book> list1 = new ArrayList<Book>();

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://mysql-thephoenics.alwaysdata.net:3306/thephoenics_bis_project", "319691_1111", "Prime@123");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from BIS");

            while (resultSet.next()) {

                Book book = new Book();
                book.set_author(resultSet.getString("Book_Author"));
                book.set_name(resultSet.getString("Book_Name"));
                book.set_price(resultSet.getFloat("Book_Price"));
                book.set_publisher(resultSet.getString("Book_Publisher"));

                list1.add(book);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        return list1;
    }

    public void connect() {
        String url = "jdbc:mysql://mysql-thephoenics.alwaysdata.net:3306/thephoenics_bis_project"; // replace with your server and database name
        String user = "319691_1111"; // replace with your username
        String password = "Prime@123"; // replace with your password

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully to the database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }

}
