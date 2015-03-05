package com.Math;

import java.io.IOException;

public class Mathutils {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return add(a, -b);
	}

	public static int mul(int a, int b) {
		int count = 0;
		for (int i = 0; i < b; i++) {
			count += a;
		}
		return count;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static int mod(int a, int b) {
		return a - mul(div(a, b), b);
	}

	public static int exp(int a, int b) {
		int count = a;
		for (int i = 1; i < b; i++) {
			count *= a;
		}
		return count;
	}

	public static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} else {
			return gcd(b, b - (a % b));
		}
	}

	public static int lcm(int a, int b) {
		return div(mul(a, b), gcd(a, b));
	}

	public static int abs(int a) {
		if (a < 0) {
			return -a;
		} else {
			return a;
		}
	}

	public static int bino(int n, int k) throws IOException {
		if (n < 0 || k < 0) {
			throw new IOException();
		} else if (k == 0) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return div(mul(n, bino(n - 1, k - 1)), k);
		}
	}

	private static int sqrth(int k, int n) {
		if (mul(k, k) > n) {
			return k;
		} else {
			return sqrth((k + 1), n);
		}
	}

	public static int sqrt(int a) {
		return sqrth(1, a) - 1;
	}
}
