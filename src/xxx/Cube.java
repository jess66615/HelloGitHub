package xxx;

public class Cube {
	private double length;
	
	public void setlength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return length*length*length;
	}
	
	public Cube() {	
	}
	
	public Cube(double length) {
		this.length = length;
	}

}
