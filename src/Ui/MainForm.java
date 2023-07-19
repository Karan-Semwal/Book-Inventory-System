package Ui;

import Main.Book;
import Main.Database;
import com.mysql.cj.xdevapi.Column;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainForm extends JFrame {

    private Database database;
    List<Book> books;
    DefaultTableModel booksTableModel;
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
    private JTable dataTable;

    public MainForm(Database db)
    {
        init();
        database = db;

        // fill the bookData table
        updateBookTable();

        // display
        setVisible(true);

        // events
        ButtonClickEvents();
        ButtonHoverEffects();
    }

    void init() {
        this.setTitle("Book Inventory System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(800, 700));
        this.add(mainPanel);

        // initialize bookTableModel with 0 rows
        booksTableModel = new DefaultTableModel(
                new Object[]{ "Book_Name", "Book_Author", "Book_Price", "Book_Publisher" },
                0
        );
    }

    void updateBookTable() {
        // retrieve books data from database
        try {
            books = database.retrieveBooks();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Book book : books) {
            booksTableModel.addRow(new Object[]{
                    book.get_name(),
                    book.get_author(),
                    book.get_price(),
                    book.get_publisher()
            });
        }
        dataTable.setModel(booksTableModel);
    }

    public void ButtonClickEvents() {
        // Add Button listeners
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseExited(e);
                AddEdit addForm = new AddEdit();
                addForm.pack();
                addForm.setVisible(true);
            }
        });

        // Edit Button listeners
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Book tmp = new Book("testname", "testauthor", 500f, "testpub"); // TMP
                AddEdit editForm = new AddEdit(tmp);
                editForm.setVisible(true);
            }
        });

        // Remove Button listeners
        removeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseExited(e);
                Remove removeForm = new Remove();
                removeForm.setVisible(true);
            }
        });

        // Details Button listeners
        detailsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseExited(e);
                Book tmp = new Book("testname", "testauthor", 500f, "testpub"); // TMP
                Details detailsForm = new Details(tmp);
                detailsForm.setVisible(true);
            }
        });
    }

    private void ButtonHoverEffects() {
        // mouse-hover effects
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
                detailsButton.setBackground(new Color(220, 220, 220));
            }
        });
    }
}
