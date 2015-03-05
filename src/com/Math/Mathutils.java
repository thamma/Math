package com.Math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mathutils {

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
		return (a * b) / gcd(a, b);
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
			return n * bino(n - 1, k - 1) / k;
		}
	}

	private static int sqrth(int k, int n) {
		if (k * k > n) {
			return k;
		} else {
			return sqrth((k + 1), n);
		}
	}

	public static int sqrt(int a) {
		return sqrth(1, a) - 1;
	}

	public static boolean isprime(int a) {
		if (a < 2) {
			return false;
		} else if (a == 2) {
			return true;
		} else {
			for (int i = 2; i <= sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void nthprimes(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			if (isprime(i)) {
				out += ", " + i;
			}
		}
		System.out.println(out.replaceFirst(", ", ""));
	}

	public static List<Integer> factor(int a) {
		List<Integer> factors = new ArrayList<Integer>();
		while (a > 1) {
			iter: for (int i = 2; i <= a; i++) {
				if (a % i == 0) {
					factors.add(i);
					a = a / i;
					break iter;
				}
			}
		}
		return factors;
	}
}
