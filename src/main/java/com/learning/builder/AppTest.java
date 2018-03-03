package com.learning.builder;

import java.time.LocalDate;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class AppTest
{
    public static void main( String[] args )
    {
        Reservation.ReservationBuilder reservationBuilder = Reservation.builder()
            .city( "Poznan" )
            .headcount( 200 )
            .price( 100 );

        //read from file
        reservationBuilder.data( LocalDate.parse( "2018-03-03" ) );

        System.out.println(LocalDate.parse( "2018-03-03" ));

        //end build process - recive object
        Reservation build =reservationBuilder.build();
        System.out.println(build);

        //another case - i know all values
        Reservation wroclaw = Reservation.builder()
            .data( LocalDate.parse( "2019-04-04" ) )
            .city( "Wroclaw" )
            .headcount( 300 )
            .price( 500 )
            .build();


    }
}
