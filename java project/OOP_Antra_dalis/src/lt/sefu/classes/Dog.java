package lt.sefu.classes;

import lt.sefu.aclasses.Animal;

public class Dog extends Animal{
	
	public String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public void animalSound() {
		System.out.println("Woof Woof!");
		
	}

	



}
