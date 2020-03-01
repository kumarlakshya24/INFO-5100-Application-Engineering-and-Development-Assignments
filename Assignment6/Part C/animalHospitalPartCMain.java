package Assignment6;

public class animalHospitalPartCMain {

	public static void main(String[] args) {
			//Pet Class
			Pet p = new Pet("Amanda", "Adam", "Golden");
			p.setSex(2);
			System.out.println(p + "\n");
			//Dog Class
			Dog dog = new Dog("Eden", "Chelsea", "Blue", "Big");
			dog.setSex(4);
			System.out.println(dog);	
			dog.setBoardStart(1, 1, 2019);
			dog.setBoardEnd(12, 31, 2022);
			System.out.println("\n" + "Boarding Result is: " +dog.boarding(2, 27, 2023) + "\n");
			//Cat Class
			Cat cat = new Cat("Sylvester", "Emma", "Black and White", "Long");
			cat.setSex(1);
			System.out.println(cat);		
			cat.setBoardStart(1, 1, 2019);
			cat.setBoardEnd(12, 31, 2022);
			System.out.println("\n" + "Boarding Result is: " +cat.boarding(2, 27, 2020));
	}

}
