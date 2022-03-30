package com.addressbookfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * 1. Creating new Contact in address book with first and last names, address,city, state, zip, phone number and email. 
 * 2. adding new contact to address book 
 * 3.editing contact with name 
 * 4. Delete person using person's name
 * 5. Add multiple persons in address book 
 * 6. add multiple address book with unique Name 
 * 7. check if duplicate entry of same person in particular address book 
 * 8. Search person in city or state across multiple address book 
 * 9. view person by city or state 
 * 10. Get number of contact i.e. count by city or state
 * 11. sort the entries in the address book alphabetically by Person’s name 
 * 12. sort the entries in the address book by City, State, or Zip
 * 13.Read or Write the Address Book with Persons Contact into a File using File IO
 */

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program...!!!");
		Scanner sc = new Scanner(System.in);

		try {
			InputStream inputStream = new FileInputStream("C:\\Users\\HP\\Desktop\\day27.txt");
			int byteData = inputStream.read();
			if (byteData != -1) {
				System.out.println(byteData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file = new File("C:\\Users\\HP\\Desktop\\day27.txt");
		try {
			boolean isFileCreated = file.createNewFile();
			if (isFileCreated) {
				System.out.println("File created successFully");
			} else {
				System.out.println("!!!..File Not created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * creating object of AddNewContact
		 */
		AddNewContact addNew = new AddNewContact();

		/**
		 * creating object of UniqueMultipleAddressBook for adding Unique name address
		 * book
		 */
		UniqueMultipleAddressBook unique = new UniqueMultipleAddressBook();

		while (true) {
			System.out.println("Enter \n    1. Add the new AddressBook \n " + "2. Add new contact \n "
					+ "3. Edit the contact \n " + "4. Delete the contact \n " + "5. Delete the AddressBook \n "
					+ "6. Print the AddressBook \n " + "7. Print the contacts \n " + "8. Search By city \n "
					+ "9. Search By state \n " + "10. View Person By City \n " + "11. view Person By state \n "
					+ "12. Count people \n " + "0. Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				unique.addAddress();
				break;
			case 2:
				unique.addContact();
				break;

			case 3:
				unique.editContact();
				break;

			case 4:
				unique.deleteContact();
				break;

			case 5:
				unique.deleteAddressBook();
				break;
			case 6:
				unique.printBook();
				break;
			case 7:
				unique.printContacts();
				break;
			case 8:
				unique.searchByCity();
				break;
			case 9:
				unique.searchByState();
				break;
			case 10:
				unique.viewPerson(AddNewContact.personByCity);
				break;
			case 11:
				unique.viewPerson(AddNewContact.personByState);
				break;

			case 12:
				System.out.println("Enter \n1.Count By City \n2. Count By state");
				int num = sc.nextInt();
				if (num == 1)
					unique.countPeople(AddNewContact.personByCity);
				else
					unique.countPeople(AddNewContact.personByState);
				break;

			case 0:
				System.exit(8);
				break;
			default:
				System.out.println("Wrong Input");
			}
		}

		
	}

}
