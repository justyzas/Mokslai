package lt.sefu.aclasses;

import lt.sefu.interfaces.MakingSoundAnimal;

public abstract class Animal implements MakingSoundAnimal{
	public String name;
	public int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
	}
	
	
	@Override
	public void animalSound(String sound) {
		System.out.println(sound);
	}

}
