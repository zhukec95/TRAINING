package com.Amazon;

public class bankAccount {
	private String accountNumber = "123456789";
	private double balance = 50.0;
	private String name = "KEN";
	private String email = "zhukec95@gmail.com";
	private String phoneNumber = "8184517699";
	private String SSN = "000000000";
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public void deposit(double amt) {
		this.balance += amt;
	}
	public void withdraw(double amt) {
		if(amt > this.balance) System.out.println("Insufficient Fund");
		else {
			this.balance -= amt;
			System.out.println(this.name);
			System.out.println(this.balance);
		}
	}
	public void info() {
		System.out.println(this.name);
		System.out.println(this.accountNumber);
		System.out.println(this.balance);
		System.out.println(this.phoneNumber);
		System.out.println(this.email);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
