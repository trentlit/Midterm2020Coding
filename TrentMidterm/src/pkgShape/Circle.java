package pkgShape;

public class Circle extends Shape implements Comparable {

	private double Radius;
	
	public Circle(double Radius)  throws Exception {
		if (Radius<=0) {
			throw new IllegalArgumentException();}
		else {
			this.Radius=Radius;}
		}
	
	protected double getRadius() {
		return Radius;}

	protected void setRadius(double radius) {
		Radius = radius;}

	public double area(){
		return (this.getRadius() * this.getRadius() * Math.PI);}
	
	public int compareTo(Object o) {
		Circle a = (Circle)o;
		if (this.area() < a.area()) {
			return -1;}
		else if (this.area() > a.area()) {
			return 1;}
		else {
			return 0;}
		}
	}
	
	