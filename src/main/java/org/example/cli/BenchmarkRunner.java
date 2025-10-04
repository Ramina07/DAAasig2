package org.example.cli;

import org.example.algorithms.MaxHeap;
import org.example.metrics.PerformanceTracker;
import org.example.metrics.CSVExporter;

public class BenchmarkRunner {
    public static void main(String[] args) {
        PerformanceTracker tracker = new PerformanceTracker();
        MaxHeap heap = new MaxHeap(10000);
        for (int i = 0; i < 10000; i++) {
            heap.insert((int) (Math.random() * 10000));
            tracker.incrementComparisons();  // Пример, нужно больше операций
        }
        tracker.logPerformance();
        CSVExporter.exportToCSV("performance_data.csv", tracker.comparisons, tracker.swaps, tracker.memoryAllocations);
    }
}
