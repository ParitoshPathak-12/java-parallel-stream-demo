package com.paritosh;

import java.util.stream.Stream;

public class ParallelPrimeCount {
    static void main() {
        int N = 100000000;
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(N).parallel();

        long start = System.currentTimeMillis();

        long count = numbers.filter(PrimeChecker::isPrime).count();

        long end = System.currentTimeMillis();

        System.out.println("Parallel Operation: N = " + N + " timeTaken = " + (end - start) + " ms");
    }
}

/*
Parallel Operation: N = 100000 timeTaken = 19 ms
Parallel Operation: N = 1000000 timeTaken = 51 ms
Parallel Operation: N = 100000000 timeTaken = 8175 ms

*/