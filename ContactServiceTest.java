package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.ContactService;

class ContactServiceTest {
	ContactService service = new ContactService();
	
	@Test
	void testAddContact() {
		service.addContact("012345678", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		assertTrue(service.getContact("012345678").getContactID().equals("012345678"));
		assertTrue(service.getContact("012345678").getFirstName().equals("Patrick"));
		assertTrue(service.getContact("012345678").getLastName().equals("Knight"));
		assertTrue(service.getContact("012345678").getPhone().equals("123456789"));
		assertTrue(service.getContact("012345678").getAddress().equals("42 Wallaby Way"));
	}
	
	@Test
	void testDeleteContact() {
		service.addContact("012345678", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.deleteContact("012345678");
		assertTrue(service.getContact("012345678") == null);
	}
	
	@Test
	void testDeleteMultipleContact() {
		service.addContact("0123456", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.addContact("01234567", "Jerry", "King", "987654321", "125 King RD");
		service.addContact("012345678", "Mary", "Rodger", "123456789", "32 Rodger Way");
		service.deleteContact("01234567");
		assertTrue(service.getContact("01234567") == null);
	}
	
	@Test 
	void testUpdateFirst() {
		service.addContact("0123456", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.addContact("01234567", "Jerry", "King", "987654321", "125 King RD");
		service.addContact("012345678", "Mary", "Rodger", "123456789", "32 Rodger Way");
		service.updateFirstName("012345678", "Richard");
		assertTrue(service.getContact("012345678").getFirstName().equals("Richard"));
	}

	@Test 
	void testUpdateLast() {
		service.addContact("0123456", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.addContact("01234567", "Jerry", "King", "987654321", "125 King RD");
		service.addContact("012345678", "Mary", "Rodger", "123456789", "32 Rodger Way");
		service.updateLastName("0123456", "Richard");
		assertTrue(service.getContact("0123456").getLastName().equals("Richard"));
	}
	
	@Test 
	void testUpdatePhone() {
		service.addContact("0123456", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.addContact("01234567", "Jerry", "King", "987654321", "125 King RD");
		service.addContact("012345678", "Mary", "Rodger", "123456789", "32 Rodger Way");;
		service.updatePhone("012345678", "Richard");
		assertTrue(service.getContact("012345678").getPhone().equals("Richard"));
	}
	
	@Test 
	void testUpdateAddress() {
		service.addContact("0123456", "Patrick", "Knight", "123456789", "42 Wallaby Way");
		service.addContact("01234567", "Jerry", "King", "987654321", "125 King RD");
		service.addContact("012345678", "Mary", "Rodger", "123456789", "32 Rodger Way");
		service.updateAddress("01234567", "Richard");
		assertTrue(service.getContact("01234567").getAddress().equals("Richard"));
	}



}
