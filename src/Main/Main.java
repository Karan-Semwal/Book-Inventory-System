package Main;

import Ui.MainForm;
import java.sql.SQLException;

class Main {

    static MainForm gui;
    static Database database;

    public static void main(String[] args) throws SQLException {

        String[] str = { "Book_Name", "Book_Author", "Book_Price", "Book_Publisher" };

        gui = new MainForm();
        database = new Database();

    }
}