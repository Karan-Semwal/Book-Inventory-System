import Ui.MainForm;

import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Main {

    static MainForm gui;
    static Database database;

    public static void main(String[] args) throws SQLException {

        String[] str = { "Book_Name", "Book_Author", "Book_Price", "Book_Publisher" };

        List<Book> l = Database.retrieveBooks();

        gui = new MainForm();
        database = new Database();

    }
}