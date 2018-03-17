package com.learning.iterator;

/**
 * Created by jszeligowski on 2018-03-17.
 */
public class MyCollection implements Iterable<String>
{
    private int index = 0;
    private String[] elements = new String[ 10 ];

    public void addElement( String e )
    {
        if( index < elements.length )
        {
            elements[ index++ ] = e;
        }
    }

    @Override public Iterator<String> getIterator()
    {
        return null;
    }

    private class MyCollectionIterator implements Iterator<String>
    {

        private int iteratorInndex = 0;

        @Override public String getNextElement()
        {
            if( !hasNextElement() )
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            return elements[ iteratorInndex++ ];
        }

        @Override public boolean hasNextElement()
        {
            if( iteratorInndex >= elements.length )
            {
                return false;
            }
            String elem = elements[ iteratorInndex ];
            return elem != null;
        }
    }

}
