package com.learning.singleton;

import com.learning.factory.Factory;
import com.learning.factory.writer.CompanyWriter;
import com.learning.factory.writer.TxtCompanyWriter;
import com.learning.factory.writer.XmlCompanyWriter;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class SingletonCompanyWriterFactory implements Factory<String, CompanyWriter>
{
    private final static SingletonCompanyWriterFactory INSTANCE = new SingletonCompanyWriterFactory();

    private SingletonCompanyWriterFactory()
    {
    }

    public static SingletonCompanyWriterFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public CompanyWriter create( String path )
    {
        if( path.endsWith( ".txt" ) )
        {
            return new TxtCompanyWriter( path );
        }
        else if( path.endsWith( ".xml" ) )
        {
            return new XmlCompanyWriter( path );
        }
        return null;
    }
}
