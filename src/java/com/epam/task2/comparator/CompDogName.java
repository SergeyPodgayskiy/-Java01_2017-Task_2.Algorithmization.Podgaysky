package com.epam.task2.comparator;

import com.epam.task2.bean.Dog;

import java.util.Comparator;

/**
 * @author sergey
 *         created on 27.03.2017
 */
public class CompDogName implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
