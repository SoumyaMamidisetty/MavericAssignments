package com.assignment1.managingcontacts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.assignment3.bankapp.JDBCConnector;

public class AddressBookDemo {

	public static void main(String args[]) throws Exception {

		AddressBook addressBook = new AddressBook();

		// Create a contact
		// List of phones
		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

		PhoneNumber personalPhone = new PhoneNumber("Personal", "+91886699372");
		PhoneNumber officePhone = new PhoneNumber("Office", "+918882873792");
		PhoneNumber personalPhone1 = new PhoneNumber("personal1","5675678907");
		PhoneNumber officePhone1 = new PhoneNumber("Office1","7896578908");

		phoneNumbers.add(personalPhone);
		phoneNumbers.add(officePhone);
		phoneNumbers.add(personalPhone1);
		phoneNumbers.add(officePhone1);

		List<Address> addresses = new ArrayList<Address>();

		Address home = new Address("Home", "F1Kagadaspura");
		Address office = new Address("office", "MG Road");
		Address home1 = new Address("Home", "Belandur");
		Address Office1 = new Address("office1","Marthalli");
		addresses.add(home);
		addresses.add(office);
		addresses.add(home1);
		addresses.add(Office1);

		Contact contact = new Contact("Soumya", "Maveric", phoneNumbers, addresses);
		Contact contact1 = new Contact("Rojesh","Medtronic",phoneNumbers, addresses);

		try {
			addressBook.addContact(contact);
			createAConnection(contact);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	private static void createAConnection(Contact contact) throws Exception {
		JDBCConnector.createJDBCConnection();
		JDBCConnector.InsertContact(contact);
		
		
	}
}
