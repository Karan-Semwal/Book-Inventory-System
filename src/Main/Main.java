package Main;

import Ui.MainForm;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws SQLException {

        String[] str = { "Book_Name", "Book_Author", "Book_Price", "Book_Publisher" };

        Database database = new Database();
        MainForm mainform = new MainForm(database);
    }
}