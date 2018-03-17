package com.learning.iterator;

/**
 * Created by jszeligowski on 2018-03-17.
 */
public interface Iterator<T> {

    T getNextElement();

    boolean hasNextElement();
}
