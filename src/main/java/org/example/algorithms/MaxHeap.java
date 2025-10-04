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

    public int peekMax() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        return heap[0];
    }

    public void insert(int value) {
        if (size >= heap.length) resize();
        heap[size] = value;
        size++;
        siftUp(size - 1);
    }

    public int extractMax() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return max;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] <= heap[parentIndex]) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        while (true) {
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

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize() {
        heap = Arrays.copyOf(heap, heap.length * 2);
    }
}

