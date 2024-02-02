package BookManagementSystem;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ShoppingCart {
    private ArrayList<Book> books;

    public ShoppingCart() {
        books = new ArrayList<Book>();
    }

    // method to add a book to the shopping cart
    public void addBook(Book book) {
        books.add(book);
    }

    // method to remove a book from the shopping cart
    public void removeBook(Book book) {
        books.remove(book);
    }

    // method to get the list of books in the shopping cart
    public List<Book> getBooks() {
        return books;
    }

    // method to see how many books are in the shopping cart
    public int getNumberOfBooks() {
        return books.size();
    }

    // method to calculate the total price of the shopping cart
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.calculatePriceTotal();
        }
        return totalPrice;
    }
}
