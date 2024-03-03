import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateUserTest {

	@Test
	void TestGetFName() {
		String tFname = "Molly";
		String lName = "John";
		String pass = "password";
		UserProfile	testUser = new UserProfile(tFname, lName, pass);
		String expected = tFname;
		String actual = testUser.getFName();
		if(expected == actual) {
			assertTrue(true);
		}
		else {
			fail();
		}
	}
	
	@Test
	void TestGetLName() {
		String tFname = "Molly";
		String lName = "John";
		String pass = "password";
		UserProfile	testUser = new UserProfile(tFname, lName, pass);
		String expected = lName;
		String actual = testUser.getLName();
		if(expected == actual) {
			assertTrue(true);
		}
		else {
			fail();
		}
	}
	
	@Test
	void TestGetPassword() {
		String tFname = "Molly";
		String lName = "John";
		String pass = "password";
		UserProfile	testUser = new UserProfile(tFname, lName, pass);
		String expected = pass;
		String actual = testUser.getPassword();
		if(expected == actual) {
			assertTrue(true);
		}
		else {
			fail();
		}
	}
}
