/*
 *Robert W. Thomas
 *CSCE 747
 *Take Home Test 1
 *05 NOV 2013
 * 
 */

package test1.csce747.rwt;

import java.util.Calendar;


public class Time {
	
	/* utilize java.util.Calendar for convenience since DAY/HOUR/MINUTE are predefined
	 * Calendar defines itself based on miliseconds since Epoch, consistent with guidance
	 * for the take home
	 */
	private Calendar c; 
	

	
	public Time(int day, int hour, int minute) {
		c = Calendar.getInstance();
		c.clear();
		c.set(Calendar.DAY_OF_WEEK, day);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
	}
	
	
	// return int value for day of week
	// Assumes US timezone (i.e. Sunday is day 1 in the week, European zones may differ)
	
	public int getDay() {
		return c.get(Calendar.DAY_OF_WEEK);
	}
	
	
	// not efficient but no one said I had to be...
	public int getTimeOfDay() {
		
		int m = c.get(Calendar.MINUTE);
		int ret = -1;
		String val = null;
		
		val = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		if (m < 10)
		{
			val = val + "0" + Integer.toString(m);
		}
		else
			val = val + m;
		
		ret = Integer.parseInt(val);
		
		return ret;
			
			
		
	}
	
	
	// print the day of the week as a String
	//Assumes US timezone (i.e. Sunday is day 1 in the week, European zones may differ)
	public void printDay() {
		String val = null;
		int d = c.get(Calendar.DAY_OF_WEEK);
		if (d==1)
			val = "Sunday";
		else if (d==2)
			val = "Monday";
		else if (d==3)
			val = "Tuesday";
		else if (d==4)
			val = "Wednesday";
		else if (d==5)
			val = "Thursday";
		else if (d==6)
			val = "Friday";
		else if (d==7)
			val = "Saturday";
		else //error condition
			val = "you discovered a new day in the week";
		
		
		System.out.println(val);
	}
	
	// print time of day as a String down to the minute in military time (e.g. 1:05pm == 1305)
	public void printTimeOfDay() {
		String val = null;
		val = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		if (c.get(Calendar.HOUR_OF_DAY) < 10)
			val = "0"+val;
		if (c.get(Calendar.MINUTE) < 10)
			val = val + "0";
		val = val + Integer.toString(c.get(Calendar.MINUTE));
		
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		
		
		Time t = new Time(1,1,5);
		
		System.out.println(t.getDay());
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.MONDAY);
		
		System.out.println(Calendar.TUESDAY);
		System.out.println(t.getTimeOfDay());
		
		
		

	}

}
