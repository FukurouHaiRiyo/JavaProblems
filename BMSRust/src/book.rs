#[warn(non_snake_case)]

// Define a Book struct
pub struct Book {
    title: String,
    author: String,
    isbn: String,
    price: f64,
}

// Implement methods for Book
impl Book {
    pub fn new(title: String, author: String, isbn: String, price: f64) -> Book {
        Book {
            title,
            author,
            isbn,
            price,
        }
    }

    pub fn calculate_price_total(&self) -> f64 {
        self.price
    }

    // Getters and setters for title, author, isbn, and price
    pub fn get_title(&self) -> String {
        self.title.clone()
    }

    pub fn set_title(&mut self, title: String) {
        self.title = title;
    }

    pub fn get_author(&self) -> String {
        self.author.clone()
    }

    pub fn set_author(&mut self, author: String) {
        self.author = author;
    }

    pub fn get_isbn(&self) -> String {
        self.isbn.clone()
    }

    pub fn set_isbn(&mut self, isbn: String) {
        self.isbn = isbn;
    }

    pub fn get_price(&self) -> f64 {
        self.price
    }

    pub fn set_price(&mut self, price: f64) {
        self.price = price;
    }
}

// Define a PhysicalBook struct
pub struct PhysicalBook {
    book: Book,
    weight: f64,
    shipping: f64,
}

// Implement methods for PhysicalBook
impl PhysicalBook {
    pub fn new(title: String, author: String, isbn: String, price: f64, weight: f64, shipping: f64) -> PhysicalBook {
        PhysicalBook {
            book: Book::new(title, author, isbn, price),
            weight,
            shipping,
        }
    }

    pub fn calculate_price_total(&self) -> f64 {
        self.book.price + self.shipping
    }

    pub fn calculate_weight_total(&self) -> f64 {
        self.weight
    }

    pub fn calculate_shipping_total(&self) -> f64 {
        self.shipping
    }

    // Getters and setters for weight and shipping
    pub fn get_weight(&self) -> f64 {
        self.weight
    }

    pub fn set_weight(&mut self, weight: f64) {
        self.weight = weight;
    }

    pub fn get_shipping(&self) -> f64 {
        self.shipping
    }

    pub fn set_shipping(&mut self, shipping: f64) {
        self.shipping = shipping;
    }

    // Getters and setters for book
    pub fn get_title(&self) -> String {
        self.book.get_title()
    }

    pub fn get_author(&self) -> String {
        self.book.get_author()
    }
}

// Implement methods for Ebook
pub struct Ebook{
    book: Book,
    size_in_mb: f64,
}

// Implement methods for Ebook
impl Ebook {
    pub fn new(title: String, author: String, isbn: String, price: f64, size_in_mb: f64) -> Ebook {
        Ebook {
            book: Book::new(title, author, isbn, price),
            size_in_mb,
        }
    }

    pub fn calculate_price_total(&self) -> f64 {
        self.book.price
    }

    pub fn calculate_size_in_mb(&self) -> f64 {
        self.size_in_mb
    }

    // Getters and setters for size_in_mb
    pub fn get_size_in_mb(&self) -> f64 {
        self.size_in_mb
    }

    pub fn set_size_in_mb(&mut self, size_in_mb: f64) {
        self.size_in_mb = size_in_mb;
    }

    // Getters and setters for book
    pub fn get_title(&self) -> String {
        self.book.get_title()
    }

    pub fn get_author(&self) -> String {
        self.book.get_author()
    }
}
