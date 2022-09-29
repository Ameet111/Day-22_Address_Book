package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBook_UC6 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		int ans;
		Collection c = new Collection();
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add ");
			System.out.println("2.Display");
			System.out.println("3.Edit");
			System.out.println("4.Delete");
			ch= s.nextInt();
			switch(ch) {
			case 1: 
				c.readData();
				break;
			case 2:
				c.DisplayContacts();
				break;
			case 3:
				c.editData();;
				break;
			case 4:
				c.deleteData();
				break;
			}System.out.println("Do you want to continue? if yes press '1' ");
			ans = s.nextInt();
		}while(ans == 1);

	}

}
