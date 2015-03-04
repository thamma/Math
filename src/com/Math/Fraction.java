package com.Math;

public class Fraction {

	private int num;
	private int den;

	/**
	 * Create a fraction
	 * 
	 * @param a
	 *            Numerator
	 * @param b
	 *            Denominator
	 */
	Fraction(int arg0, int arg1) {
		this.num = arg0;
		this.den = arg1;
	}

	/**
	 * Create an integer
	 * 
	 * @param a
	 *            Integer
	 */
	Fraction(int arg0) {
		this.num = arg0;
		this.den = 1;
	}

	/**
	 * Addition of two fractions
	 * 
	 * @param f
	 *            Summand of the addition
	 * @return Sum of the fractions
	 */
	public Fraction add(Fraction f) {
		int n = this.num * f.den + this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
		this.reduce();
		return this;
	}

	/**
	 * Subtraction of two fractions
	 * 
	 * @param f
	 *            Subtrahend of the subtraction
	 * @return Difference of the fractions
	 */
	public Fraction sub(Fraction f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		this.num = n;
		this.den = d;
		this.reduce();
		return this;
	}

	/**
	 * Multiplication of two fractions
	 * 
	 * @param f
	 *            Multiplicand of the multiplication
	 * @return Product of the fractions
	 */
	public Fraction mul(Fraction f) {
		this.num = this.num * f.num;
		this.den = this.den * f.den;
		this.reduce();
		return this;
	}

	/**
	 * Division of two fractions
	 * 
	 * @param f
	 *            Divisor of the division
	 * @return Quotient of the fractions
	 */
	public Fraction div(Fraction f) {
		return this.mul(f.inverse());
	}

	/**
	 * Multiplicative inverse of a fraction
	 * 
	 * @return Multiplicative inverse of the fraction
	 */
	public Fraction inverse() {
		int x = this.num;
		this.num = this.den;
		this.den = x;
		return this;
	}

	/**
	 * Exponentiation
	 * 
	 * @param e
	 *            Exponent
	 * @return Fraction to the power of e
	 */
	public Fraction exp(int e) {
		this.num = (int) Math.pow(this.num, e);
		this.den = (int) Math.pow(this.den, e);
		this.reduce();
		return this;
	}

	/**
	 * Converts a fraction to a String
	 * 
	 * @return Fraction as a String
	 */
	public String toString() {
		return this.num + "/" + this.den;
	}

	/**
	 * Reduce a fraction
	 * 
	 * @return Reduced fraction
	 */
	private Fraction reduce() {
		int ggt = gcd(this.num, this.den);
		this.num = this.num / ggt;
		this.den = this.den / ggt;
		return this;
	}

	/**
	 * Greatest common divisor
	 * 
	 * @param a
	 *            first integer
	 * @param b
	 *            second integer
	 * @return Greatest common divisor of the two integers
	 */
	private static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} else {
			return gcd(b, b - (a % b));
		}
	}
}
