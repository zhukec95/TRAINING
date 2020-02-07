package com.Amazon;

import java.util.Scanner;

public class UI_invest {
	public static void main(String[] args) {
		bankAccount act = new investmentAccount();
		Boolean ctn = true;
		while(ctn) {
			System.out.println("1. Account Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			Scanner s1 = new Scanner(System.in);
			int input = s1.nextInt();
			switch(input) {
			case 1:
				System.out.println(act.getBalance());
				break;
			case 2:
				System.out.println("Amount.");
				Scanner s2 = new Scanner(System.in);
				double d = Double.parseDouble(s2.next());
				act.deposit(d);
				break;
			case 3:
				System.out.println("Amount.");
				Scanner s3 = new Scanner(System.in);
				double w = Double.parseDouble(s3.next());
				act.withdraw(w);
				break;
			case 4:
				ctn = false;
				break;
			}	
		}
	}
}
