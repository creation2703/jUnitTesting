package jUnitTestPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
    public void TestAddStrings() {
		javaFunctions test = new javaFunctions();
        String result = test.AddStrings("ayush", " rai");
        assertEquals("ayush rai", result);
    }

}
