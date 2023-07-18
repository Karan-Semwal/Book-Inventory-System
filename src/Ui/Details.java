package Ui;

import Main.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Details extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel detailsLabel;

    public Details(Book currentSelectedBook) {

        updateDetailsLabel(currentSelectedBook);

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(320, 300));
        setResizable(false);
        pack();

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

    void updateDetailsLabel(Book book)
    {
        String details = "Book Name - ";
        details += book.get_name() + "\n";

        details += "Book Author - ";
        details += book.get_author() + "\n";

        details += "Book Price - ";
        details += String.valueOf(book.get_price()) + "\n";

        details += "Book Publisher - ";
        details += book.get_publisher() + "\n";

        detailsLabel.setText(details);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
