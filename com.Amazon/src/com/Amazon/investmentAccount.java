package com.Amazon;

public class investmentAccount extends bankAccount {
	public void withdraw(double amt) {
		if(amt > this.getBalance()-5000) System.out.println("Insufficient Fund");
		else {
			this.setBalance(this.getBalance()-amt);
			System.out.println(this.getName());
			System.out.println(this.getBalance());
		}
	}
}
