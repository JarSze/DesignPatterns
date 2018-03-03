package com.learning.factory.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class Company
{
    private String name;
    private List<Employee> employee =new ArrayList<>(  );

    public List<Employee> getEmployee()
    {
        return employee;
    }

    public void setEmployee( List<Employee> employee )
    {
        this.employee = employee;
    }
}
