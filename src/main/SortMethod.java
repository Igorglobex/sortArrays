package main;

import java.util.Arrays;

public class SortMethod {

    public void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; (i + 1) < array.length; i++) {
            for (int j = 0; (j + 1) < array.length; j++) {
                if (array[j] >= array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\nСортировка пузырьком по возрастанию: " + Arrays.toString(array));

    }

    public void utilArraysSort (int[] array) {
        Arrays.sort(array);
        System.out.print("\nСортировка утилитой Arrays: " + Arrays.toString(array));

    }

    public void bubbleSortInDescending (int[] array) {
        int temp;
        for (int i = 0; (i + 1) < array.length; i++) {
            for (int j = 0; (j + 1) < array.length; j++) {
                if (array[j] <= array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\nСортировка пузырьком по убыванию: " + Arrays.toString(array));
    }

    public void shakerSort (int[] array) {
        int temp;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (array[i-1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            --right;
        }

        System.out.print("\nШейкерная сортировка: " + Arrays.toString(array));
    }

    public void combSort (int[] array) {
        double factor = 1.247; // Фактор уменьшения
        double step = array.length - 1;
        int temp;

        while (step >= 1) {
            for (int i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + (int) step]) {
                    temp = array[i + (int) step];
                    array[i + (int) step] = array[i];
                    array[i] = temp;
                }
            }
            step /= factor;
        }
        System.out.print("\nСортировка расчёсткой: " + Arrays.toString(array));
    }

}


