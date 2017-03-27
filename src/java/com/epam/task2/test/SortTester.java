package com.epam.task2.test;

import com.epam.task2.bean.Dog;
import com.epam.task2.comparator.CompDogAge;
import com.epam.task2.comparator.CompDogName;
import com.epam.task2.util.Sorter;

/**
 * @author sergey
 *         created on 27.03.2017
 */
public final class SortTester {

    public void testQuickSort() {
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
    }

    public void testSelectionSort() {
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
    }

    public void testInsertionSort() {
        int[] arrayForIS = new int[]{0, 123, 55, 1, 77, 448};

        for (int i = 0; i < arrayForIS.length; i++) {
            System.out.println(arrayForIS[i]);
        }
        System.out.println("-----------------");
        Sorter.insertionSort(arrayForIS);
        for (int i = 0; i < arrayForIS.length; i++) {
            System.out.println(arrayForIS[i]);
        }
        System.out.println("-----------------");
    }

    public void testBubbleSort() {
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
    }

    public void testDogAgeComparison() {
        Dog[] dogs = new Dog[5];

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
            dogs[i].setAge((int) (Math.random() * 10));
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getAge());
        }
        System.out.println("-----------------");
        Sorter.bubbleSort(dogs, new CompDogAge());
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getAge());
        }
        System.out.println("-----------------");
    }

    public void testDogNameComparison() {
        Dog[] dogsWithName = new Dog[3];
        for (int i = 0; i < dogsWithName.length; i++) {
            dogsWithName[i] = new Dog();
        }
        dogsWithName[0].setName("firstDog");
        dogsWithName[1].setName("secondDog");
        dogsWithName[2].setName("athirdDog");
        for (int i = 0; i < dogsWithName.length; i++) {
            System.out.println(dogsWithName[i]);
        }
        System.out.println("-----------------");
        Sorter.bubbleSort(dogsWithName, new CompDogName());
        for (int i = 0; i < dogsWithName.length; i++) {
            System.out.println(dogsWithName[i]);
        }
        System.out.println("-----------------");
    }
}
