public class DogDriver {
	public static void main(String[] args) {
		Dog pitbull = new Dog();
		Dog golden_retriever = new Dog("Golden Retriever", 150);
		System.out.println(golden_retriever);
		System.out.println(pitbull);
		pitbull.sound();
		pitbull.setWeight(200);
		pitbull.setBreed("Pitbull");
		System.out.println(pitbull.toString());
		golden_retriever.setWeight(400);
		golden_retriever.setBreed("Golden");
		System.out.println(golden_retriever.toString());
		System.out.println(golden_retriever.convertWeight(golden_retriever.getWeight()));
		
	
	}
}
