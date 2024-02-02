package BookManagementSystem;

public class Main {
    public static void main(String[] args){
        // create a new shopping cart
        ShoppingCart cart = new ShoppingCart();

        // create a new physical book
        PhysicalBook physicalBook = new PhysicalBook("Inferno", "Dan Brown", "978-0307474278", 10.0, 0.5, 5.0);

        // create a new ebook
        EBook ebook = new EBook("Origins", "Dan Brown", "978-0307474278", 10.0, 5.0);

        // list all the available book, their price and type (physical or ebook)
        System.out.println("Available books:");
        System.out.println("Title: " + physicalBook.getTitle() + ", Price: " + physicalBook.calculatePriceTotal() + ", Type: Physical");
        System.out.println("Title: " + ebook.getTitle() + ", Price: " + ebook.calculatePriceTotal() + ", Type: Ebook");

        // let the user choose which books to add the books to the shopping cart
        cart.addBook(physicalBook);
        cart.addBook(ebook);

        // list all the books in the shopping cart
        System.out.println("Books in the shopping cart:");
        for (Book book : cart.getBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Price: " + book.calculatePriceTotal());
        }

        // calculate the total price of the shopping cart
        System.out.println("Total price: " + cart.calculateTotalPrice());
    }
}
