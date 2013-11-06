/*
 *Robert W. Thomas
 *CSCE 747
 *Take Home Test 1
 *05 NOV 2013
 * 
 */

package test1.csce747.rwt;



	public class Meeting {

		private Time start;
		private Time stop;
	
	
		public Meeting(Time st, Time stp) {
			start = st;
			stop = stp;
		}
		
		

	
		//returns true if the meetings overlap (i.e. they conflict)
		//assumes break period between schedules (i.e. stop and start times cannot be equal)
		//assumes start and stop day are always the same for a given meeting
		public boolean overlap(Meeting mt2) {
			if (this.start.getDay()==mt2.start.getDay() && this.start.getTimeOfDay() < mt2.stop.getTimeOfDay() && mt2.start.getTimeOfDay() < this.stop.getTimeOfDay())
				return true;
			else
				return false;
		}
	
		public static void main(String[] args) {

		Time t = new Time(1,1,1);
		Time u = new Time(1,2,10);
		
		Time v = new Time(2,1,1);
		Time w = new Time(2,2,5);
		
		Time x = new Time(1,1,2);
		Time y = new Time(1,2,5);
				
		
		
		Meeting m = new Meeting(t,u);
		Meeting n = new Meeting(v,w);
		Meeting o = new Meeting(x,y);
		
		System.out.println(m.overlap(n));
		System.out.println(m.overlap(o));
		
		System.out.println(n.overlap(m));
		System.out.println(o.overlap(m));
		

		}	

}
