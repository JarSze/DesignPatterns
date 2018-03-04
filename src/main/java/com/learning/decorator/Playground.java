package com.learning.decorator;

import com.learning.decorator.shapedecorator.Circle;
import com.learning.decorator.shapedecorator.ColoredCircle;
import com.learning.decorator.shapedecorator.Shape;
import com.learning.decorator.shapedecorator.TransparentCircle;

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

        //circle which has color
        ColoredCircle cc = new ColoredCircle( new Circle( 10 ), "green" );

        //circle which has transparency
        TransparentCircle transparentCircle = new TransparentCircle( new Circle( 14 ), 80 );

        //circle which has color and transparency
        Shape mostDecoratedShape = new TransparentCircle( new ColoredCircle( new Circle( 20 ), "blue" ), 90 );

        System.out.println( mostDecoratedShape.info() );

    }
}
