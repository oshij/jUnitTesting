package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		String result = jUnit.addString("Oshij"," Trivedi");
		assertEquals("Oshij Trivedi",result);
	}

}
