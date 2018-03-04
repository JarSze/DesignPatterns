package com.learning.observer;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class StockApp
{
    public static void main( String[] args )
    {

        Stock stock=new Stock();
        stock.setPrice( 10 );
        new StockObserver( stock );

        stock.setPrice( 20 );
    }
}
