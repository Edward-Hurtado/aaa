import java.util.ArrayList;
public class BookDriver2 {
	public static void main(String[] args) {		
	
//	ArrayList<Book> books = new ArrayList<>();
//	books.add(new Book("Test test", 39.99, new Author("Tom", "Smith") ));
//	books.add(new Book("Java Tutorial", 124.99,new Author("Mary", "Jones")));
//	books.add(new Book("Cooking with Masterchef", 75.94,new Author("Bill", "Clinton")));
		Book[] bookArray = new Book[3];
		bookArray[0] = new Book("Harry Potter", 54.99, new Author("Will","Smith"));
		Author newAuthor = new Author("Tom", "Smith");
		Author newAuthor2 = new Author(newAuthor);
		bookArray[1] = new Book("Java Tutorial", 124.99, newAuthor2);
		bookArray[2] = new Book("Cooking with Masterchef", 75.54, new Author("Chef", "Master"));
		System.out.println(" **** Original array *****");
		for(Book bk: bookArray) {
		displayBook(bk);
		}
		Book[] referenceCopy = referenceCopy(bookArray);
		referenceCopy[0].setTitle("Changed Title");
		for(Book bk: referenceCopy) {
		displayBook(bk);
		}
		Book[] shadowCopy = shadowCopy(bookArray);
		Author newAuthorForShadow = new Author("Mary", "Jones");
		shadowCopy[1].setAuth(newAuthorForShadow);
		for(Book bk: shadowCopy) {
			displayBook(bk);
		}
		Book[] deepCopy = deepCopy(bookArray);
		deepCopy[2].setAuth(newAuthorForShadow);
		for(Book bk: deepCopy) {
			displayBook(bk);
		}
		
		
	}
	private static void displayBook(Book book) {
			System.out.println(book);
	}
	public static Book[] referenceCopy(Book[] book) {
		System.out.println("***** Reference Copy ******");
		Book[] referenceCopyBook = book;
		return referenceCopyBook;
		
	}
	public static Book[] shadowCopy(Book[] book) {
		System.out.println("***** Shadow Copy ***** ");
		Book[] shadowCopy = new Book[book.length];
		shadowCopy[0] = book[0];
		shadowCopy[1] = book[1];
		shadowCopy[2] = book[2];
		return shadowCopy;
	}
	public static Book[] deepCopy(Book[] book) {
		System.out.println("***** Deep Copy ***** ");
		Book[] deepCopy = new Book[book.length];
		deepCopy[0] = new Book(book[0].getTitle(),book[0].getPrice(),book[0].getAuthor());
		deepCopy[1] = new Book(book[1].getTitle(),book[1].getPrice(),book[1].getAuthor());
		deepCopy[2] = new Book(book[2].getTitle(),book[2].getPrice(),book[2].getAuthor());
		return deepCopy;
	}
}
