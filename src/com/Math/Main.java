package com.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f = new Fraction(3,5);
		Fraction g = new Fraction(10,4);
		f.add(f);
		System.out.println(f.toString());
		f.mul(g);
		System.out.println(f.toString());
		f.div(g);
		System.out.println(f.toString());
		f.exp(5);
		System.out.println(f.toString());
	}
}
