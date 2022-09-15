package com.assignment1.managingcontacts;

import java.util.ArrayList;
import java.util.List;

public class Contact extends AddressBook {

	// Variable
	private String name;
	private String organisation;
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	private List<Address> addresses = new ArrayList<Address>();

	public Contact(String name, String org, List<PhoneNumber> phoneNumbers, List<Address> addresses) {
		this.name = name;
		this.organisation = org;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;

	}

	// Methods
	public String getName() {
		return name;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void getPhoneNumber() {

	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}


}
