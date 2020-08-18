package com.syntax.RECAPclass10;

public abstract class BankATM {
	
	//depositMoney
	//depositCheck
	//withdrawMoney
	//transferMoney
	
	
	double checkingFund;
	double savingFund;
	
	
	public BankATM(double chekingFund, double savingFund) {
		this.checkingFund=chekingFund;
		this.savingFund=savingFund;
	
	}
	
	
	public abstract void depositMoney(String accountType, double amount);  //abstract/ unimplemented method
	public abstract void depositCheck(String accountType, double amount);  //abstract/ unimplemented method
	
	
	//ATM should not allow us withdraw money in multiples of 1 or 5 dollars
	//if amount entered is smaller than our money in the bank --> insufficient amount

	public void withdrawMoney(String accountType, double amount) {  //concrete /implemented method
	
		if (amount %10!=0) {
			
			System.out.println("Amount must be multiples of $10");
			
		}else {
			
			double a=0;
			if(accountType.equals("checking")){
				a=checkingFund;
				
			}else if (accountType.equals("saving")) {
				
				a=savingFund;
			}
			
			
			
			if (amount>a) {
				
				System.out.println("Insufficient Fund");
			}else {
				
				System.out.println(amount + " is withdrawn from your " + accountType);
			}
		}
	
	}

}
