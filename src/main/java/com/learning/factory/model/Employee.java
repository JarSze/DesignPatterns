package com.learning.factory.model;

import java.io.Serializable;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class Employee implements Serializable
{
    private String firstname, lastname, email;
    private double salary;

    public Employee( String firstname, String lastname, String email, double salary )
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.salary = salary;
    }

    @Override public String toString()
    {
        return "Employee{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", email='" + email + '\'' +
            ", salary=" + salary +
            '}';
    }

    public Employee()
    {
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary( double salary )
    {
        this.salary = salary;
    }
}
