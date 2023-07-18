package Main;

public class Book {

    public Book()
    {
    }

    public Book(String name, String author, float price, String publisher)
    {
        set_name(name);
        set_author(author);
        set_price(price);
        set_publisher(publisher);
    }

    private String m_name;
    private String m_author;
    private float  m_price;
    private String m_publisher;

    public void set_name(String m_name) {
        this.m_name = m_name;
    }

    public void set_author(String m_author) {
        this.m_author = m_author;
    }

    public void set_price(float m_price) {
        this.m_price = m_price;
    }

    public void set_publisher(String m_publisher) {
        this.m_publisher = m_publisher;
    }

    public String get_name() {
        return m_name;
    }

    public String get_author() {
        return m_author;
    }

    public String get_publisher() {
        return m_publisher;
    }

    public float get_price() {
        return m_price;
    }

    public void tostring() {
        System.out.printf("\n name: %s author: %s price: %.2f publisher: %s\n", m_name, m_author, m_price, m_publisher);
    }


}
