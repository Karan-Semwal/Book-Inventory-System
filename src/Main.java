import javax.swing.JFrame;

//public class Main {
//    public static void main(String[] args) {
//        UI ui = new UI();
//        ui.initUI();
//    }
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    private JFrame frame;
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTextField titleTextField;
    private JLabel authorLabel;
    private JTextField authorTextField;
    private JLabel publisherLabel;
    private JTextField publisherTextField;
    private JLabel isbnLabel;
    private JTextField isbnTextField;
    private JLabel quantityLabel;
    private JTextField quantityTextField;
    private JLabel priceLabel;
    private JTextField priceTextField;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton viewButton;
    private JButton generateReportButton;

    public Main() {
        frame = new JFrame("Book Inventory System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setSize(700, 750);
        mainPanel.setLayout(new GridLayout(0, 2));

        titleLabel = new JLabel("Title");
        titleTextField = new JTextField();
        mainPanel.add(titleLabel);
        mainPanel.add(titleTextField);

        authorLabel = new JLabel("Author");
        authorTextField = new JTextField();
        mainPanel.add(authorLabel);
        mainPanel.add(authorTextField);

        publisherLabel = new JLabel("Publisher");
        publisherTextField = new JTextField();
        mainPanel.add(publisherLabel);
        mainPanel.add(publisherTextField);

        isbnLabel = new JLabel("ISBN");
        isbnTextField = new JTextField();
        mainPanel.add(isbnLabel);
        mainPanel.add(isbnTextField);

        quantityLabel = new JLabel("Quantity");
        quantityTextField = new JTextField();
        mainPanel.add(quantityLabel);
        mainPanel.add(quantityTextField);

        priceLabel = new JLabel("Price");
        priceTextField = new JTextField();
        mainPanel.add(priceLabel);
        mainPanel.add(priceTextField);

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Add book to inventory
            }
        });
        mainPanel.add(addButton);

        editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Edit book in inventory
            }
        });
        mainPanel.add(editButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Delete book from inventory
            }
        });
        mainPanel.add(deleteButton);

        viewButton = new JButton("View");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: View book inventory
            }
        });
        mainPanel.add(viewButton);

        generateReportButton = new JButton("Generate Report");
        generateReportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Generate report of book inventory
            }
        });
        mainPanel.add(generateReportButton);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
