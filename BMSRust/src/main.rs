mod book;
use book::Book;

fn main() {
    let mut books = Book::new();
    books.set_title(String::from("Rust Programming"));
    println!("Title: {}", books.get_title());
}
