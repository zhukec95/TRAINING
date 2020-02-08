package com.Amazon;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactUI {
	public static void main(String[] args) {
		Boolean ctn = true;
		Contacts cts = new Contacts();
		while(ctn) {
			System.out.println("1. New Contact");
			System.out.println("2. Set Phone#");
			System.out.println("3. Set Email Address");
			System.out.println("4. Remove Contact");
			System.out.println("5. Print Contact");
			System.out.println("6. Query Contact");
			System.out.println("7. Exit");
			Scanner s1 = new Scanner(System.in);
			int input = s1.nextInt();
			switch(input) {
			case 1:
				cts.newName();
				break;
			case 2:
				cts.changePhone();
				break;
			case 3:
				cts.changeEmail();
				break;
			case 4:
				cts.removeContact();
				break;
			case 5:
				cts.printContact();
				break;
			case 6:
				cts.queryContact();
				break;
			case 7:
				ctn = false;
				break;
			}	
		}
	}
}
