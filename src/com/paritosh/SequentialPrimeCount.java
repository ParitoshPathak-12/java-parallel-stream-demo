package com.paritosh;

import java.util.stream.Stream;

public class SequentialPrimeCount {
    static void main() {
        int N = 100000000;
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(N);

        long start = System.currentTimeMillis();

        long count = numbers.filter(PrimeChecker::isPrime).count();

        long end = System.currentTimeMillis();

        System.out.println("Seq Operation: N = " + N + " timeTaken = " + (end - start) + " ms");
    }
}

/*
Seq Operation: N = 100000 timeTaken = 8 ms
Seq Operation: N = 1000000 timeTaken = 60 ms
Seq Operation: N = 100000000 timeTaken = 31366 ms

*/
