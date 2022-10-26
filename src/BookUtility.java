
public class BookUtility {
	private double rate;
	
	public static double convertDollarToEuro(double amount) {
		return amount * 0.97;
	}
	public static double convertEuroToDollar(double amount) {
		return amount / 0.97;
	}
	
}
