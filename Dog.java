
public class Dog {
	private String breed;
	private int weight;
	/**
	 * Default no-arg Constructor
	 */
	public Dog() {
		breed = "";
		weight = 0;
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param breed the breed of the dog
	 * @param weight the breed of the dog
	 */
	public Dog(String breed, int weight) {
		this.breed = breed;
		this.weight = weight;
	}
	/**
	 * Returns the dogs breed
	 * @return a String corresponding to the dogs breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * Returns the dogs weight
	 * @return a Int corresponding to the dogs weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * sets dogs breed
	 * @param breed the breed of the dog
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * sets dogs weight
	 * @param weight the weight of the dog
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "The dogs breed is: " + this.breed + " with a weight of: " + this.weight + " pounds.";
	}
	public void sound() {
		System.out.println("I am barking");
	}
	public double convertWeight(int weight) {
		final double WEIGHT_KB = 0.45;
		this.weight = (int) (weight * WEIGHT_KB);
		return this.weight;
	}

}
