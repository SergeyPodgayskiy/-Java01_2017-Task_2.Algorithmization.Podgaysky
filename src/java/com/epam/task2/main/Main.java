package com.epam.task2.main;

import com.epam.task2.util.Sorter;

/**
 * @author sergey
 * created on 24.03.2017
 */
public class Main {
    public static void main(String[] args) {
        int[] arrayForQS = new int[]{5, 4, 2, 1, 5, 78};

        for (int i = 0; i < arrayForQS.length; i++) {
            System.out.println(arrayForQS[i]);
        }
        System.out.println("-----------------");
        Sorter.quickSort(arrayForQS, 0, arrayForQS.length - 1);
        for (int i = 0; i < arrayForQS.length; i++) {
            System.out.println(arrayForQS[i]);
        }
        System.out.println("-----------------");
        int[] arrayForBS = new int[]{1, 3, 55, 1, 5, 448};

        for (int i = 0; i < arrayForBS.length; i++) {
            System.out.println(arrayForBS[i]);
        }
        System.out.println("-----------------");
        Sorter.bubbleSort(arrayForBS);
        for (int i = 0; i < arrayForBS.length; i++) {
            System.out.println(arrayForBS[i]);
        }
        System.out.println("-----------------");
        int[] arrayForSS = new int[]{1, 34, 55, 555, 5, 448};

        for (int i = 0; i < arrayForSS.length; i++) {
            System.out.println(arrayForSS[i]);
        }
        System.out.println("-----------------");
        Sorter.selectionSort(arrayForSS);
        for (int i = 0; i < arrayForSS.length; i++) {
            System.out.println(arrayForSS[i]);
        }
        System.out.println("-----------------");
        int[] arrayForIS = new int[]{0, 123, 55, 1, 77, 448};

        for (int i = 0; i < arrayForIS.length; i++) {
            System.out.println(arrayForIS[i]);
        }
        System.out.println("-----------------");
        Sorter.insertionSort(arrayForIS);
        for (int i = 0; i < arrayForIS.length; i++) {
            System.out.println(arrayForIS[i]);
        }
    }
}
