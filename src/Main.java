
public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("1:", "Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("2:", "Python Physics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("3:", "C++ Essential", "Michael Johnson", 2019, 49.99);

        System.out.println(book1.toString());
        System.out.println("\n" + book2.toString());
        System.out.println("\n" + book3.toString());
    }
}