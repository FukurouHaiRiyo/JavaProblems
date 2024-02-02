package BookManagementSystem;

/*
    Class Book must have the following attributes:

    title: a String representing the title of the book.
    author: a String representing the author of the book.
    isbn: a String that represents the book's identification number.
    price: a double representing the price of the book.
*/

public class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected double price;

    // constructor
    public Book(String title, String author, String isbn, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }   

    // method to calculate the total price
    public double calculatePriceTotal() {
        return price;
    }

    // getters and setters

    // get and set title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    // get and set author
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    // get and set isbn
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    // get and set price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
