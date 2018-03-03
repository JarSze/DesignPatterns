package com.learning.builder;

import java.time.LocalDate;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class ReservationParser
{
    //sample format:
    // Date , 2018-03-03, Headcount, 200, City, Poznan, Price, 150
    public static Reservation parse( String s )
    {
        String[] split = s.split( ", " );
        Reservation.ReservationBuilder reservationBuilder = Reservation.builder();

        for( int i = 0; i < split.length; i += 2 )
        {
            String key = split[ i ];
            String value = split[ i + 1 ];
            if( key.toLowerCase().equals( "data" ) )
            {
                reservationBuilder.data( LocalDate.parse( value ) );
            }
            else if( key.toLowerCase().equals( "headcount" ) )
            {
                reservationBuilder.headcount( Integer.parseInt( value ) );
            }
            else if( key.toLowerCase().equals( "city" ) )
            {
                reservationBuilder.city( value );
            }
            else if( key.toLowerCase().equals( "price" ) )
            {
                reservationBuilder.price( Double.parseDouble( value ) );
            }
        }
        return reservationBuilder.build();
    }
}
