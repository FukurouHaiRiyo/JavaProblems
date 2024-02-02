package BookManagementSystem;

// The PhysicalBook class must inherit the Book class and have the following additional attributes:
    // weight: a double representing the weight of the physical book.
    // shipping: a double representing the shipping price of the physical book.


public class PhysicalBook extends Book{
    private double weight;
    private double shipping;

    // constructor
    public PhysicalBook(String title, String author, String isbn, double price, double weight, double shipping){
        super(title, author, isbn, price);
        this.weight = weight;
        this.shipping = shipping;
    }

    // method to calculate the total price
    @Override
    public double calculatePriceTotal() {
        return price + shipping;
    }

    // getters and setters

    // get and set weight
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    // get and set shipping
    public double getShipping(){
        return shipping;
    }
    public void setShipping(double shipping){
        this.shipping = shipping;
    }

    // method to calculate the total weight
    public double calculateWeightTotal() {
        return weight;
    }

    // method to calculate the total shipping
    public double calculateShippingTotal() {
        return shipping;
    }
}
