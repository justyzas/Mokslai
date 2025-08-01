package lt.sefu.classes;

public class BankAccount {
	float money = 0;
	String accountNumber = "ABC123";
	
	public BankAccount(float money, String accountNumber) {
		this.money = money;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [money=" + money + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
}
