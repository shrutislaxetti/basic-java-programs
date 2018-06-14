package com.bridgelabz.objectorientedprograms;

import java.io.File;

import com.bridgelabz.utility.Utility;

public class AddressBookController {

	public static void main(String[] args){
		
	

		AddressBook addressbook = new AddressBook();
		System.out.println("Welcome to Address Book");
		while(true)
		{
		System.out.println("Enter 1 to Add a new address Book");
		System.out.println("Enter 2 to view Address Book");
		System.out.println("Enter 3 to sort by Name ");
		System.out.println("Enter 4 to exit");
		int choice = Utility.userInputInteger();
		switch (choice) {
		case 1: {
			System.out.println("Enter 1 to Add AddressBook");
			System.out.println("Enter 2 to Edit AddressBook");
			System.out.println("Enter 3 to Delete AddressBook");
			int choice1 = Utility.userInputInteger();
			switch (choice1) {
			case 1: {

				try {
					addressbook.addPerson();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				try {
					addressbook.doEdit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				
				try {
					addressbook.remove();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			default:break;

			}
			break;
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
			try {
				UtilityAddressBook.print(file);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 3:

			try {
				addressbook.sort();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 4:
			System.exit(0);
			break;
			default: break;
		}
	}
}
}