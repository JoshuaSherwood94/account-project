package nameAmountTest;

import java.util.Iterator;
import java.util.Map;

import account.Account;
import account.Service;

public class getAccountInfo {
	private int counter;

	public int getFirstName(Map mp) {
		Account account = new Account();
		
		Iterator it = mp.entrySet().iterator();
		
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        pair.getValue();
	        
	        if (((Account) pair.getValue()).getFirstName()== "Joshua") {
	        	counter ++;
	        }
	    }
		return counter;
	}
}
