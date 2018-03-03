package com.learning.singleton;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class Demo
{
    public static void main( String[] args )
    {

        //private cinstructor - no possibility to create new object
        //SingletonCompanyWriterFactory factory = new SingletonCompanyWriterFactory();

        SingletonCompanyWriterFactory instance = SingletonCompanyWriterFactory.getInstance();
        SingletonCompanyWriterFactory companyWriterFactory = SingletonCompanyWriterFactory.getInstance();

        if( instance == companyWriterFactory )
        {
            System.out.println( "The same object" );
        }
        else
        {
            System.out.println( "Other object" );
        }
    }
}
