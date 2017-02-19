class BankTest {
	public static void main(String[] args) {

		// Create variable without intialising
		BankAccount test;

		// Create new BankAccount instance with 3 arguements
		if(args.length == 3) {
			test = new BankAccount(args[0], args[1], Float.parseFloat(args[2]));
		}
		else {
			test = new BankAccount(args[0], args[1]);			
		}

		System.out.println(test);

		test.addBalance(500);

		System.out.println("\n" + test);

		test.removeBalance(250);

		System.out.println("\n" + test);

		test.setName("Bob");

		System.out.println("\n" + test);		
	}
}