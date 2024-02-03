package BookManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // create a new shopping cart
        ShoppingCart cart = new ShoppingCart();

        // create a new physical book
        PhysicalBook physicalBook = new PhysicalBook("", "", "", 0.0, 0.0, 0.0);

        int n;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the number of physical books you want to add to the library: ");
        n = scanner1.nextInt();

        ArrayList<String> totalPhysical = new ArrayList<String>();

        for (int i = 0; i < n; i++){
            String title;
            // read the title of the book
            System.out.println("Enter the title of the book: ");
            title = scanner1.next();
            physicalBook.setTitle(title);

            // set the author of the book
            String author;
            System.out.println("Enter the author of the book: ");
            author = scanner1.next();
            physicalBook.setAuthor(author);

            // set the isbn of the book
            String isbn;
            System.out.println("Enter the isbn of the book: ");
            isbn = scanner1.next();
            physicalBook.setIsbn(isbn);

            // set the price of the book
            double price;
            System.out.println("Enter the price of the book: ");
            price = scanner1.nextDouble();
            physicalBook.setPrice(price);

            // set the weight of the book
            double weight;
            System.out.println("Enter the weight of the book: ");
            weight = scanner1.nextDouble();
            physicalBook.setWeight(weight);

            // set the shipping of the book
            double shipping;
            System.out.println("Enter the shipping of the book: ");
            shipping = scanner1.nextDouble();
            physicalBook.setShipping(shipping);

            totalPhysical.add(physicalBook.getTitle());
        }


        // print the title of the physical book
        System.out.println("Physical book: " + physicalBook.getTitle());
 
        // create a new ebook, in a similar way as the physical book
        EBook ebook = new EBook("", "", "", 0.0, 0.0);

        int m;

        System.out.println("Enter the number of ebooks you want to add to the library:");
        m = scanner1.nextInt();

        for (int i = 0; i < m; i++){
            String title;
            // read the title of the book
            System.out.println("Enter the title of the book: ");
            title = scanner1.next();
            ebook.setTitle(title);

            // set the author of the book
            String author;
            System.out.println("Enter the author of the book: ");
            author = scanner1.next();
            ebook.setAuthor(author);

            // set the isbn of the book
            String isbn;
            System.out.println("Enter the isbn of the book: ");
            isbn = scanner1.next();
            ebook.setIsbn(isbn);

            // set the price of the book
            double price;
            System.out.println("Enter the price of the book: ");
            price = scanner1.nextDouble();
            ebook.setPrice(price);

            // set the size of the book
            double sizeInMb;
            System.out.println("Enter the size of the book: ");
            sizeInMb = scanner1.nextDouble();
            ebook.setSizeInMb(sizeInMb);
        }         

        // switch case to let the user choose between adding a physical book or an ebook to the shopping cart, to calculate the total price and see the list of books in the shopping cart
        
        int choice;

        // print all the physical books and ebooks
        System.out.println("Physical book: " + physicalBook.getTitle());
        System.out.println("Ebook: " + ebook.getTitle());


        while (true){
            System.out.println("What do you want to do? (1 - View physical book, 2 - View ebook 3 - Add a physical book to the shopping cart, 4 - Add an ebook to the shopping cart, 5 - See the list of books in the shopping cart, 6 - Exit the program)");
            choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    // view the physical book
                    for (int i = 0; i < totalPhysical.size(); i++){
                        System.out.println("Physical book: " + totalPhysical.get(i));
                    }
                    break;
                case 2:
                    // view the ebook
                    System.out.println("Ebook: " + ebook.getTitle() + " " + ebook.getAuthor() + " " + ebook.getIsbn() + " " + ebook.getPrice() + " " + ebook.getSizeInMb());

                case 3: // add a physical book to the shopping cart
                    cart.addBook(physicalBook);

                    // print the books in the shopping cart 
                    for (Book book : cart.getBooks()) {
                        System.out.println(book.getTitle());
                        // price
                        System.out.println(book.getPrice());
                    }

                    // calculate the total price of the shopping cart
                    double totalPrice = 0.0;
                    for (Book book : cart.getBooks()) {
                        totalPrice += book.getPrice() + physicalBook.getShipping();
                    }
                    System.out.println("Total price: " + totalPrice + " " + " number of books: " + cart.getNumberOfBooks());
                    break;

                case 4: // add an ebook to the shopping cart
                    cart.addBook(ebook);

                    // print the books in the shopping cart 
                    for (Book book : cart.getBooks()) {
                        System.out.println(book.getTitle());
                    }

                    // calculate the total price of the shopping cart
                    System.out.println("Total price: " + cart.calculateTotalPrice() + " " + " number of books: " + cart.getNumberOfBooks());

                case 5: // see the list of books in the shopping cart
                    for (Book book : cart.getBooks()) {
                        System.out.println(book.getTitle());
                    }
                    break;

                case 6: // exit the program
                    scanner1.close();
                    System.exit(0);
                    break;

                default:
                    scanner1.close();
            }
        }
    }
}
