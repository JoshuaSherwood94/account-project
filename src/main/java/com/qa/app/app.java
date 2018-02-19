package com.qa.app;

import org.json.JSONObject;

import account.Service;

class app {
	public static void main(String args []) {
		System.out.println("Hello World!");

		Service service = new Service();
		account.CreateNewAccount newAccount = new account.CreateNewAccount();
		newAccount.newAccount(service);
		
		//System.out.println(service.getAccount().getFirstName());
		//System.out.println(service.getAccount().getLastName());
		//System.out.println(service.getAccount().getAccountNumber());
		
		JSONObject json = new JSONObject(service.getMap());
		System.out.println(json);
	}
}
