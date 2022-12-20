package org.bank;
//Override
public class AxisBank extends BankInfo {//child
	@Override
	public void deposit(){
		System.out.println("Deposit is: 10000");

	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	
	}
}