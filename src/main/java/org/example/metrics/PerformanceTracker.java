package org.example.metrics;

public class PerformanceTracker {
    public long comparisons = 0;
    public long swaps = 0;
    public long memoryAllocations = 0;

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public void incrementMemoryAllocations() {
        memoryAllocations++;
    }

    public void logPerformance() {
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Memory Allocations: " + memoryAllocations);
    }
}

