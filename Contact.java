package contact;


public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private int validLength;
	
	/**
	 * Constructor Method that will be used to initialize the data with supplied parameters.
	 * 
	 * @param contactID -  The ID of the Contact 
	 * @param firstName - The First Name of the Contact
	 * @param lastName - The Last Name of the Contact
	 * @param phone - The Phone Number of the Contact
	 * @param address - The Address of the Contact
	 */
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		this.contactID = stringValidation(contactID, "ID");
		this.firstName = stringValidation(firstName, "FirstName");
		this.lastName = stringValidation(lastName, "LastName");
		this.phone = stringValidation(phone, "Phone");
		this.address = stringValidation(address, "Address");
	}
	
	/**
	 *  Accessor method that gets the ID of the Contact
	 *  @return - contactID
	 */
	public String getContactID() {
		return contactID;
	}
	
	/**
	 * Mutator method that will set the First Name of the Contact
	 * @param firstName - First Name of the Contact
	 */
	public void setFirstName(String firstName) {
		this.firstName = stringValidation(firstName, "FirstName");
	}
	
	/**
	 * Accessor method that will get the First Name of the Contact
	 * @return - firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Mutator method that will set the Last Name of the Contact
	 * @param lastName - Last name of the contact
	 */
	public void setLastName(String lastName) {
		this.lastName = stringValidation(lastName, "LastName");
	}
	
	/**
	 * Accessor method that will get the Last Name of the Contact
	 * @return - lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Mutator method that will set the Phone Number of the Contact
	 * @param phone - Phone Number of the contact
	 */
	public void setPhone(String phone) {
		this.phone = stringValidation(phone, "Phone");
	}
	
	/**
	 * Accessor method that will get the Phone Number of the Contact
	 * @return - phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Mutator method that will set the Address of the Contact
	 * @param address - Address of the contact
	 */
	public void setAddress(String address) {
		this.address = stringValidation(address, "Address");
	}
	
	/**
	 * Accessor method will get the Address of the Contact
	 * @return - address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Private Helper Method that validates the String parameter (validateString) passed
	 * based on a predetermined length and whether that string is null
	 * If the string passed is an ID, First Name, Last Name, or Phone; the length checked is 10 characters
	 * If the string passed is a Address, the length checked is 30 characters
	 * @param validateString - The string to be validated
	 * @param type - The type of string passed (ID, FirstName, LastName, Phone, Address)
	 * @return - validateString
	 */
	private String stringValidation(String validateString, String type) {
		if(type == "Address") {
			this.validLength = 30;
		} else {
			this.validLength = 10;
		}
		
		if(validateString == null || validateString.length() > validLength || validateString == "") {
			throw new IllegalArgumentException("Invalid " + type);
		} else {
			return validateString;
		}
	}
}

