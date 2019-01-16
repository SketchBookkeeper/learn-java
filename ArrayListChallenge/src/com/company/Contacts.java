package com.company;

import java.util.ArrayList;

public class Contacts {
	private ArrayList<Contact> contactList = new ArrayList<Contact>();

	public void addContact(String name, String number) {
		if (findContactPosition(name) != -1) {
			System.out.println(name + " has already been added.");
			return;
		}

		contactList.add(new Contact(name, number));
	}

	public void updateContact(String name ,String newName, String newNumber) {
		int contactPosition = findContactPosition(name);

		if (contactPosition == -1) {
			System.out.println(name + " is not a contact in your list.");
			return;
		}

		Contact contact = contactList.get(contactPosition);
		contact.setName(newName);
		contact.setNumber(newNumber);
	}

	public void removeContact(String name) {
		int contactPosition = findContactPosition(name);

		if (contactPosition == -1) {
			System.out.println("That contact is not in your list.");
			return;
		}

		contactList.remove(contactPosition);
	}

	public void searchContacts(String name) {
		int contactPosition = findContactPosition(name);

		if (contactPosition == -1) {
			System.out.println("Nothing found");
			return;
		}

		Contact contact = contactList.get(contactPosition);

		System.out.println(contact.getName() + " : " + contact.getNumber());
	}

	private int findContactPosition(String searchItem) {
		int position = -1;

		for(int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getName().equals(searchItem)) {
				position = i;
				break;
			}
		}

		return position;
	}

	public void printContacts() {
		if(contactList.size() < 1) {
			System.out.println("List is empty");
		}

		for(int i = 0; i < contactList.size(); i++) {
			Contact contact = contactList.get(i);
			System.out.println(contact.getName() + " : " + contact.getNumber());
		}
	}
}
