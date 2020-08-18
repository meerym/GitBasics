package com.syntax.class24;

public class Bank {
	
	double money, fee;

	public Bank(double money) {
		this.money = money;
		
	}
	void chargeFee() {
		
		if(money<1000) {
			fee=money*0.1;
			
		}else {
			fee=0;
			
		}
	}
	
	
	
	class BOA extends Bank{
		
		
		public BOA(double money) {
			
			super(money);
			
			
		}
	}
	
	class PNC extends Bank{
	
		public PNC(double money) {
			
			super(money);
			
		}
		
	}

	
	
}
