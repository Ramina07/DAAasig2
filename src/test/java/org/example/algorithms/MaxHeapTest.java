package org.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException; // Импортируем исключение

public class MaxHeapTest {

    @Test
    void testInsertAndPeekMax() {
        MaxHeap heap = new MaxHeap(10);  // указываем только capacity без `value:`
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);

        // Проверяем, что максимальный элемент это 10
        assertEquals(10, heap.peekMax());
    }

    @Test
    void testExtractMax() {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);

        // Извлекаем максимальный элемент, он должен быть 10
        assertEquals(10, heap.extractMax());
        // Проверяем следующий максимум
        assertEquals(5, heap.peekMax());
    }

    @Test
    void testEmptyHeap() {
        MaxHeap heap = new MaxHeap(10);

        // Проверяем, что извлечение из пустой кучи вызывает исключение
        assertThrows(NoSuchElementException.class, () -> heap.extractMax());
    }
}

