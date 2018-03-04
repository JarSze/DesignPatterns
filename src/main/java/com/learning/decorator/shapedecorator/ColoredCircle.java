package com.learning.decorator.shapedecorator;

/**
 * Created by jszeligowski on 2018-03-04.
 */

//this class is decorator

public class ColoredCircle implements Shape
{

    private String color;
    private Circle circleToDecorate;

    public ColoredCircle( Circle circle, String color )
    {
        this.color = color;
        this.circleToDecorate = circle;
    }

    @Override
    public String info()
    {
        return circleToDecorate.info() + " has color " + color;
    }
}
