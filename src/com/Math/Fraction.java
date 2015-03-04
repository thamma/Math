package com.Math;

public class Fraction {

	private int num;
	private int den;

	
	Fraction(int arg0, int arg1) {
		this.num = arg0;
		this.den = arg1;
	}

	Fraction(int arg0) {
		this.num = arg0;
		this.den = 1;
	}

	/**
	 * Addition of two Fractions
	 * @param addend Addend of the addition
	 * @return Sum of fractions
	 * */
	public Fraction add(Fraction addend) {
		int n = this.num * addend.den + this.den * addend.num;
		int d = this.den * addend.den;
		this.num = n;
		this.den = d;
		this.cancel();
		return this;
	}

	public Fraction sub(Fraction f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
		this.cancel();
		return this;
	}
	
	public Fraction mul(Fraction f) {
		this.num = this.num * f.num;
		this.den = this.den * f.den;
		this.cancel();
		return this;
	}
	
	public Fraction div(Fraction f) {
		return this.mul(f.inverse());
	}
	
	public Fraction inverse() {
		int x = this.num;
		this.num = this.den;
		this.den = x;
		return this;
	}

	public String toString() {
		return this.num + "/" + this.den;
	}

	private Fraction cancel() {
		int ggt = gcd(this.num, this.den);
		this.num = this.num/ggt;
		this.den = this.den/ggt;
		return this;
	}

	private static int gcd(int a, int b) {
		if(a == b){
			return a;
		}else{
			return gcd(b, b-(a%b));
		}
	}
}
