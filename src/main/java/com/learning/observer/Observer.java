package com.learning.observer;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public interface Observer<T>
{
    void handle( PropertyChangeIventArgs<T> args );
}
