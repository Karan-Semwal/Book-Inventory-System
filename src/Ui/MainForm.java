package Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.Book;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JPanel titlePanel;
    private JPanel bodyPanel;
    private JPanel buttonsPanel;
    private JButton addButton;
    private JButton detailsButton;
    private JButton removeButton;
    private JButton editButton;
    private JPanel bookviewPanel;
    private JPanel bookviewheaderPanel;
    private JPanel bookviewbodyPanel;

    public MainForm() {
        setTitle("Book Inventory System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 700);
        setMinimumSize(new Dimension(800, 700));

        this.add(mainPanel);

        setVisible(true);

        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                addButton.setBackground(new Color(200, 200, 200));
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                addButton.setBackground(new Color(220, 220, 220));
            }
        });
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                editButton.setBackground(new Color(200, 200, 200));
            }
        });
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                editButton.setBackground(new Color(220, 220, 220));
            }
        });
        removeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                removeButton.setBackground(new Color(200, 200, 200));
            }
        });
        removeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                removeButton.setBackground(new Color(220, 220, 220));
            }
        });
        detailsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                detailsButton.setBackground(new Color(200, 200, 200));
            }
        });
        detailsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                detailsButton.setBackground(new Color(220,220, 220));
            }
        });
    }

    List<Book> book = Database.retrieveBooks();

//    List<Book> people = new ArrayList<>();
//    people.add(new Person("John", 25, "Engineer"));
//    people.add(new Person("Alice", 30, "Doctor"));
//    people.add(new Person("Bob", 35, "Teacher"));
//
//    // Create column names
//    String[] columnNames = {"Name", "Age", "Occupation"};
//
//    // Create table data
//    Object[][] data = new Object[people.size()][columnNames.length];
//    for (int i = 0; i < people.size(); i++) {
//        Book person = people.get(i);
//        data[i][0] = person.getName();
//        data[i][1] = person.getAge();
//        data[i][2] = person.getOccupation();
//    }
//
//    // Create table
//    JTable table = new JTable(data, columnNames);
//    JScrollPane scrollPane = new JScrollPane(table);
//
//    // Add the table to the bookviewbodyPanel
//    bookviewbodyPanel.setLayout(new BorderLayout());
//    bookviewbodyPanel.add(scrollPane, BorderLayout.CENTER);
//}
