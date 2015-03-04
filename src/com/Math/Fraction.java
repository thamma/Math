package com.Math;

public class Fraction {

	private int num;
	private int den;

	// Konstruktor Bruch
	Fraction(int arg0, int arg1) {
		this.num = arg0;
		this.den = arg1;
	}

	// Konstruktor ganze Zahl
	Fraction(int arg0) {
		this.num = arg0;
		this.den = 1;
	}

	// Addition
	public Fraction add(Fraction f) {
		int n = this.num * f.den + this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
		this.cancel();
		return this;
	}

	// Subtraktion
	public Fraction sub(Fraction f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
		this.cancel();
		return this;
	}

	// Multiplikation
	public Fraction mul(Fraction f) {
		this.num = this.num * f.num;
		this.den = this.den * f.den;
		this.cancel();
		return this;
	}

	// Division
	public Fraction div(Fraction f) {
		return this.mul(f.inverse());
	}

	// Kehrbruch
	public Fraction inverse() {
		int x = this.num;
		this.num = this.den;
		this.den = x;
		return this;
	}

	// Konvertierung zu String
	public String toString() {
		return this.num + "/" + this.den;
	}

	// Bruch kürzen
	private Fraction cancel() {
		int ggt = gcd(this.num, this.den);
		this.num = this.num / ggt;
		this.den = this.den / ggt;
		return this;
	}

	// Größter gemeinsamer Teiler
	private static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} else {
			return gcd(b, b - (a % b));
		}
	}
}
