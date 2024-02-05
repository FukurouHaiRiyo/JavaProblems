mod book;
use book::EBook;
use book::PhysicalBook;

fn main() {
    // create an instance of Book
    let book = EBook::new(String::from("The Alchemist"), String::from("Paulo Coelho"), String::from("978-0061122415"), 9.99, 1.2);

    // print the details of the book
    println!("Title: {}", book.book.get_title());
}
