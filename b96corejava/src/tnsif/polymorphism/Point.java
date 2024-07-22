package tnsif.polymorphism;

public class Point {
	private float x,y;
	public Point() {
		x=0.0f;
		y=0.0f;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public Point (float x) {
		this.x=x;
	}
	public Point(float x, float y) {
		this.x=x;
		this.y=y;
	}

}
