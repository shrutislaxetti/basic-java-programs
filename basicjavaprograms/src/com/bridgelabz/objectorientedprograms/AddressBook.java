package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.utility.Utility;

public class AddressBook {
	
	
	boolean changedSinceLastSave;
	String filename = Utility.userInputString();
	String file = "/home/bridgrlabz/Addressbook/"+filename+".json";
	public void addPerson() throws Exception {
		
		System.out.println("enter 1. to add new Address book");
		System.out.println("enter 2. to add to existing Address book");
		System.out.println("enter your chioice");
	     switch(Utility.userInputInteger()) {
			
	     case 1:
	        System.out.println("enter the file name");
	    	
	    	 UtilityAddressBook.addPerson(file);
	     break;
		
	     case 2:	
	    	  System.out.println("enter the file name");
	    	 UtilityAddressBook.addPersonToexistingfile(file);
	     break;
		}
	}

	public void doEdit() throws Exception {
		System.out.println("Enter the file name you want to edit");
		
		System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		UtilityAddressBook.editinformation(file, index);

	}

	public void remove() throws Exception {
		System.out.println("Enter the file name you want to delete");
		System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		UtilityAddressBook.remove(index, file);

	}

	public void sort() throws Exception {
		System.out.println("Enter the file name you want Sort...");
		UtilityAddressBook.sort(file);
	}
	
}