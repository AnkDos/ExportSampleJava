package com.simianquant.bench.sample;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import simianquant.ext.*;

public class SampleBench {

    @Benchmark @BenchmarkMode(Mode.SampleTime) @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void oneDimensionalEvaluation(Blackhole bh) {
    	double x = 1.4;
    	double yMin = 1.0;
    	double yMax = 2.0;
    	int cnt = 1000;
    	double incr = (yMax - yMin) / cnt;

    	double y = yMin;
    	while (y < yMax) {
    		GeneratedResult eval = GeneratedImpl.getInstance().apply(x, y);
    		bh.consume(eval);
    		y += incr;
    	}
    }

}