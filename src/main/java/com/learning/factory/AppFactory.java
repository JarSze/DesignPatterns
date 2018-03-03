package com.learning.factory;

import com.learning.factory.model.Company;
import com.learning.factory.model.Employee;
import com.learning.factory.writer.CompanyWriter;
import com.learning.factory.writer.XmlCompanyWriter;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class AppFactory
{

    public static void main( String[] args )
    {
        Employee owner = new Employee( "jan", "nowak", "jnowak@company.com", 1000 );
        Employee director = new Employee( "jan", "kowalski", "jkowalski@company.com", 2000 );

        Company company=new Company();
        company.addEmployee( owner );
        company.addEmployee(director);

        CompanyWriter writer = new XmlCompanyWriter("firma.xml");
        writer.write( company );
    }
}
