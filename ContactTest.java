package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		assertTrue(contact.getContactID().equals("12345678"));
		assertTrue(contact.getFirstName().equals("Patrick"));
		assertTrue(contact.getLastName().equals("Knight"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("42 Wallaby Way"));
	}
	
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567891", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactFirstToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick0123", "Knight", "1234567890", "42 Wallaby Way");
		});
	}

	@Test
	void testContactLastToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", "Knight01234", "1234567890", "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", "Knight", "12345678901", "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way, Sydney Australia");
		});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactFirstNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", null, "Knight", "1234567890", "42 Wallaby Way");
		});
	}

	@Test
	void testContactLastNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", null, "1234567890", "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", "Knight", null, "42 Wallaby Way");
		});
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678", "Patrick", "Knight", "1234567890", null);
		});
	}
	
	@Test
	void testSetFirstNameToLong() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("Patrick0123");
		});
	}
	
	@Test
	void testSetFirstNameNull() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testSetLastNameToLong() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("Knight01234");
		});
	}
	
	@Test
	void testSetLastNameNull() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testSetPhoneToLong() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("12345678901");
		});
	}
	
	@Test
	void testSetPhoneNull() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testSetAddressToLong() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("42 Wallaby Way, Sydney Australia");
		});
	}
	
	@Test
	void testSetAddressNull() {
		Contact contact = new Contact("12345678", "Patrick", "Knight", "1234567890", "42 Wallaby Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
}
