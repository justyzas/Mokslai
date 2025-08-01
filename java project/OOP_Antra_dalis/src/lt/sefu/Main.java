package lt.sefu;


import lt.sefu.classes.Dog;
//import lt.sefu.classes.BankAccount;
import lt.sefu.classes.Pig;
public class Main {

	public static void main(String[] args) {
//		BankAccount ba = new BankAccount(20, "LT8765416556516515");
//		
//		System.out.println(ba);
		
		Pig a1 = new Pig("Johnny Sins", 12);
		
		a1.animalSound("Coding coding!!");
		a1.rollOnTheGround();
		
		
		
		Dog d1 = new Dog("Pamela Anderson", 14, "Puddel");
		
		d1.animalSound("Coding coding!!");
	
	}
	
}
