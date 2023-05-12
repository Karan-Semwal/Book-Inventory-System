public class Book {
    Book() {
        title     = "unknown";
        price     = 0;
        author    = "unknown";
        publisher = "unknown";
    }

    Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // setter functions
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // getter functions
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    // TODO: ADD BOOK INTO DATABASE

    // TODO: DELETE BOOK FROM DATABASE

    // TODO: EDIT BOOK IN INVENTORY

    // TODO: VIEW BOOKS IN INVENTORY

    // TODO: FETCH BOOK DETAILS FROM DATABASE

    private String title;
    private double price;
    private String author;
    private String publisher;
}
