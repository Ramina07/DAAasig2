package org.example.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.example.algorithms.MaxHeap;

@State(org.openjdk.jmh.annotations.Scope.Thread)
public class MaxHeapBenchmark {
    private MaxHeap heap;

    @Setup
    public void setup() {
        heap = new MaxHeap(10000); // Инициализация с размером 10000
    }

    @Benchmark
    public void testInsert() {
        for (int i = 0; i < 10000; i++) {
            heap.insert((int) (Math.random() * 10000));
        }
    }

    @Benchmark
    public void testExtractMax() {
        for (int i = 0; i < 10000; i++) {
            heap.insert((int) (Math.random() * 10000));
        }
        for (int i = 0; i < 10000; i++) {
            heap.extractMax();
        }
    }
}

