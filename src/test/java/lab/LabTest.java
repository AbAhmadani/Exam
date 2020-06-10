package lab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LabTest extends Lab{
	
	@Test
    public void testFahrenheitToCentigrade() {
        assertEquals(35, fahrenheitToCentigrade(95));
    }
	
	@Test
	public void testCentigradeToFahrenheit() {
		assertEquals(104, centigradeToFahrenheit(40));
	}
	
	@Test
	public void testRemoveSignOfExclaimation(){
		assertEquals("Hello World", removeSignOfExclaimation("Hello World!"));
	}
	
	@Test
	public void testGetCurrentDay(){
	    assertEquals(10, getCurrentDay());
	}
	
	@Test
	public void testGetCurrentMonth(){
		assertEquals(6, getCurrentMonth());
	}
	
	@Test
	public void TestGetCurrentYear(){
		assertEquals(2020, getCurrentYear());
	}
}
