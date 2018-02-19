package account;

public class CreateNewAccount {
	private String firstName = "joshua";
	private String lastName = "Sherwood";
	private int accountNumber = 1;
	
	public void createNewAccount () {

	}
	
	public void newAccount(Service service) {
		Account account = new Account();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setAccountNumber(accountNumber);

		service.addAccount(account);
	
	}

}
