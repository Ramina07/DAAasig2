package org.example.metrics;

import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {
    public static void exportToCSV(String fileName, long comparisons, long swaps, long memoryAllocations) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(comparisons + "," + swaps + "," + memoryAllocations + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
