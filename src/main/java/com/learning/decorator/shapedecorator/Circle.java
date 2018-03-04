package com.learning.decorator.shapedecorator;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class Circle implements Shape
{
    private float radius;

    public Circle( float radius )
    {
        this.radius = radius;
    }

    @Override
    public String info()
    {
        return "Radius is " + radius;
    }
}
