package com.learning.singleton;

import com.learning.factory.model.Employee;

import java.lang.reflect.Constructor;

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

        SingletonCompanyWriterFactory instance = SingletonCompanyWriterFactory.getInstance();
        Constructor<?>[] declaredConstructors = SingletonCompanyWriterFactory.class.getDeclaredConstructors(  );
        for(Constructor c: declaredConstructors ){
            c.setAccessible( true );
        }

        Constructor<?> declaredConstructor = declaredConstructors[0];
        SingletonCompanyWriterFactory oo = (SingletonCompanyWriterFactory) declaredConstructor.newInstance(  );
        if (instance==oo){
            System.out.println("the same object");

        }
        else{
            System.out.println("Not the same object");
        }

    }
}
