import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTester {
	private Book book1, book2, book3;
	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book(1234,"testing1",2.99);
		book2 = new Book(1473,"testing2",4.99);
		book3 = new Book(8921,"testing3",9.99);
	}

	@AfterEach
	public void tearDown() throws Exception {
		book1=book2=book3=null;
	}
	public void testEqualsObject() {
		assertFalse(book1.equals(book2));
		assertTrue(book1.equals(book3));
		assertFalse(book2.equals(book3));
		
	}
	@Test
	public void testGetisbn() {
		int isbn = book2.getisbn();
		assertEquals(1473,isbn);
	}

	@Test
	public void testGetTitle() {
		String expectedString = "testing1";
		assertEquals(book1.getTitle(),expectedString);
		assertEquals(book2.getTitle(),"testing2");
		
	}

	@Test
	public void testGetPrice() {
		assertEquals(2.99,book1.getPrice(),.001);
		book1.setPrice(16.99);
		assertEquals(16.99,book1.getPrice(),.001);
	}

//	@Test
//	void testSetIsbn() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetTitle() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetPrice() {
//		fail("Not yet implemented");
//	}

}
