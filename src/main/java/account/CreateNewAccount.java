package account;

public class CreateNewAccount {
	private String firstName = "joshua";
	private String lastName = "Sherwood";
	private int accountNumber = 1;
	
	private String firstName2 = "jane";
	private String lastName2 = "Tipping";
	private int accountNumber2 = 2;
	
	public void createNewAccount () {

	}
	
	public void newAccount(Service service) {
		Account account = new Account();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setAccountNumber(accountNumber);
		service.addAccount(account);
		
		Account account2 = new Account();
		account2.setFirstName(firstName2);
		account2.setLastName(lastName2);
		account2.setAccountNumber(accountNumber2);
		service.addAccount(account2);
	
	}

}
