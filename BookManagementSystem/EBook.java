package BookManagementSystem;

// The Ebook class must also inherit the class book and have an additional attribute:
//      sizeInMb: a double representing the size of the ebook file in megabytes.

public class EBook extends Book {
    private double sizeInMb;

    // constructor 
    public EBook(String title, String author, String isbn, double price, double sizeInMb) {
        super(title, author, isbn, price);
        this.sizeInMb = sizeInMb;
    }

    // getters and setters
    public double getSizeInMb() {
        return sizeInMb;
    }
    public void setSizeInMb(double sizeInMb) {
        this.sizeInMb = sizeInMb;
    }
}
