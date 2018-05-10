package LSP_AddressBook.test; 
import LSP_AddressBook.Person;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonClassTest {

	@Test public void variableEncapuslationTest() {
		Person p = new Person ("Anita",
				"Calmday", 
				"123 Riverdale Av", 
				"Nowhereville", 
				"New Jersey", 
				"12356", 
				"1234567890"); 

        p.setFirstName("Jenna");
        assertEquals(p.getFirstName(), "Jenna");

        p.setLastName("Jones");
        assertEquals(p.getLastName(), "Jones");

        p.setAddress("123 Rolan Blvd");
        assertEquals(p.getAddress(), "123 Rolan Blvd");

        p.setCity("Hollywood");
        assertEquals(p.getCity(), "Hollywood");

        p.setState("California");
        assertEquals(p.getState(), "California");

        p.setzip("12345");
        assertEquals(p.getzip(), "12345");

        p.setphone_num("0987654321");
        assertEquals(p.getphone_num(), "0987654321");

    
	}
	

}
