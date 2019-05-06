package com.simianquant.test.sample;

import org.testng.annotations.*;
import org.testng.Assert;
import simianquant.ext.*;

public class GeneratedTest {

	private static final double _eps = 1e-15;

    @Test public void evaluatesProperly() {
        final double x = 1.2;
        final double y = 2.1;

        final double expected_a = Math.pow(x + y, 2) / x;
        final double expected_b = Math.sin(expected_a);
        final double expected_c = Math.sin(expected_a) / expected_a;

        final GeneratedResult actual = GeneratedImpl.getInstance().apply(x, y);

        Assert.assertTrue(Math.abs(actual.getA() - expected_a) < _eps);
        Assert.assertTrue(Math.abs(actual.getB() - expected_b) < _eps);
        Assert.assertTrue(Math.abs(actual.getC() - expected_c) < _eps);
    }
}
