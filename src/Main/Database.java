package Main;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private Connection connection;

    public Database() {
        //connect();
        connection = null;
    }

    public void executeQuery(String query) throws SQLException {
        connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        closeConnection();
    }

    public void insert(Book book) throws SQLException {
        connect();
        String query = "INSERT INTO BIS(Book_Author, Book_Name, Book_Price, Book_Publisher) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, book.get_author());
            preparedStatement.setString(2, book.get_name());
            preparedStatement.setFloat(3, book.get_price());
            preparedStatement.setString(4, book.get_publisher());

            preparedStatement.executeUpdate();
        }
        closeConnection();
    }

    public List<Book> retrieveBooks() throws SQLException {
        List<Book> booksList = new ArrayList<Book>();
        try {
            connect();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from BIS");

            while (resultSet.next()) {
                Book book = new Book();
                book.set_author(resultSet.getString   ("Book_Author"));
                book.set_name(resultSet.getString     ("Book_Name"));
                book.set_price(resultSet.getFloat     ("Book_Price"));
                book.set_publisher(resultSet.getString("Book_Publisher"));
                booksList.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return booksList;
    }

    public void connect() {
        String url = "jdbc:mysql://mysql-thephoenics.alwaysdata.net:3306/thephoenics_bis_project"; // replace with your server and database name
        String user = "319691_1111"; // replace with your username
        String password = "Prime@123"; // replace with your password

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully to the database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection closed successfully!");
    }
}
