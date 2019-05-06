package com.simianquant.sample;

import simianquant.ext.*;

public final class Sample {
	private Sample(){
	}

	public static void main(String[] args) {
		final double x = 1.2;
		final double y = 2.1;
		final GeneratedResult res = GeneratedImpl.getInstance().apply(x, y);

		System.out.printf("x: %g, y: %g\n", x, y);
		System.out.printf("a: %g, b: %g, c: %g\n", res.getA(), res.getB(), res.getC());

		System.out.println("ho gaya");
	}
}