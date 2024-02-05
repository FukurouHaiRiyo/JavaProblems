mod Book;
use Book::Book;

pub struct EBook{
    book: Book,
    weight: f64,
    shipping: f64
}

pub impl PhysicalBook{
    pub fn new(title: String, author: String, isbn: String, price: f64, weight: f64, shipping: f64) -> PhysicalBook{
        PhysicalBook{
            book: Book{
                title,
                author,
                isbn,
                price,
            },
            weight,
            shipping
        }
    }

    // getters and setters

    pub fn calculate_price_total(&self) -> f64 { // method to calculate the total price of the book
        self.book.price + self.shipping
    }

    // calculate method for weight
    pub fn calculate_weight(&self) -> &f64{
        &self.weight
    }

    // getter for weight
    pub fn get_weight(&self) -> f64 {
        self.weight
    }

    // setter for weight
    pub fn set_weight(&mut self, weight: f64){
        self.weight = weight;
    }

    // getter for shipping
    pub fn get_shipping(&self) -> f64 {
        self.shipping
    }

    // setter for shipping
    pub fn set_shipping(&mut self, shipping: f64){
        self.shipping = shipping;
    }
}