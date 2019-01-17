package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "페르시안", "야옹이");
		
		Dog dog = new Dog(2, "시베리안 허스키", "댕댕이");
		/*
		 * cat.setName("야옹이"); cat.setAge(3); cat.setKind("페르시안");
		 */
		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();

		dog.printDogInfo();
		dog.run();
		dog.hunt();
		dog.play();
		
	}

}
