package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable {

	private double HeightRadius;
	
	
	public double getHeightRadius() {
		return HeightRadius;}
	public void setHeightRadius(double heightRadius) {
		HeightRadius = heightRadius;}
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius) throws Exception {
		super(Radius, MinorRadius);
		if (HeightRadius<=0) {
			throw new IllegalArgumentException();}
		else {
			this.HeightRadius=HeightRadius;}
		}
	public double volume() {
		return (this.getHeightRadius() * 4 / 3 * super.area());
	}
	public int compareTo(Object o) {
		Ellipsoid a = (Ellipsoid)o;
		if (this.area() < a.area()) {
			return -1;}
		else if (this.area() > a.area()) {
			return 1;}
		else {
			return 0;}
		}
	}

