import java.util.ArrayList;
public class BookDriver {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Harry Potter", 54.99));
		books.add(new Book("Java Tutorial", 124.99));
		books.add(new Book("Cooking with Masterchef", 75.94));
		
		for(Book bk: books) {
			displayBook(bk);
		}
		Book newBook = createBookWithGivenEuroAmount(100);
		books.add(newBook);
		System.out.println("\n" + newBook);
		books.add(new Book(books.get(1)));
		System.out.println("\nThe copied book is " + books.get(books.size()-1));
		
	}
	private static void displayBook(Book book) {
		System.out.println("\n" + book + ",\n with price in euro: " + BookUtility.convertDollarToEuro(book.getPrice()));
	}
	private static Book createBookWithGivenEuroAmount(double price) {
		return new Book("Some European Book", BookUtility.convertEuroToDollar(price));
	}
}
