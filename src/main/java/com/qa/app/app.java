package com.qa.app;

import org.json.JSONObject;

import account.Service;

class app {
	public static void main(String args []) {
		System.out.println("Hello World!");
		
		int accountCounter = 1;

		Service service = new Service();
		account.CreateNewAccount newAccount = new account.CreateNewAccount("Joshua","Sherwood", accountCounter);
		newAccount.newAccount(service);
		accountCounter++;
		
		account.CreateNewAccount newAccount2 = new account.CreateNewAccount("Jane","Tipping", accountCounter);
		newAccount2.newAccount(service);
		accountCounter++;
		
		/*System.out.println(service.getAccount().getFirstName());
		System.out.println(service.getAccount().getLastName());
		System.out.println(service.getAccount().getAccountNumber());*/
		
		System.out.println(service.getAccount().getFirstName());
		
		JSONObject json = new JSONObject(service.getMap());
		System.out.println(json);
	}
}
