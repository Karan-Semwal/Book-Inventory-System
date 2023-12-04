package Ui;

import Main.Book;
import Main.Database;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class AddEdit extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nameTextField;
    private JTextField authorTextField;
    private JTextField priceTextField;
    private JTextField publisherTextField;
    private Database database;
    private MainForm mainForm;

    // this constructor will be called by Add button
    public AddEdit(Database db, MainForm mainForm) {
        this.database = db;
        this.mainForm = mainForm;

        //book = new Book();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOK();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() throws SQLException {
        Book newBook = new Book();
        newBook.set_author(authorTextField.getText());
        newBook.set_name(nameTextField.getText());
        newBook.set_price(Integer.parseInt(priceTextField.getText()));
        newBook.set_publisher(publisherTextField.getText());

        // add book to the ui
        this.mainForm.addRow(newBook);
        dispose();

        // insert new book into database
        database.insert(newBook);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
