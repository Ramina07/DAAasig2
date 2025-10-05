Heap Data Structures Project 

Project Overview 

This project implements heap data structures in Java, including both Min-Heap and Max-Heap implementations. Heaps are specialized binary tree-based data structures that allow efficient access, insertion, and deletion of extreme elements (minimum for Min-Heap, maximum for Max-Heap) while maintaining the heap property. 

The purpose of this project is to provide fully functional heap implementations with: 

Clear algorithmic correctness. 

Empirical performance tracking. 

Unit tests covering edge cases. 

A command-line interface (CLI) for benchmarking different input sizes and distributions. 

Both heap implementations serve as educational examples for Assignment 2: Algorithmic Analysis and Peer Code Review. 

 

Repository Structure 

The repository is organized to separate algorithms, metrics, CLI utilities, and tests for clarity and maintainability: 

assignment2-heap/ 
├── src/main/java/ 
│   ├── algorithms/ 
│   │   ├── MaxHeap.java       # Max-Heap implementation 
│   │   └── MinHeap.java       # Min-Heap implementation 
│   ├── metrics/ 
│   │   ├── PerformanceTracker.java  # Tracks operations: comparisons, swaps, array accesses 
│   │   └── CSVExporter.java         # Exports performance metrics to CSV 
│   └── cli/ 
│       └── BenchmarkRunner.java     # Command-line tool for benchmarking heap operations 
├── src/test/java/ 
│   └── algorithms/ 
│       ├── MaxHeapTest.java         # Unit tests for Max-Heap 
│       └── MinHeapTest.java         # Unit tests for Min-Heap 
├── docs/ 
│   ├── analysis-report.pdf          # Peer review and empirical analysis 
│   └── performance-plots/           # Graphs of execution time vs input size 
├── README.md                        # Project documentation 
└── pom.xml                          # Maven project file with dependencies 
 

algorithms/: Contains the main heap implementations. Each class provides methods for insertion, extraction, peek, and dynamic resizing of the heap array. 

metrics/: Contains classes to track performance metrics like comparisons, swaps, array accesses, and memory allocations, as well as export this data to CSV for analysis. 

cli/: Contains a CLI tool to run benchmarks on heaps with configurable input sizes and distributions. 

test/: Contains unit tests for both heap implementations, covering edge cases such as empty arrays, single elements, duplicates, and sorted/reverse-sorted inputs. 

docs/: Stores reports and performance plots generated from benchmarking. 

 

Implemented Features 

Heap Operations 

Min-Heap and Max-Heap share the following operations, with the difference being the value maintained at the root: 

Insert: Adds a new element while maintaining the heap property. The element is placed at the end of the heap and sifted up as necessary. 

Extract Max/Min: Removes and returns the root element (maximum for Max-Heap, minimum for Min-Heap), then sifts down the last element to restore the heap property. 

Peek Max/Min: Returns the root element without removing it. Accessing the root is constant time (O(1)). 

Resize: When the underlying array reaches capacity, it is resized to accommodate more elements. This ensures dynamic memory management for large datasets. 

 

Performance Metrics 

The project includes tracking and exporting of metrics for all heap operations: 

Tracked Metrics: 

Number of comparisons 

Number of swaps 

Array accesses 

Memory allocations 

CSV Export: Metrics are exported to CSV files for further analysis and visualization of execution time vs input size. 

Metrics are automatically updated during benchmarking runs via the CLI tool. 

 

CLI Benchmarking 

The CLI tool provides a convenient interface to benchmark the heaps: 

Supports configurable input sizes, such as 100, 1,000, 10,000, 100,000 elements. 

Supports different input distributions: 

Random 

Sorted 

Reverse-sorted 

Nearly-sorted 

Outputs performance metrics to CSV files and optionally prints a summary table to the console. 

This allows testing both time complexity and practical performance across multiple scenarios. 

 

Complexity Analysis 

Operation 

Min-Heap 

Max-Heap 

Time Complexity 

Space Complexity 

Insert 

Yes 

Yes 

O(log n) 

O(n) 

Extract Max/Min 

Yes 

Yes 

O(log n) 

O(n) 

Peek 

Yes 

Yes 

O(1) 

O(n) 

Resize 

Yes 

Yes 

O(n) 

O(n) 

Explanation: 

Both heaps maintain a logarithmic height, making insertion and extraction O(log n). 

Array resizing takes linear time, O(n), but occurs only occasionally. 

The heaps use linear space, O(n), to store all elements. 

 

Testing 

The project implements comprehensive testing: 

Unit Tests: Validate correctness for edge cases such as: 

Empty heap 

Single-element heap 

Duplicate values 

Sorted/reverse-sorted inputs 

Property-Based Testing: Ensures correctness for randomly generated inputs. 

Benchmark Reproduction: Confirms that metrics and performance measurements match expected theoretical behavior. 

Cross-Validation: Results can be compared to Java’s built-in PriorityQueue to verify correctness and efficiency. 

 

Usage 

Compile the Project 

Using Maven: 

mvn clean compile 
 

Run CLI Benchmark 

java -cp target/classes cli.BenchmarkRunner 
 

Set input size and distribution in the CLI prompt. 

Results will generate performance metrics CSV files in /docs/performance-plots/. 

Run Unit Tests 

mvn test 
 

Executes all MinHeapTest and MaxHeapTest cases. 

Validates edge cases, duplicates, and performance across multiple input distributions. 

 

GitHub Workflow 

Branching Strategy: 

main: Stable release version 

feature/algorithm: Heap implementations 

feature/testing: Unit tests 

feature/metrics: Performance tracking and CSV export 

feature/cli: CLI interface for benchmarking 

feature/optimization: Optional performance improvements 

Commit Messages should be descriptive, e.g.: 

init: Maven project structure, JUnit setup 

feat(algorithm): Implement MinHeap 

test(algorithm): Add comprehensive unit tests 

feat(metrics): Add performance counters and CSV export 

perf(benchmark): Benchmark MaxHeap and MinHeap for large datasets 

 

Summary 

This project provides a complete implementation of heap data structures in Java, including: 

Fully functional Min-Heap and Max-Heap classes. 

Unit testing and edge case validation. 

Performance metrics collection and CSV export. 

CLI tool for benchmarking with configurable input sizes and distributions. 

Detailed empirical results and plots for analysis. 

The project serves as a reference implementation for educational purposes, demonstrating both theoretical complexity and practical performance of heaps. 
