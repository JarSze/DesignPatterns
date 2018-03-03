package com.learning.factory;

import com.learning.factory.model.Company;
import com.learning.factory.model.Employee;
import com.learning.factory.writer.CompanyWriter;
import com.learning.factory.writer.XmlCompanyWriter;

import java.util.Scanner;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class AppFactory
{

    public static void main( String[] args )
    {
        Employee owner = new Employee( "jan", "nowak", "jnowak@company.com", 1000 );
        Employee director = new Employee( "jan", "kowalski", "jkowalski@company.com", 2000 );

        Company company = new Company();
        company.addEmployee( owner );
        company.addEmployee( director );

        CompanyWriter writer = new XmlCompanyWriter( "firma.xml" );
        writer.write( company );

        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter file name");

        String filename = scanner.next();
        CompanyWriterFactory companyWriterFactory = new CompanyWriterFactory();
        try
        {
            CompanyWriter writerr = companyWriterFactory.create( filename );
            writer.write( company );
        }
        catch( IllegalArgumentException ex )
        {
            System.out.println( ex.getMessage() );
        }
    }
}
