package Ui;

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
}
