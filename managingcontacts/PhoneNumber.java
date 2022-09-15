package com.assignment1.managingcontacts;

public class PhoneNumber {
	private String label;
	private String phoneNumber;
	
	public PhoneNumber(String label, String phoneNumber) {
		this.label = label;
		this.phoneNumber = phoneNumber;
	}
	
	public String getLabel() {
		return label;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
