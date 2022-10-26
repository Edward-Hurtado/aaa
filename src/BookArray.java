import java.util.Scanner;
import java.util.ArrayList;
public class BookArray {
	public static void main(String[] args) {
		System.out.println("How many books do you have?");
		Scanner userInput = new Scanner(System.in);
		int numberOfBooks = userInput.nextInt();
		String nameOfBook = "";
		double priceOfBook = 0.0;
		int isbnOfBook = 0;
		Book[] bookArray = new Book[numberOfBooks];
		for(int i=0;i < numberOfBooks;i++) {
			System.out.print("Enter name of the book " + (i+1) + " ");
			userInput.nextLine();
			nameOfBook = userInput.nextLine();
			bookArray[i] = new Book();
			bookArray[i].setTitle(nameOfBook);
			System.out.print("Enter price of the book " + (i+1) + " ");
			priceOfBook = userInput.nextDouble();
			bookArray[i].setPrice(priceOfBook);
			System.out.println("Enter ISBN of book " + (i+1) + " ");
			userInput.nextLine();
			isbnOfBook = userInput.nextInt();
			bookArray[i].setIsbn(isbnOfBook);
		}
		displayBooks(bookArray);
		System.out.println("Your total price: " + totalPrice(bookArray));
		System.out.println("Your average sales: " + avgSales(bookArray));
		System.out.println("Your highest price: " + highestPrice(bookArray));
		System.out.println("Your lowest price: " + lowestPrice(bookArray));
		System.out.println("The book " + priceHigher(bookArray,120.99) + " has price higher than 120.99");		
	}
	public static void displayBooks(Book[] arr) {
		for(int i=0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static double totalPrice(Book[] arr) {
		double total = 0.0;
		for(int i=0;i < arr.length;i++) {
			total+=arr[i].getPrice();
		}
		return total;
	}
	public static double avgSales(Book[] arr) {
		double avg = 0.0;
		for(int i =0; i < arr.length;i++) {
			avg+=arr[i].getPrice();
		}
		avg = avg / arr.length;
		return avg;
	}
	public static double highestPrice(Book[]arr) {
		double highestPrice = arr[0].getPrice();
		for(int i =0; i < arr.length;i++) {
			if(arr[i].getPrice() > highestPrice) {
				highestPrice = arr[i].getPrice();
			}
		}
		return highestPrice;
	}
	public static double lowestPrice(Book[]arr) {
		double lowestPrice = arr[0].getPrice();
		for(int i =0; i < arr.length;i++) {
			if(arr[i].getPrice() < lowestPrice) {
				lowestPrice = arr[i].getPrice();
			}
		}
		return lowestPrice;
	}
	public static String priceHigher(Book[] arr, double val) {
		String highestValTitle =arr[0].getPrice() > val ? arr[0].getTitle() : "N/A";
		for(int i=0 ; i < arr.length;i++) {
			if(arr[i].getPrice() > val) {
				highestValTitle = arr[i].getTitle();
			}
		}
		return highestValTitle;
	}

	
}
