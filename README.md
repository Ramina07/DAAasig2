Heap Data Structures Project
Project Overview
This project implements heap data structures in Java, including both Min-Heap and Max-Heap implementations. Heaps are specialized binary tree-based data structures that allow efficient access, insertion, and deletion of extreme elements (minimum for Min-Heap, maximum for Max-Heap) while maintaining the heap property.

The purpose of this project is to provide fully functional heap implementations with:

Clear algorithmic correctness
Empirical performance tracking
Unit tests covering edge cases
A command-line interface (CLI) for benchmarking different input sizes and distributions
Both heap implementations serve as educational examples for Assignment 2: Algorithmic Analysis and Peer Code Review.

Repository Structure
assignment2-heap/
├── src/main/java/
│   ├── algorithms/
│   │   ├── MaxHeap.java       # Max-Heap implementation
│   │   └── MinHeap.java       # Min-Heap implementation
│   ├── metrics/
│   │   ├── PerformanceTracker.java  # Tracks operations: comparisons, swaps, array accesses
│   │   └── CSVExporter.java         # Exports performance metrics to CSV
│   └── cli/
│       └── BenchmarkRunner.java     # CLI tool for benchmarking heap operations
├── src/test/java/
│   └── algorithms/
│       ├── MaxHeapTest.java         # Unit tests for Max-Heap
│       └── MinHeapTest.java         # Unit tests for Min-Heap
├── docs/
│   ├── analysis-report.pdf          # Peer review and empirical analysis
│   └── performance-plots/           # Graphs of execution time vs input size
├── README.md                        # Project documentation
└── pom.xml                          # Maven project file with dependencies
Folders Description:

algorithms/: Contains the main heap implementations with insertion, extraction, peek, and dynamic resizing methods.
metrics/: Contains classes to track performance metrics (comparisons, swaps, array accesses, memory allocations) and export them to CSV.
cli/: CLI tool for benchmarking heaps with configurable input sizes and distributions.
test/: Unit tests covering edge cases, including empty arrays, single elements, duplicates, and sorted/reverse-sorted inputs.
docs/: Stores analysis reports and performance plots.
Implemented Features
Heap Operations
Both Min-Heap and Max-Heap share the following operations:

Insert: Adds a new element while maintaining the heap property.
Extract Max/Min: Removes and returns the root element and restores the heap property.
Peek Max/Min: Returns the root element without removal (O(1) access).
Resize: Dynamically resizes the underlying array when full.
Performance Metrics
Tracked metrics include:

Number of comparisons
Number of swaps
Array accesses
Memory allocations
Metrics are exported to CSV files for analysis and are automatically updated during CLI benchmarking.

CLI Benchmarking
Supports configurable input sizes: 100, 1,000, 10,000, 100,000 elements.
Supports different input distributions: random, sorted, reverse-sorted, nearly-sorted.
Outputs performance metrics to CSV files and optionally prints a summary table.
Complexity Analysis
Operation	Min-Heap	Max-Heap	Time Complexity	Space Complexity
Insert	Yes	Yes	O(log n)	O(n)
Extract	Yes	Yes	O(log n)	O(n)
Peek	Yes	Yes	O(1)	O(n)
Resize	Yes	Yes	O(n)	O(n)
Explanation:

Heap height is logarithmic → insert and extract are O(log n).
Array resizing occurs occasionally → O(n).
Both heaps store elements in linear space O(n).
Testing
Unit Tests: Cover edge cases: empty heap, single-element heap, duplicates, sorted/reverse-sorted inputs.
Property-Based Testing: Ensures correctness for random inputs.
Benchmark Reproduction: Confirms metrics match theoretical complexity.
Cross-Validation: Compared to Java’s PriorityQueue for correctness and efficiency.
Usage
Compile the Project
mvn clean compile
Run CLI Benchmark
java -cp target/classes cli.BenchmarkRunner
Set input size and distribution in the CLI prompt.
Performance CSV files are generated in /docs/performance-plots/.
Run Unit Tests
mvn test
Executes all MinHeapTest and MaxHeapTest cases.
Validates edge cases, duplicates, and performance across distributions.
GitHub Workflow
Branching Strategy:

main: Stable release
feature/algorithm: Heap implementations
feature/testing: Unit tests
feature/metrics: Performance tracking and CSV export
feature/cli: CLI benchmarking
feature/optimization: Performance improvements
Commit Messages Examples:

init: Maven project structure, JUnit setup
feat(algorithm): Implement MinHeap
test(algorithm): Add unit tests
feat(metrics): Add performance counters and CSV export
perf(benchmark): Benchmark MaxHeap and MinHeap for large datasets
Summary
Complete Min-Heap and Max-Heap implementations.
Unit testing and edge case validation.
Performance metrics collection and CSV export.
CLI tool for benchmarking with configurable input sizes and distributions.
Empirical results and plots for analysis.
Educational reference demonstrating both theoretical complexity and practical performance of heaps. 
