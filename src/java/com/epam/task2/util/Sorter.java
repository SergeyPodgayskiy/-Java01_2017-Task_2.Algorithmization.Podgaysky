package com.epam.task2.util;

/**
 * @author sergey
 * created on 24.03.2017
 */
public final class Sorter {

    private Sorter() {
    }

    public static void selectionSort(int[] array) {
        int min;

        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static void insertionSort(int[] array) {
        int temp;
        int j;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        int index;

        if (isParametersValid(array, left, right)) {
            index = partition(array, left, right);
            if (left < index - 1) {
                quickSort(array, left, index - 1);
            }
            if (index < right) {
                quickSort(array, index, right);
            }
        }
    }

    private static int partition(int[] array, int left, int right) {
        int middle;
        int pivot;
        int i;
        int j;

        middle = left + (right - left) / 2;
        pivot = array[middle];
        i = left;
        j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private static boolean isParametersValid(int[] array, int left, int right) {
        return (array != null || array.length != 0) && left <= right;
    }

    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}