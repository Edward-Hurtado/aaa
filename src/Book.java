import java.util.ArrayList;

public class Book {
	//instances
	private int isbn;
	private String title;
	private double price;
	private Author author;
	private static String publisher = "Oracle Publications";
//	public static void main(String[] args) {
//		ArrayList<Book> books = new ArrayList<>(3);
//		books.add(new Book(123,"Harry Potter", 54.99));
//		books.add(new Book(123,"eawedaw", 44.6));
//		books.add(new Book(123,"ad2d", 101.4));
//		for(int i =0;i < books.size();i++) {
//			System.out.println(books.get(i));
//		}
//		
//	}
//	public static void main(String[] args) {
//		Book[] bookArray = new Book[3];
//		bookArray[0] = new Book("Harry Potter", 54.99, new Author("Will","Smith"));
//		Author newAuthor = new Author("Tom", "Smith");
//		Author newAuthor2 = new Author(newAuthor);
//		bookArray[1] = new Book("Java Tutorial", 124.99, newAuthor2);
//		bookArray[2] = new Book("Cooking with Masterchef", 75.54, new Author("Chef", "Master"));
//		for(Book bk: bookArray) {
//			System.out.println(bk);
//		}
//		for(Book bk: referenceCopy(bookArray)) {
//			System.out.println(bk);
//		}
//		
//	}
	
	
	//getter methods
	public int getisbn(){
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	//set methods
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void read() {
		System.out.println("Enjoy reading your book!");
	}
	
	public Book() {
		
	}
	public Book(String title) {
		this.title = title;
	}
	public Book(Book other) {
		this.title = other.title;
		this.price = other.price;
	}
	public Book (String title, double price){
		this.title = title;
		this.price = price;
	}
	public Book(int isbn, String title, double price){
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public Book(String title, double price, Author author) {
		this.title = title;
		this.price = price;
//		author = new Author(author);
		this.author= author;
		
	}
	public Author getAuthor() {
		return new Author(author);
	}
	public void setAuth(Author author) {
		this.author = author;
	}
	//equals method
	public boolean equals(Book book) {
		
		if(title == book.getTitle() && price == book.getPrice() && author == book.getAuthor()) {
			return true;
		} else {
			return false;
		}
	}
	
	//to string method
	public String toString() {
		return "title=" + title + ", price= " + price + "and author= " + author.toString();
	}
	
	
}
