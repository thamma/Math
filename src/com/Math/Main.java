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
		Mathutils.nthprimes(200);
		System.out.println(Mathutils.factor(720));

	}
}
