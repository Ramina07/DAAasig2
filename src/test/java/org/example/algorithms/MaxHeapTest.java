package org.example.algorithms;

import org.example.algorithms.MaxHeap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class MaxHeapTest {

    @Test
    void testInsertAndPeekMax() {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);

        assertEquals(10, heap.peekMax());
    }

    @Test
    void testExtractMax() {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);

        assertEquals(10, heap.extractMax());
        assertEquals(5, heap.peekMax());
    }

    @Test
    void testEmptyHeap() {
        MaxHeap heap = new MaxHeap(10);

        assertThrows(NoSuchElementException.class, () -> heap.extractMax());
    }

    @Test
    void testResizeFunctionality() {
        MaxHeap heap = new MaxHeap(2);
        heap.insert(10);
        heap.insert(20); // Here it should trigger resize

        assertEquals(20, heap.peekMax());
    }
}


