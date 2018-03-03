package com.learning.singleton;

import com.learning.factory.CompanyWriterFactory;
import com.learning.factory.Factory;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class LazyFactory implements Factory<String, CompanyWriterFactory>
{
    private static LazyFactory instance = null;

    public static LazyFactory getInstance()
    {
        if( instance == null )
        {
            instance = new LazyFactory();
        }
        return instance;
    }

    @Override
    public CompanyWriterFactory create( String key )
    {
        return null;
    }
}
