package com.learning.factory.writer;

import com.learning.factory.model.Company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class XmlCompanyWriter implements CompanyWriter
{
    private final String path;

    public XmlCompanyWriter( String path )
    {
        this.path = path;
    }

    @Override public void write( Company company )
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance( Company.class );
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
            marshaller.marshal( company, new File( path ) );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }
    }
}
