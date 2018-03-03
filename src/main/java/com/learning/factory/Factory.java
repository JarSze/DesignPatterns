package com.learning.factory;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public interface Factory<K,V>
{
    V create (K key);

}
