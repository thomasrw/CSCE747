/*
 *Robert W. Thomas
 *CSCE 747
 *Take Home Test 1
 *05 NOV 2013
 * 
 */

package test1.csce747.rwt;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class TimeTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	
	}
	
	
	@Test
	public void testTimeIntIntIntDayMin() {
	
		
		Time testing = new Time(1,1,1);
		assertEquals("Must set Day Min", 1, testing.getDay() );


	}
	
	@Test
	public void testTimeIntIntIntDayMax() {
	
		
		Time testing = new Time(7,1,1);
		assertEquals("Must set Day Max", 7, testing.getDay() );


	}	
	
	@Test
	public void testTimeIntIntIntDayMid() {
	
		
		Time testing = new Time(3,1,1);
		assertEquals("Must set Day Mid", 3, testing.getDay() );


	}

	@Test
	public void testTimeIntIntIntMin() {
		Time testing = new Time(1,0,0);
		assertEquals("Must set time Min", 000, testing.getTimeOfDay());
	}	
	
	@Test
	public void testTimeIntIntInt1() {
		Time testing = new Time(1,1,1);
		assertEquals("Must set time minutes < 10", 101, testing.getTimeOfDay());
	}
	
	@Test
	public void testTimeIntIntInt2() {
		Time testing = new Time(1,1,10);
		assertEquals("Must set time minutes >= 10", 110, testing.getTimeOfDay());
	}
	
	@Test
	public void testTimeIntIntIntMax() {
		Time testing = new Time(1,23,59);
		assertEquals("Must set time Max", 2359, testing.getTimeOfDay());
	}

	@Test
	public void testGetDayMax() {
	
		
		Time testing = new Time(7,1,1);
		assertEquals("Must return day Max", 7, testing.getDay());
		
		
	}
	
	@Test
	public void testGetDayMin() {
	
		
		Time testing = new Time(1,1,1);
		assertEquals("Must return day Min", 1, testing.getDay());
		
		
	}
	
	@Test
	public void testGetDayMid() {
	
		
		Time testing = new Time(4,1,1);
		assertEquals("Must return day Mid", 4, testing.getDay());
		
		
	}

	@Test
	public void testGetTimeOfDayMax() {
	
		
		Time testing = new Time(5,23,59);
		assertEquals("Must return time Max", 2359, testing.getTimeOfDay());
	}

	@Test
	public void testGetTimeOfDayMin() {
	
		
		Time testing = new Time(5,0,0);
		assertEquals("Must return time Min", 000, testing.getTimeOfDay());
	}
	
	@Test
	public void testGetTimeOfDayMid() {
	
		
		Time testing = new Time(5,22,46);
		assertEquals("Must return time Mid", 2246, testing.getTimeOfDay());
	}
	
	
	@Test
	public void testPrintDay() {
	
		
		
		Time testing = new Time(5,23,24);
		testing.printDay();
		assertEquals("Must print day", "Thursday\n", outContent.toString());
		
	}

	@Test
	public void testPrintTimeOfDay() {
	
		
		Time testing = new Time(5,9,9);
		testing.printTimeOfDay();
		assertEquals("Must print time with hours <10 minutes <10", "0909\n", outContent.toString());
		
		
	}

	@Test
	public void testPrintTimeOfDay1() {
	
		
		Time testing = new Time(5,9,10);
		testing.printTimeOfDay();
		assertEquals("Must print time with hours <10 minutes >=10", "0910\n", outContent.toString());
		
		
	}

	@Test
	public void testPrintTimeOfDay2() {
	
		
		Time testing = new Time(5,11,10);
		testing.printTimeOfDay();
		assertEquals("Must print time with hours >10 minutes >=10", "1110\n", outContent.toString());
		
		
	}

	
}
