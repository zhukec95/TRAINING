package com.Amazon;

public class savingAccount extends bankAccount {
	public void withdraw(double amt) {
		if(amt > this.getBalance()-500) System.out.println("Insufficient Fund");
		else {
			this.setBalance(this.getBalance()-amt);
			System.out.println(this.getName());
			System.out.println(this.getBalance());
		}
	}
}
