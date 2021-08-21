package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	public List<Contact> contacts = new ArrayList<Contact>(); //An array list to store the contacts
	
	/**
	 * Method that adds a new Contact to the Array list of contacts
	 * If the List is empty, Add the new Contact to the list
	 * If the list is not empty, checks if there is another Contact with the same ID already in the List
	 * @param contactID -  The ID of the Contact 
	 * @param firstName - The First Name of the Contact
	 * @param lastName - The Last Name of the Contact
	 * @param phone - The Phone Number of the Contact
	 * @param address - The Address of the Contact
	 */
	public void addContact(String id, String firstName, String lastName, String phone, String address) {
		int i = 0;
		
		//Checks if the array list is empty
		if(contacts.isEmpty()) {
			//If empty add the contact to the list
			contacts.add(new Contact(id, firstName, lastName, phone, address));
		} else {
			//Iterates through the list to find a possible match in ids
			while(i < contacts.size()) {
				//Used to check for the possible match in ids
				if(contacts.get(i).getContactID().equals(id)) {
					throw new IllegalArgumentException("Invalid ID");
				} else {
					//If there are no matches add the contact
					contacts.add(new Contact(id, firstName, lastName, phone, address));
					break;
				}
			}
		}
	}
	
	/**
	 * Method to delete a contact from the array list
	 * Checks if the Contact is in the Array List Using the ID passed
	 * @param id - The ID of the Contact
	 */
	public void deleteContact(String id) {
		int i = 0;
		//Iterate through the array list
		while(i < contacts.size()) {
			//If there is a match to the id, remove it
			if(contacts.get(i).getContactID().equals(id)) {
				contacts.remove(i);
			}
			i++;
		}
	}
	
	/**
	 * Method to update the first name of a contact given the id number
	 * @param id - The ID of the Contact
	 * @param firstName - The First Name of the Contact
	 */
	public void updateFirstName(String id, String firstName) {
		int i = 0;
		//Iterates through the array list
		while(i < contacts.size()) {
			//If there is a match call the setFirstName method from the Contact class
			if(contacts.get(i).getContactID().equals(id)) {
				contacts.get(i).setFirstName(firstName);
				break;
			}
			i++;
		}
	}
	
	/**
	 * Method to update the last name of a contact given the id number
	 * @param id - The ID of the Contact
	 * @param lastName - The Last Name of the Contact
	 */
	public void updateLastName(String id, String lastName) {
		int i = 0;
		//Iterates through the array list
		while(i < contacts.size()) {
			//If there is a match call the setLastName method from the Contact class
			if(contacts.get(i).getContactID().equals(id)) {
				contacts.get(i).setLastName(lastName);
				break;
			}
			i++;
		}
	}
	
	/**
	 * Method to update the phone number of a contact given the id number
	 * @param id - The ID of the Contact
	 * @param phone - The Phone Number of the Contact
	 */
	public void updatePhone(String id, String phone) {
		int i = 0;
		//Iterate through the array list
		while(i < contacts.size()) {
			//If there is a match call the setPhone method from the Contact class
			if(contacts.get(i).getContactID().equals(id)) {
				contacts.get(i).setPhone(phone);
				break;
			}
			i++;
		}
	}
	
	/**
	 * Method to update the address of a contact given the id number
	 * @param id - The ID of the Contact
	 * @param address - The Address of the Contact
	 */
	public void updateAddress(String id, String address) {
		int i = 0;
		//Iterate through the array list
		while(i < contacts.size()) {
			//If there is a match call the setAddress method from the Contact class
			if(contacts.get(i).getContactID().equals(id)) {
				contacts.get(i).setAddress(address);
				break;
			}
			i++;
		}
	}
	
	/**
	 * Method that is used to return a contact's information stored given their id
	 * @param id - Contact's Identification
	 * @return - Contact's entire information
	 */
	public Contact getContact(String id) {
		int i = 0;
		//If the list is empty return nothing
		if(contacts.isEmpty()) {
			return null;
		} else {
			//Iterate through the list
			while(i < contacts.size()) {
				//If there is a match return the customer at that location in the list
				if(contacts.get(i).getContactID().equals(id)) {
					return contacts.get(i);
				}
				i++;
			}
		}
		return null;
	}
}
