package com.learning.singleton;

import com.learning.factory.model.Company;
import com.learning.factory.model.Employee;
import com.learning.factory.writer.CompanyWriter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class EnumDemo
{
    public static void main( String[] args )
    {
        Employee owner = new Employee( "jan", "nowak", "jnowak@company.com", 1000 );
        Employee director = new Employee( "jan", "kowalski", "jkowalski@company.com", 2000 );

        Company company = new Company();
        company.addEmployee( owner );
        company.addEmployee( director );

        CompanyWriter writer = EnumFactory.INSTANCE.create( "enum.xml" );

        Class<? extends EnumFactory> aClass = EnumFactory.INSTANCE.getClass();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for( Constructor c : declaredConstructors )
        {
            c.setAccessible( true );
        }

        Constructor<?> declaredConstructor = declaredConstructors[ 0 ];
        try
        {
            Object o = declaredConstructor.newInstance();
        }
        catch( InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e )
        {
            System.out.println( e.getMessage() );
        }

        writer.write( company );

    }
}
