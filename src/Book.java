public class Book {
    Book(String title) {
        this.title  = title;
        this.price  = 0;
        this.author = "unknown";
        this.publisher = "unknown";
    }

    Book(String title, double price, String author, String publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
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


    private String title;
    private double price;
    private String author;
    private String publisher;
}
