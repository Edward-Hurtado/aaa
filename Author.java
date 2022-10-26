
public final class Author {
	private final String firstName;
	private final String lastName;
//	private String firstName;
//	private String lastName;
	
	public Author(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//copy constructor
	public Author(Author obj) {
		firstName = obj.firstName;
		lastName = obj.lastName;
		
	}
//	public void setAuthor(String firstName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
	public String toString() {
		return "firstName=" + firstName + "," + "lastName="+ lastName;
	}
	
	public String last() {
		return lastName;
	}
	
	public boolean equals(Author auth) {
		if(firstName == auth.firstName && lastName == auth.lastName) {
			return true;
		} else {
			return false;
		}
	}
	
}
