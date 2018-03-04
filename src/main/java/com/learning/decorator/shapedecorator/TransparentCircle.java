package com.learning.decorator.shapedecorator;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class TransparentCircle implements Shape
{
    private double transparency;
    private Shape shapeToDecorate;

    public TransparentCircle( Shape shapeToDecorate, double transparency )
    {
        if( transparency < 0.0 || transparency > 100.0 )
        {
            throw new IllegalArgumentException( "Transparency must be value from 0 to 100" );
        }
        this.transparency = transparency;
        this.shapeToDecorate = shapeToDecorate;
    }

    @Override
    public String info()
    {
        return shapeToDecorate.info() + " has " + transparency;
    }
}
