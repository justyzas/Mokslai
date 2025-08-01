package lt.sefu.classes;

import lt.sefu.aclasses.Animal;
import lt.sefu.interfaces.MakingSoundAnimal;

public class Pig extends Animal implements MakingSoundAnimal{
	
	
	public Pig(String name, int age) {
		super(name, age);
	}

	public void rollOnTheGround()
	{
		System.out.println("Rolling rolling rolling!! Eating everything...");
	}

	@Override
	public void animalSound() {
		System.out.println("Oink Oink");
	}
	

}
