package com.epam.task2.comparator;

import com.epam.task2.bean.Dog;

import java.util.Comparator;

/**
 * @author sergey
 *         created on 27.03.2017
 */
public class CompDogAge implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
