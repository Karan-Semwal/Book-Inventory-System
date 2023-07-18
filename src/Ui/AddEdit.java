package Ui;

import Main.Book;
import javax.swing.*;
import java.awt.event.*;

public class AddEdit extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nameTextField;
    private JTextField authorTextField;
    private JTextField priceTextField;
    private JTextField publisherTextField;

    // this constructor will be called by Add button
    public AddEdit() {
        //book = new Book();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
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

    // this constructor will be called by Edit button
    public AddEdit(Book currentBook) {
        this();
        book = currentBook;

        nameTextField.setText(currentBook.get_name());
        authorTextField.setText(currentBook.get_author());
        priceTextField.setText(String.valueOf(currentBook.get_price()));
        publisherTextField.setText(currentBook.get_publisher());
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    Book book;
}
