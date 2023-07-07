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

    static MainForm Application;
    public static void main(String[] args) throws SQLException {
        Application = new MainForm();

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

        onHelloButtonClick();
    }

    public static void onHelloButtonClick() throws SQLException {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://mysql-thephoenics.alwaysdata.net:3306/thephoenics_bis_project", "319691_1111", "Prime@123");

            List<String> list1 = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Book_Name from BIS");

            while (resultSet.next()) {

                list1.add(resultSet.getString("Book_Name"));

                JPanel tmp = new JPanel();
                JLabel name = new JLabel();
                name.setText(list1[0]);


                //informationEquipe infoEquipe = new informationEquipe();
                //list1.add(resultSet.getInt("Book_Price"));
                //list1.add(resultSet.getString("Book_Author"));
                //list1.setBudgetMax(resultSet.getDouble("Budget"));
                //list1.setNbJoueurs(resultSet.getInt("NbJoueur"));

                //infoEquipe.setNbAttaquants(resultSet.getInt("NbAttaquants"));
                //infoEquipe.setNbDefenseurs(resultSet.getInt("NbDefenseurs"));
                //infoEquipe.setNbGardiens(resultSet.getInt("NbGardiens"));
                //infoEquipe.setSalaireTotal(resultSet.getDouble("TotalSalaire"));
                //Ajouter l'objet de modèle de données à la liste
                //equipeData.add(infoEquipe);

            }
            for (String s : list1) {
                System.out.println(s);
            }
            //welcomeText.setText("Youpppppiiii je suis un expert Java / B.D");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}