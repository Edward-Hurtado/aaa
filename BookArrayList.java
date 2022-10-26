import java.util.ArrayList;
public class BookArrayList {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(123,"Harry Potter", 54.99));
		books.add(new Book(456,"Java Tutorial",124.99));
		books.add(new Book(1231,"Cooking with Masterchef",75.54));
		books.add(new Book(999, "American History", 65.87));
		System.out.println("Printing using traditionalDisplay");
		traditionalDisplay(books);
		System.out.println("\nPrinting using enhanced Display");
		enhancedDisplay(books);
		
		books.remove(1);
		System.out.println("\nBooks after removing second book:");
		enhancedDisplay(books);
		
		books.add(1,new Book(903,"Brand new book", 88.05));
		System.out.println("\nBooks after inserting a new second book:");
		enhancedDisplay(books);
		
		books.set(1, new Book(903, "Calculus is fun", 88.05));
		System.out.println("\nBooks after updating the second book");
		enhancedDisplay(books);
	}
	public static void traditionalDisplay(ArrayList<Book>Books) {	
		for(int i =0; i < Books.size();i++) {
			System.out.println(Books.get(i));
		}
	}
	public static void enhancedDisplay(ArrayList<Book> Books) {
		for(Book books: Books) {
			System.out.println(books);
		}
	}
}
