package com.learning.observer;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class StockObserver implements Observer<Stock>
{
    private Stock stockToObserve;

    public StockObserver( Stock stockToObserve )
    {
        this.stockToObserve = stockToObserve;
        this.stockToObserve.subscribe( this );
    }

    @Override public void handle( PropertyChangeIventArgs<Stock> args )
    {
        System.out.println( "Value has been changed: " + args.getPropertyName() );
        System.out.println( "Old value: " + args.getOldValue() );
        System.out.println( "New value: " + args.getNewValue() );

    }
}
