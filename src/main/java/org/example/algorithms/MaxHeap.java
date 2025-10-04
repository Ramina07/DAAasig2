package org.example.algorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("Capacity must be greater than 0");
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Метод для получения максимального элемента
    public int peekMax() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        return heap[0];
    }

    // Вставка нового элемента в кучу
    public void insert(int value) {
        if (size >= heap.length) resize();
        heap[size] = value;
        size++;
        siftUp(size - 1);
    }

    // Извлечение максимального элемента из кучи
    public int extractMax() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        if (size == 1) { // Если в куче только один элемент
            int max = heap[0];
            size--;
            return max;
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return max;
    }

    // Метод для "поднимания" элемента
    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] <= heap[parentIndex]) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    // Метод для "опускания" элемента
    private void siftDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest]) largest = left;
            if (right < size && heap[right] > heap[largest]) largest = right;
            if (largest == index) break;

            swap(index, largest);
            index = largest;
        }
    }

    // Метод для обмена элементов местами
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Метод для увеличения размера кучи
    private void resize() {
        // Увеличиваем размер массива только если куча заполнилась на 75% или больше
        if (size >= heap.length * 0.75) {
            heap = Arrays.copyOf(heap, heap.length * 2); // Удваиваем размер массива
        }
    }
}


