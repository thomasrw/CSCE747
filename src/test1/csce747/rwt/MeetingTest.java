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

public class MeetingTest {




	@Test
	public void testOverlapTrue() {
		Time time1 = new Time(1,0,0);
		Time time2 = new Time(1,23,59);
		Time time3 = new Time(1,1,1);
		Time time4 = new Time (1,2,2);
		
		Meeting testing = new Meeting(time1, time2);
		Meeting testing2 = new Meeting(time3, time4);
		
		assertEquals("Meeting overlap should equal True", true, testing.overlap(testing2));
		
	}
	

	@Test
	public void testOverlapFalseDifferentTimes() {
		Time time1 = new Time(1,0,0);
		Time time2 = new Time(1,23,59);
		Time time3 = new Time(1,1,1);
		Time time4 = new Time (1,2,2);
		
		Meeting testing = new Meeting(time1, time3);
		Meeting testing2 = new Meeting(time4, time2);
		
		assertEquals("Meeting overlap should equal False", false, testing.overlap(testing2));		
	}
	
	@Test
	public void testOverlapFalseDifferentDays() {
		Time time1 = new Time(1,0,0);
		Time time2 = new Time(1,23,59);
		Time time3 = new Time(2,1,1);
		Time time4 = new Time (2,2,2);
		
		Meeting testing = new Meeting(time1, time2);
		Meeting testing2 = new Meeting(time3, time4);
		
		assertEquals("Meeting overlap should equal False", false, testing.overlap(testing2));		
	}

}
