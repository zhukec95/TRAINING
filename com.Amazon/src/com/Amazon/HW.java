package com.Amazon;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		int a = Integer.valueOf(obj1.next());
		Scanner obj2=new Scanner(System.in);
		int b = Integer.valueOf(obj2.next());
		//for(int i=a+1;i<b;i++) System.out.println(i);
		int i=a+1;
		int s=0;
		while(i<b) {
			s+=i;
			i++;
		}
		System.out.println(s);
	}
}

