import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeValidationTest {
// it specifies that this methode is a test case
	@Test
	void test() {
		AgeValidation av = new AgeValidation();
		            //excepted,           actual
		assertEquals("valid age to vote",av.ageValidator(19));
	}
	@Test
	void test1() {
		AgeValidation av = new AgeValidation();
		            //excepted,           actual
		assertEquals("invalid age to vote",av.ageValidator(14));
	}
}
