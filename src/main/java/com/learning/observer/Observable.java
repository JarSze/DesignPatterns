package com.learning.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class Observable<T>
{
    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe( Observer<T> observer )
    {
        this.observers.add( observer );
    }

    protected void propertyChanged( PropertyChangeIventArgs<T> eventArgs )
    {
        for( Observer<T> o : observers )
        {
            o.handle( eventArgs );
        }
    }
}
