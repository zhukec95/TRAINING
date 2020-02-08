package com.Amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	private ArrayList<Contact> cts = new ArrayList<Contact>();
	public void newName() {
		String n1="", n2="";
		while(true) {
			System.out.println("Please Enter Last Name");
			Scanner s1 = new Scanner(System.in);
			n1 = s1.nextLine();
			if(n1.length()>0 && n1.length()<51) break;
			System.out.println("Last name must contain 1-50 chars.");
		}
		while(true) {
			System.out.println("Please Enter First Name");
			Scanner s2 = new Scanner(System.in);
			n2 = s2.nextLine();
			if(n2.length()>1 && n2.length()<51) break;
			System.out.println("First name must contain 2-50 chars.");
		}
		for(Contact ct:cts) {
			if((ct.getLastname()+" "+ct.getFirstname()).equals(n1+" "+n2)) {
				System.out.println("Contact Existed.");
				return;
			}	
		}
		Contact ct = new Contact();
		ct.setLastname(n1);
		ct.setFirstname(n2);
		ct.setName(n2+" "+n1);
		cts.add(ct);
	}
	public void removeContact() {
		System.out.println("Please Enter Last Name");
		Scanner s3 = new Scanner(System.in);
		String n3 = s3.nextLine();
		System.out.println("Please Enter First Name");
		Scanner s4 = new Scanner(System.in);
		String n4 = s4.nextLine();
		for(Contact ct:cts) {
			if((ct.getLastname()+" "+ct.getFirstname()).equals(n3+" "+n4)) {
				cts.remove(ct);
				System.out.println("Contact Removed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void changePhone() {
		String n7="";
		System.out.println("Please Enter Last Name");
		Scanner s5 = new Scanner(System.in);
		String n5 = s5.nextLine();
		System.out.println("Please Enter First Name");
		Scanner s6 = new Scanner(System.in);
		String n6 = s6.nextLine();
		for(Contact ct:cts) {
			if((ct.getLastname()+" "+ct.getFirstname()).equals(n5+" "+n6)) {
				while(true) {
					System.out.println("Please Enter Phone#");
					Scanner s7 = new Scanner(System.in);
					n7 = s7.nextLine();
					if(n7.length()>9 && n7.length()<13) break;
					System.out.println("Phone# must contain 10-12 digits.");
				}
				ct.setPhone(n7);
				System.out.println("Phone# Changed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void changeEmail() {
		String n10="";
		System.out.println("Please Enter Last Name");
		Scanner s8 = new Scanner(System.in);
		String n8 = s8.nextLine();
		System.out.println("Please Enter First Name");
		Scanner s9 = new Scanner(System.in);
		String n9 = s9.nextLine();
		for(Contact ct:cts) {
			if((ct.getLastname()+" "+ct.getFirstname()).equals(n8+" "+n9)) {
				while(true) {
					System.out.println("Please Enter Email Address");
					Scanner s10 = new Scanner(System.in);
					n10 = s10.nextLine();
					if(n10.length()>5 && n10.length()<51 && n10.indexOf("@")!=-1
					&& n10.indexOf(".")!=-1 
					&& n10.indexOf(".")>n10.indexOf("@")) break;
					System.out.println("Email Address must contain 6-50 chars including . and @.");
				}
				ct.setEmail(n10);
				System.out.println("Email Address Changed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void queryContact() {
		if(cts.isEmpty()) {
			System.out.println("Empty.");
			return;
		}
		System.out.println("Please Enter Last Name");
		Scanner s11 = new Scanner(System.in);
		String n11 = s11.nextLine();
		System.out.println("Please Enter First Name");
		Scanner s12 = new Scanner(System.in);
		String n12 = s12.nextLine();
		for(Contact ct:cts) {
			if((ct.getLastname()+" "+ct.getFirstname()).equals(n11+" "+n12)) {
				System.out.println(ct.getName());
				if(ct.getPhone().length()==10) {
					System.out.println("("+ct.getPhone().substring(0, 2)+")"
					+ct.getPhone().substring(3, 5)+"-"
					+ct.getPhone().substring(6, 9));
				}
				else if(ct.getPhone().length()>10) {
					int l=ct.getPhone().length();
					System.out.println("+"+ct.getPhone().substring(0, l-10)
					+"("+ct.getPhone().substring(l-10, l-7)+")"
					+ct.getPhone().substring(l-7, l-4)+"-"
					+ct.getPhone().substring(l-4, l-1));
				}
				else System.out.println("");
				System.out.println(ct.getEmail());
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void printContact() {
		if(cts.isEmpty()) {
			System.out.println("Empty.");
			return;
		}
		for(Contact ct:cts) {
			System.out.println(ct.getName());	
		}
	}
}
