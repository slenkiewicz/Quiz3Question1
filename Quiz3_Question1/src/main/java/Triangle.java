import java.lang.Math;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	/**
	 * No-arg constructor for triangle
	 */
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * Argument constructor for triangle
	 */
	public Triangle(double a, double b, double c) {
		super();
		side1 = a;
		side2 = b;
		side3 = c;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	
	/* Computes the area of a triangle
	 * using 3 side lengths
	 */
	public double getArea() {
		double halfPerim = (side1 + side2 + side3) / 2;
		return Math.sqrt(halfPerim * (halfPerim - side1) * (halfPerim - side2) * (halfPerim - side3));
	}

	
	/* Compute perimeter using
	 * 3 side lengths
	 */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}


	/* Returns a string describing the triangles side lengths
	 * 
	 */
	public String toString() {
		return ("This triangle has side lengths" + side1 + "," + side2 + "," + side3);
	}
}
