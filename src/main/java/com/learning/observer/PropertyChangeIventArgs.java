package com.learning.observer;

/**
 * Created by jszeligowski on 2018-03-04.
 */
public class PropertyChangeIventArgs<T>
{
    private T source;
    private String propertyName;
    private Object newValue;
    private Object oldValue;

    public T getSource()
    {
        return source;
    }

    public String getPropertyName()
    {
        return propertyName;
    }

    public Object getNewValue()
    {
        return newValue;
    }

    public Object getOldValue()
    {
        return oldValue;
    }

    public PropertyChangeIventArgs( T source, String propertyName, Object newValue, Object oldValue )
    {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }
}
