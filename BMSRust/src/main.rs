mod book;
use book::PhysicalBook;

fn main() {
    // Example usage:
    let physical_book = PhysicalBook::new(
        "The Rust Programming Language".to_string(),
        "Steve Klabnik and Carol Nichols".to_string(),
        "1234567890".to_string(),
        29.99,
        1.2,
        4.99,
    );

    println!("Title: {}", physical_book.get_title());
    println!("Author: {}", physical_book.get_author());

    println!("Total price: {}", physical_book.calculate_price_total());
    println!("Total weight: {}", physical_book.calculate_weight_total());
    println!("Total shipping: {}", physical_book.calculate_shipping_total());
}