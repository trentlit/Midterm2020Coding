package pkgShape;

public class Ellipse extends Circle implements Comparable{
	
	private double MinorRadius;

	public Ellipse(double Radius, double MinorRadius) throws Exception {
		super(Radius);
		if (MinorRadius<=0) {
			throw new IllegalArgumentException();
			}
		else {
			this.MinorRadius=MinorRadius;
		}
	}
	
	public double getMinorRadius() {
		return MinorRadius;
		}

	public void setMinorRadius(double minorRadius) {
		MinorRadius = minorRadius;
		}

	public double area() {
		return(Math.PI*this.getMinorRadius()*super.getRadius());
		}
	
	public boolean isCircle() {
		if (getMinorRadius()==super.getRadius()) {
			return true;}
		else {
			return false;}
	}
	
	public int compareTo(Object o) {
		Ellipse a = (Ellipse)o;
		if (this.area() < a.area()) {
			return -1;}
		else if (this.area() > a.area()) {
			return 1;}
		else {
			return 0;}
		}
}
