//define a struct to represent Book
#[derive(Debug, Clone)]
struct Book{
    title: String,
    author: String,
    isbn: String,
    price: f64,
}

// Implement methods for the Book struct
impl Book{
    // Constructor function to create struct
    fn new(title: &String, author: &String, isbn: &String, price: &f64) -> Book{
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
    
}