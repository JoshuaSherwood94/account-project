package account;

import java.util.HashMap;
import java.util.Map;
import account.Account;

public class Service {
	private Map <Integer, Account> map = new HashMap<Integer, Account>();
	private int counter = 1;

	public void addAccount(Account account)
	{
		 getMap().put(counter, account);
		 counter++;
	}
	
	public Account getAccount()
	{
			
		return getMap().get(1);
	}

	public Map <Integer, Account> getMap() {
		return map;
	}

	public void setMap(Map <Integer, Account> map) {
		this.map = map;
	}
}
