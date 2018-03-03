package com.learning.builder;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class AppTestParse
{
    public static void main( String[] args )
    {
        String toParse = "Date , 2018-03-03, Headcount, 200, City, Poznan, Price, 150";
        Reservation myReservation = ReservationParser.parse( toParse );
        //System.out.println(myReservation);
    }
}
