package com.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f = new Fraction(3,5);
		f.add(f);
		System.out.println(f.toString());
		f.cancel();
		System.out.println(f.toString());
	}

}
