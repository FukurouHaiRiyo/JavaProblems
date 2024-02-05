mod Book;
use Book::Book;

pub struct EBook{
    book: Book,
    size_in_mb: f64,
}

pub impl EBook{
    pub fn new(title: String, author: String, isbn: String, price: f64, size_in_mb: f64) -> Self{
        EBook{
            book: Book{
                title,
                author,
                isbn,
                price,
            }, 
            size_in_mb
        }
    }

    // getters and setters

    // getter for size_in_mb
    pub fn get_size_in_mb(&self) -> &f64{
        &self.size_in_mb
    }
    // setter for size_in_mb
    pub fn set_size_in_mb(&mut self, size_in_mb: f64){
        self.size_in_mb = size_in_mb;
    }
}