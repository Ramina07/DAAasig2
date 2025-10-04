package org.example.cli;

import org.example.algorithms.MaxHeap;
import org.example.metrics.PerformanceTracker;
import org.example.metrics.CSVExporter;

public class BenchmarkRunner {
    public static void main(String[] args) {
        // Проверяем, что были переданы аргументы для размера входных данных
        if (args.length < 1) {
            System.out.println("Please provide input size.");
            return;
        }

        // Чтение размера из командной строки (первый аргумент)
        int inputSize = Integer.parseInt(args[0]);

        // Создаем новый объект для отслеживания производительности
        PerformanceTracker tracker = new PerformanceTracker();
        MaxHeap heap = new MaxHeap(inputSize);

        // Заполнение кучи случайными числами
        for (int i = 0; i < inputSize; i++) {
            heap.insert((int) (Math.random() * 10000)); // Вставляем случайные числа
            tracker.incrementComparisons();  // Пример, нужно больше операций
        }

        // Логируем производительность
        tracker.logPerformance();

        // Экспорт данных в CSV файл
        CSVExporter.exportToCSV("performance_data.csv", tracker.comparisons, tracker.swaps, tracker.memoryAllocations);
    }
}

