package nameAmountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import account.Service;
import junit.framework.Assert;

public class NameAmountTest {
	private int accountCounter;

	@Test
	public void test() {

		Service service = new Service();
		account.CreateNewAccount newAccount = new account.CreateNewAccount("Joshua","Sherwood", accountCounter);
		newAccount.newAccount(service);
		accountCounter++;
		
		account.CreateNewAccount newAccount2 = new account.CreateNewAccount("Joshua","Dr", accountCounter);
		newAccount2.newAccount(service);
		accountCounter++;
		
		getAccountInfo accountInfo = new getAccountInfo();
		int number = accountInfo.getFirstName(service.getMap());
		
		System.out.println("Number of Joshuas is: " + number);
		Assert.assertEquals(2, number);
	}
}
