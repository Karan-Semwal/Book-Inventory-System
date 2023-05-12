import javax.swing.JFrame;

public class UI {
    UI() {
        m_mainFrame = new JFrame();
        setupFrame();
    }

    private void setupFrame() {
        m_mainFrame.setTitle("Book Inventory System");
        m_mainFrame.setSize(750, 700);
        m_mainFrame.setLocationRelativeTo(null);
        m_mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initUI() {
        m_mainFrame.setVisible(true);
    }

    private JFrame m_mainFrame;
}
