import javax.swing.*;
import java.awt.*;

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

    public static void main(String[] args) {
        MainForm mainframe = new MainForm();

    }

    public MainForm() {
        setTitle("Book Inventory System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 700);
        setMinimumSize(new Dimension(800, 700));

        setup();

        this.add(mainPanel);

        setVisible(true);
    }

    void setup() {
        Font font = new Font("arial", Font.BOLD, 20);
        titleLabel.setFont(font);

        titleLabel.setSize(titlePanel.getSize());
    }

}
