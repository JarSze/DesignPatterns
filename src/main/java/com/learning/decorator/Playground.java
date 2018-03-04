package com.learning.decorator;

import com.learning.decorator.shapedecorator.Circle;
import com.learning.decorator.shapedecorator.ColoredCircle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class Playground
{
    public static void main( String[] args ) throws IOException
    {
        //        FileReader fileReader = new FileReader( "plik.txt" );
        //        BufferedReader bufferedReader = new BufferedReader( fileReader );
        //        bufferedReader.readLine();

        Circle circle = new Circle( 4 );
        System.out.println( circle.info() );

        ColoredCircle coloredCircle = new ColoredCircle( circle, "red" );
        System.out.println( coloredCircle.info() );

    }
}
