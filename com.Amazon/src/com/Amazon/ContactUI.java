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
				System.out.println("Enter Name.");
				Scanner s2 = new Scanner(System.in);
				String n2 = s2.nextLine();
				cts.newName(n2);
				break;
			case 2:
				System.out.println("Enter Name");
				Scanner s3 = new Scanner(System.in);
				String n3 = s3.nextLine();
				System.out.println("Enter Phone#.");
				Scanner s4 = new Scanner(System.in);
				String num = s4.nextLine();
				cts.changePhone(n3, num);
				break;
			case 3:
				System.out.println("Enter Name");
				Scanner s5 = new Scanner(System.in);
				String n5 = s5.nextLine();
				System.out.println("Enter Email Address.");
				Scanner s6 = new Scanner(System.in);
				String mail = s6.nextLine();
				cts.changeEmail(n5, mail);
				break;
			case 4:
				System.out.println("Enter Name to Remove");
				Scanner s7 = new Scanner(System.in);
				String n7 = s7.nextLine();
				cts.removeContact(n7);
				break;
			case 5:
				cts.printContact();
				break;
			case 6:
				System.out.println("Enter Name to Print");
				Scanner s9 = new Scanner(System.in);
				String n9 = s9.nextLine();
				cts.queryContact(n9);
				break;
			case 7:
				ctn = false;
				break;
			}	
		}
	}
}
