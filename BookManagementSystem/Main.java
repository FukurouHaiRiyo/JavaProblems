package BookManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // create a new shopping cart
        ShoppingCart cart = new ShoppingCart();

        // create a new physical book
        PhysicalBook physicalBook = new PhysicalBook("Inferno", "Dan Brown", "978-0307474278", 10.0, 0.5, 5.0);

        // create a new ebook
        EBook ebook = new EBook("Origins", "Dan Brown", "978-0307474278", 10.0, 5.0);

        // switch case to let the user choose between adding a physical book or an ebook to the shopping cart, to calculate the total price and see the list of books in the shopping cart
        
        int choice;
        Scanner scanner = new Scanner(System.in);

        // print all the physical books and ebooks
        System.out.println("Physical book: " + physicalBook.getTitle());
        System.out.println("Ebook: " + ebook.getTitle());


        while (true){
            System.out.println("What do you want to do? (1-Add a physical book, 2-Add an ebook, 3-See the total price, 4-See the list of books in the shopping cart, 5-Exit)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.addBook(physicalBook);
                    break;
                case 2:
                    cart.addBook(ebook);
                    break;
                case 3:
                    System.out.println("The total price is: " + cart.calculateTotalPrice());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("The list of books in the shopping cart is: ");
                    for (Book book : cart.getBooks()) {
                        System.out.println(book.getTitle());
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
