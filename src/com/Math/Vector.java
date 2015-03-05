package com.Math;

public class Vector {
	private Double x;
	private Double y;
	private Double z;

	Vector(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector multiply(Double a) {
		return new Vector(this.x * a, this.y * a, this.z * a);
	}

	public Double length() {
		return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
	}

	public Vector normalize() {
		return this.multiply(1 / this.length());
	}

	public Vector cross(Vector v) {
		return new Vector((this.y * v.z) - (this.z * v.y), (this.z * v.x)
				- (this.x * v.z), (this.x * v.y) - (this.y * v.x));
	}

	public Double scalar(Vector v) {
		return this.x * v.x + this.y * v.y + this.z * v.z;
	}

	public boolean orthogonal(Vector v) {
		if (this.scalar(v) == 0.0) {
			return true;
		}
		return false;
	}

	public static Double triple(Vector a, Vector b, Vector c) {
		return (a.cross(b)).scalar(c);
	}

	public Double triple(Vector b, Vector c) {
		return triple(this, b, c);
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
}
