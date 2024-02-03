//define a struct to represent Book
#[derive(Debug, Clone)]
pub struct Book{
    title: String,
    author: String,
    isbn: String,
    price: f64,
}

// Implement methods for the Book struct
impl Book{
    // Constructor function to create struct
    pub fn new() -> Book{
        Book{
            title: String::from(""),
            author: String::from(""),
            isbn: String::from(""),
            price: 0.0,
        }
    }

    // method to calculate the price of the book
    pub fn calculate_price(&self) -> f64 {
        self.price
    }

    // getters and setters

    // getter for title
    pub fn get_title(&self) -> &String{
        &self.title
    }
    // setter for title
    pub fn set_title(&mut self, title: String){
        self.title = title; 
    }

    // getter for author
    pub fn get_better(&self) -> &String{
        &self.author
    }
    // setter for author
    pub fn set_athor(&mut self, author: String){
        self.author = author;
    }

    // getter for isbn
    pub fn get_isbn(&self) -> &String{
        &self.isbn
    }
    // setter for isbn
    pub fn set_isbn(&mut self, isbn: String){
        self.isbn = isbn;
    }

    // getter for price
    pub fn get_price(&self) -> &f64{
        &self.price
    }
    // setter for price
    pub fn set_price(&mut self, price: f64){
        self.price = price;
    }
}