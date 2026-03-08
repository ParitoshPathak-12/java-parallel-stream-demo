# java-parallel-stream-demo

I wanted to try and see the difference when using ***normal*** stream 
and ***parallel*** stream in java.

Parallel Stream uses multiple threads and the execution is really fast
when processing large dataset.

The number of threads is usually (number_of_cpu_cores - 1).

But, if the dataset is smaller, then the sequential operation
(Single threaded) is faster because managing threads brings useless
overhead.

In this experiment, I tried to calculate the count of prime numbers 
till N. I varied N and calculated the time using both single threaded
and parallel stream processing. When N is really large, the parallel
stream shines and get we almost 3-4 times better performance.

```
Seq Operation: N = 100000 timeTaken = 8 ms
Seq Operation: N = 1000000 timeTaken = 60 ms
Seq Operation: N = 100000000 timeTaken = 31366 ms
```

```
Parallel Operation: N = 100000 timeTaken = 19 ms
Parallel Operation: N = 1000000 timeTaken = 51 ms
Parallel Operation: N = 100000000 timeTaken = 8175 ms
```

I got these results on my machine (8-core CPU) and it will vary on different
machines.