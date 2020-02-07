package com.Amazon;

import java.util.ArrayList;

public class Contacts {
	private ArrayList<Contact> cts = new ArrayList<Contact>();
	public void newName(String name) {
		for(Contact ct:cts) {
			if(ct.getName().equals(name)) {
				System.out.println("Contact Existed.");
				return;
			}	
		}
		Contact ct = new Contact();
		ct.setName(name);
		cts.add(ct);
	}
	public void removeContact(String name) {
		for(Contact ct:cts) {
			if(ct.getName().equals(name)) {
				cts.remove(ct);
				System.out.println("Contact Removed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void changePhone(String name, String num) {
		for(Contact ct:cts) {
			if(ct.getName().equals(name)) {
				ct.setPhone(num);
				System.out.println("Phone# Changed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void changeEmail(String name, String mail) {
		for(Contact ct:cts) {
			if(ct.getName().equals(name)) {
				ct.setEmail(mail);
				System.out.println("Email Address Changed.");
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void queryContact(String name) {
		if(cts.isEmpty()) {
			System.out.println("Contact Not Found.");
			return;
		}
		for(Contact ct:cts) {
			if(ct.getName().equals(name)) {
				System.out.println(ct.getName());
				System.out.println(ct.getPhone());
				System.out.println(ct.getEmail());
				return;
			}	
		}
		System.out.println("Contact Not Found.");
	}
	public void printContact() {
		if(cts.isEmpty()) {
			System.out.println("No Contact.");
			return;
		}
		for(Contact ct:cts) {
			System.out.println(ct.getName());	
		}
	}
}
