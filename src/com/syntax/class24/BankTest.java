package com.syntax.class24;

import com.syntax.class24.Bank.BOA;

public class BankTest {
	
	public static void main(String[] args) {
		
		
		BOA boa = new BOA(9000);
		double boaFee = boa.chargeFee();
		System.out.println(boaFee);
		
		PNC pnc = new PNC(900);
		double pncFee = pnc.chargeFee();
		
		System.out.println();
	}

}
