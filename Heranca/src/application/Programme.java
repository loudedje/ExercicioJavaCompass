package application;

import entities.Account;
//import entities.BussinessAccount;
import entities.SavingAccount;

public class Programme {
	public static void main (String[]args) {
	
		
		
		Account acc1 = new Account (101, "Alex", 1000.0);
		
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		
		Account acc2 = new SavingAccount(1002,"Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
	/*	Account acc = new Account(1001, "Loude", 0.0);
		
		BussinessAccount bacc = new BussinessAccount(1002,"Djema", 0.0, 500.00);
		
		//Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount (1003, "Vaica", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Maria", 0.0, 0.01);
		
		
		//Downcasting
		
		BussinessAccount acc4 = (BussinessAccount)acc2; 
		acc4.loan(100.0);
		
		if(acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200);
		System.out.println("Loan!");	
		}
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/
		
	
	}
	}

