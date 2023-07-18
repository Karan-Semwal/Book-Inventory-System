package Ui;

import Main.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        setTitle("Main.Book Inventory System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 700);
        setMinimumSize(new Dimension(800, 700));

        this.add(mainPanel);

        setVisible(true);

        // Add Button listeners
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
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                editButton.setBackground(new Color(200, 200, 200));
            }
        });
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Book tmp = new Book("testname", "testauthor", 500f, "testpub"); // TMP
                AddEdit editForm = new AddEdit(tmp);
                editForm.setVisible(true);
            }
        });
        editButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                editButton.setBackground(new Color(220, 220, 220));
            }
        });

        // Remove Button listeners
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
}
