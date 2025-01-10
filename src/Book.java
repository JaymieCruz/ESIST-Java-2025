public class Book {
    String name;
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String name, String title, String author, int yearPublished, double price) {
        this.name = name;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book" + name + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Price: $" + price;
    }

}
