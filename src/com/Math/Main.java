package com.Math;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			System.out.println(Mathutils.bino(-5, 2));
		} catch (IOException e) {
			System.out.println("Negative argument");
		}
		System.out.println(Mathutils.sqrt(16));
		System.out.println(Mathutils.isprime(123));
		System.out.println(Mathutils.factor(720));

		Vector v = new Vector(1.0, 2.0, 3.0);
		Vector w = new Vector(2.0, 1.0, 6.0);
		System.out.println(v.multiply(5.0).toString());
		System.out.println(v.cross(w).toString());
		System.out.println((new Vector(1.0, 1.0, 2.0).length()));
		v.normalize();
		System.out.println(v.length());
		Vector a = new Vector(1.0, 0.0, 0.0);
		Vector b = new Vector(0.0, 1.0, 0.0);
		Vector c = new Vector(0.0, 0.0, 1.0);
		System.out.println(a.orthogonal(b));
		System.out.println(Vector.triple(a, b, c));
		System.out.println(a.triple(b, c));
		 a = new Vector(47.0,1.0,1.0);
		 b = new Vector(10.0, 1.0, 0.0);
		System.out.println(a.cross(b).normalize().multiply(5.0).orthogonal(a));
	}
}
