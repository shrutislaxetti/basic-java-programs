package com.bridgelabz.objectorientedprograms;

import java.io.File;

import com.bridgelabz.utility.Utility;

public class AddressBookController {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Address Book");
		AddressBook addressbook = new AddressBook();
 
		System.out.println("Enter 1 to Add a new address Book");
		System.out.println("Enter 2 to view Address Book");
		System.out.println("Enter 3 to sort by Name ");
		System.out.println("Enter 4 to exit");
		int choice = Utility.userInputInteger();
		switch (choice) {
		case 1: {
			System.out.println("Enter 1 to Add Person ");
			System.out.println("Enter 2 to Edit Person");
			System.out.println("Enter 3 to Delete P");
			int choice1 = Utility.userInputInteger();

			switch (choice1) {
			case 1: {

				addressbook.addPerson();

				break;
			}
			case 2: {

				addressbook.doEdit();

				break;
			}
			case 3: {

				addressbook.remove();

				break;
			}
			}
		}
		
		case 2:

			File folder = new File("/home/bridgrlabz/Addressbook/");
			File[] listOfFiles = folder.listFiles();
			for (File file : listOfFiles) {
				if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
			System.out.println("Enter the file name you want View");
			String filename = Utility.userInputString();
			String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";

			UtilityAddressBook.print(file);

			break;

		case 3:

			addressbook.sort();

			break;

		case 4:
			return;
		}
	}
}
