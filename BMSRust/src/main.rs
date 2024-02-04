mod book;
use book::Book;

fn main() {
    let mut books = Book::new();

    // set title
    books.set_title(String::from("Rust Programming"));
    // set author
    books.set_author(String::from("John Doe"));

    // set isbn
    books.set_isbn(String::from("978-3-16-148410-0"));

    // set price
    books.set_price(49.99);

    // print book title
    println!("Title: {}", books.get_title());

    // print book author
    println!("Author: {}", books.get_author());

    // print book isbn
    println!("ISBN: {}", books.get_isbn());

    // print book price
    println!("Price: {}", books.get_price());
}
