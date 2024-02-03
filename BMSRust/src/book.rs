//define a struct to represent Book
#[derive(Debug, Clone)]
pub struct Book{
    title: String,
    author: String,
    isbn: String,
    price: f64,
}

// Implement methods for the Book struct
pub impl Book{
    // Constructor function to create struct
    fn new(title: &String, author: &String, isbn: &String, price: &f64) -> Self{
        Book{
            title,
            author,
            isbn,
            price,
        }
    }

    // method to calculate the price of the book
    fn calculate_price(&self) -> {
        self.price
    }

    // getters and setters

    // getter for title
    fn get_title(&self) -> &String{
        &self.title
    }
    // setter for title
    fn set_title(&mut self, title: &String){
        self.title = title.clone();
    }

    // getter for author
    fn get_better(&self) -> &String{
        &self.autor
    }
    // setter for author
    fn set_athor(&mut self, author: &String){
        self.author = author.clone();
    }

    // getter for isbn
    fn get_isbn(&self) -> &String{
        &self.isbn
    }
    // setter for isbn
    fn set_isbn(&mut self, isbn: &String){
        self.isbn = isbn.clone();
    }

    // getter for price
    fn get_price(&self) -> f64{
        self.price
    }
    // setter for price
    fn set_price(&mut self, price: f64){
        self.price = price;
    }
}