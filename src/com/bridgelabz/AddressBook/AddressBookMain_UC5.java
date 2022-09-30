package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBookMain_UC5 {
	
	public static Person_UC5 input(Scanner scanner) {

		System.out.println("First name");
		String firstName = scanner.next();

		System.out.println("Last name");
		String lastName = scanner.next();

		System.out.println("Address");
		String address = scanner.next();

		System.out.println("City");
		String city = scanner.next();

		System.out.println("State");
		String state = scanner.next();

		System.out.println("Zip Code");
		int zip = scanner.nextInt();

		System.out.println("Mobile Number");
		String phoneNumber = scanner.next();

		Person_UC5 person = new Person_UC5(firstName, lastName, address, city, state, zip, phoneNumber);

		return person;
	}


	public static void main(String[] args) {

		AddressBook_UC5 addressBook = new AddressBook_UC5();
		Scanner scanner = new Scanner(System.in);
		/*
	        Contacts added
		 */
		Person_UC5 person = new Person_UC5("Vinayak", "Shinde", "Neharu", "Belagavi", "Karnataka", 587305, "123456789");

		Person_UC5 person1 = new Person_UC5("Ameet", "Jadhav", "Narhe", "Pune", "Maharastra", 411041, "987654321");

		addressBook.addContact(person);
		addressBook.addContact(person1);
		addressBook.printAddressBook();
		
		
		System.out.println("Enter details of new contacts");
		Person_UC5 person2 = input(scanner);
		addressBook.addContact(person2);
		/*
	        addContact method used by adding new Contacts	        
		 */

		System.out.println("enter details of new contacts");
		Person_UC5 person3 = input(scanner);
		addressBook.addContact(person3);

		System.out.println("Multiple Contacts are : ");
		addressBook.printAddressBook();

	}

}
