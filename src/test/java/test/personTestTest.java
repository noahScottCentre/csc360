package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class personTestTest {

	private personTest personA;
	private personTest personB;
	
	@BeforeEach
	void setUp() throws Exception {
		personA = new personTest("Jane", "Doe", 36);
		personB = new personTest("John", "Dough", 36);
	}

	@Test
	void testToString() {
		assertNotEquals(personA.toString(), personB.toString());
	}
	
	void testPerson(){
		assertThrows(underAgeException.class, ()->{
			personA.makePerson(personB);
		});
				
		personTest child;
		try {
			child = personA.makePerson(personB);
			assertEquals(personA.getFirstName(), child.getFirstName());
			assertEquals(personB.getLastName(), child.getLastName());  
			assertEquals(1, child.getAge());                           
		} catch (underAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("age error");
		}
	} 

}
