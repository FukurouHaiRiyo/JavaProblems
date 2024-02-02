package BookManagementSystem;

public class Main {
    public static void main(String[] args){
        // create a new shopping cart
        ShoppingCart cart = new ShoppingCart();

        // create a new physical book
        PhysicalBook physicalBook = new PhysicalBook("The Da Vinci Code", "Dan Brown", "978-0307474278", 10.0, 2.0, 5.0);

        // create a new ebook
        EBook ebook = new EBook("Origins", "Dan Brown", "978-0307474278", 10.0, 5.0);

        // let the user choose which book to add to the shopping cart
        cart.addBook(physicalBook);
        cart.addBook(ebook);

        // print the number of books in the shopping cart
        System.out.println("Number of books in the shopping cart: " + cart.getNumberOfBooks());

        // print the list of books in the shopping cart
        System.out.println("List of books in the shopping cart: ");
        for (Book book : cart.getBooks()) {
            System.out.println(book.getTitle());
        }

        // print the total price of the shopping cart
        System.out.println("Total price: " + cart.calculateTotalPrice());
    }
}
