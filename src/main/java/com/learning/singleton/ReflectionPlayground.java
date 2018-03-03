package com.learning.singleton;

import com.learning.factory.model.Employee;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class ReflectionPlayground
{
    public static void main( String[] args ) throws Exception
    {
        //how to create object using reflection
        Class<?> clazz = Class.forName( "com.learning.factory.model.Employee" );
        Object o = clazz.newInstance();

        if(o instanceof Employee){
            System.out.println("o is an employee object");
        }
    }
}
