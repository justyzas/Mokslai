package lt.sefu.main;


//class Person
// pid
// firstName
// lastName
// BankAccounts[]
// unregisterFromBank(Bank)
// registerToBank(Bank)

//class Bank

//constructor
//static allBanks[];
//FIELDS
//name
//BankAccounts[] bankAccounts
//createBankAccount()

// BankAccount
// accountNumber
// moneyCount
// Bank bank






public class Dog {
	
	private String name;
	private int age;
	private String breed = "Vokieciu aviganis";
	
	//Statiniai laukeliai priklauso klasei o ne objektui	
	public static int dogsCount = 0;
	
	//------ CONSTRUCTORS
//		METHOD OVERLOADING
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		Dog.dogsCount++;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.dogsCount++;
	}
	



	

	//	SPECIAL METHODS
	//Objekto preview per specialų metodą
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}
	
	//OUR METHODS
	public void bark(){
		System.out.println("Bork bork");
	}
	
	public void print() {
		System.out.println("Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]");
	}

	
	//------- GETTERS SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	
}
