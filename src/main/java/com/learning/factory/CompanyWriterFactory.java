package com.learning.factory;

import com.learning.factory.writer.CompanyWriter;
import com.learning.factory.writer.TxtCompanyWriter;
import com.learning.factory.writer.XmlCompanyWriter;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class CompanyWriterFactory implements Factory<String, CompanyWriter>
{
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
        else
        {
            throw new IllegalArgumentException( "Not supported file type" );
        }
    }
}
