package com.example.integerarraylist.sortcomparison.sorts;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import static com.example.integerarraylist.sortcomparison.sorts.Sort.swapElements;

public class SelectionSort extends Sort{
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(array, i, minElementIndex);
        }
    }
}
