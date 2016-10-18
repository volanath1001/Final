package p;

public class B {
	
	int gear;
	int cadence;
	int speed;
	
	public void printDescription(){
	    System.out.println("\nBike is " + "in gear " + this.gear
	        + " with a cadence of " + this.cadence +
	        " and travelling at a speed of " + this.speed + ". ");
	}

}
