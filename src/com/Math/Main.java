package com.Math;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Fraction f = new Fraction(3, 5);
		Fraction g = new Fraction(10, 4);
		f.add(f);
		System.out.println(f.toString());
		f.mul(g);
		System.out.println(f.toString());
		f.div(g);
		System.out.println(f.toString());
		f.exp(5);
		System.out.println(f.toString());

		System.out.println(Mathutils.div(35, 7));
		System.out.println(Mathutils.mod(37, 7));
		System.out.println(Mathutils.exp(5, 3));
		System.out.println(Mathutils.lcm(5, 11));
		System.out.println(Mathutils.abs(-10));
		try {
			System.out.println(Mathutils.bino(-5, 2));
		} catch (IOException e) {
			System.out.println("Negative argument");
		}
		System.out.println(Mathutils.sqrt(16));
		;
	}
}
