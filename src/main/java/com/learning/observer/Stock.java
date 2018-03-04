package com.learning.observer;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class Stock extends Observable<Stock>
{
    private double price;

    public double getPrice()
    {
        return price;
    }

    public void setPrice( double price )
    {
        double oldPrice = this.price;
        if( price == oldPrice )
        {
            return;
        }
        this.price = price;
        propertyChanged( new PropertyChangeIventArgs<>( this, "price", this.price, oldPrice ) );
    }

    public void setPriceWithVaidation( double price )
    {
        double oldPrice = price;
        this.price = price;
        if( oldPrice != this.price )
        {
            propertyChanged( new PropertyChangeIventArgs<>( this, "price", this.price, oldPrice ) );
        }
    }
}
