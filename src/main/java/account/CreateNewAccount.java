package account;

public class CreateNewAccount {
	private String firstName;
	private String lastName;
	private int accountNumber;

	public CreateNewAccount (String fName, String lName, int accNo) {
		firstName = fName;
		lastName = lName;
		accountNumber= accNo;

	}
	
	public void newAccount(Service service) {
		Account account = new Account();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setAccountNumber(accountNumber);
		service.addAccount(account);
	}

}
