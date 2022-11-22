package jUnitTestPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	 @Test
	    public void TestAddNumbers() {
	        javaFunctions test = new javaFunctions();
	        int result = test.AddNumbers(50, 200);
	        assertEquals(250, result);
	    }

}
