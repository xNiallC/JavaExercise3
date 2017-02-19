class BankAccount {

	// Private Fields
	private String holderName;
	private String number;
	private float balance;

	// Constructor method to set private fields
	public BankAccount(String holderName, String number){
		this.holderName = holderName;
		this.number = number;
		this.balance = 0;
	}

	// Optional constructor to set initial balance
	public BankAccount(String holderName, String number, float balance){
		this.holderName = holderName;
		this.number = number;
		this.balance = balance;
	}	

	// Accessor to get name
	public String getName() {
		return holderName;
	}

	// Mutator to set name
	public void setName(String newName) {
		this.holderName = newName;
	}

	// Accessor
	public String getNumber() {
		return number;
	}

	// Accessor
	public float getBalance() {
		return balance;
	}

	// Add Money to balance
	public void addBalance(float deposit) {
		this.balance += deposit;
	}

	// Take away Money from balance
	public void removeBalance(float withdraw) {
		this.balance -= withdraw;
	}

	public void setBalance(float newBalance) {
		this.balance = newBalance;
	}

	// Override toString
	public String toString() {
		return "Name: " + this.holderName + "\nAccount Number: " + this.number + "\nBalance: " + this.balance;
	}
}