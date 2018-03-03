package com.learning.builder;

import java.time.LocalDate;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class Reservation
{
    private LocalDate data;
    private int headcount;
    private String city;
    private double price;

    private Reservation()
    {
    }

    public LocalDate getData()
    {
        return data;
    }

    public void setData( LocalDate data )
    {
        this.data = data;
    }

    public int getHeadcount()
    {
        return headcount;
    }

    public void setHeadcount( int headcount )
    {
        this.headcount = headcount;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice( double price )
    {
        this.price = price;
    }

    public static ReservationBuilder builder()
    {
        return new ReservationBuilder();
    }

    public static class ReservationBuilder
    {
        private LocalDate data;
        private int headcount;
        private String city;
        private double price;

        public ReservationBuilder data( LocalDate val )
        {
            this.data = val;
            return this;
        }

        public ReservationBuilder headcount( int val )
        {
            this.headcount = val;
            return this;
        }

        public ReservationBuilder city( String val )
        {
            this.city = val;
            return this;
        }

        public ReservationBuilder price( double val )
        {
            this.price = val;
            return this;
        }

        public Reservation build()
        {
            Reservation reservation = new Reservation();
            reservation.setData( this.data );
            reservation.setHeadcount( this.headcount );
            reservation.setCity( this.city );
            reservation.setPrice( this.price );
            return reservation;
        }

    }
}
