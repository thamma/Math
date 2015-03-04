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

	public void add(Fraction f) {
		int n = this.num * f.den + this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
	}

	public void sub(Fraction f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
	}

	public String toString() {
		return this.num + "/" + this.den;
	}

	public void cancel() {
		int ggt = gcd(this.num, this.den);
		this.num = this.num/ggt;
		this.den = this.den/ggt;
	}

	private static int gcd(int a, int b) {
		if(a == b){
			return a;
		}else{
			return gcd(b, b-(a%b));
		}
	}
}