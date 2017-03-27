package com.epam.task2.main;

import com.epam.task2.test.SortTester;

/**
 * @author sergey
 *         created on 24.03.2017
 */
public class Main {
    public static void main(String[] args) {

        SortTester sortTester = new SortTester();
        sortTester.testSelectionSort();
        sortTester.testInsertionSort();
        sortTester.testBubbleSort();
        sortTester.testQuickSort();

        //Verification of the parametrized bubbleSort method
        //Age comparison
        sortTester.testDogAgeComparison();

        //Name comparison
        sortTester.testDogNameComparison();
    }
}
