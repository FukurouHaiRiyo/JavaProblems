mod book;
use book::PhysicalBook;

fn main() {
    // Example usage:
    println!("Physical Book Example: ");
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

    // Ebook example
    let ebook = book::Ebook::new(
        "The Rust Programming Language e-book".to_string(),
        "Steve Klabnik and Carol Nichols".to_string(),
        "1234567890".to_string(),
        29.99,
        12.0,
    );

    println!("");
    println!("Ebook Example: ");

    println!("Title: {}", ebook.get_title());
    println!("Author: {}", ebook.get_author());
    println!("Total price: {}", ebook.calculate_price_total());
    println!("Total size in mb: {}", ebook.get_size_in_mb());
}