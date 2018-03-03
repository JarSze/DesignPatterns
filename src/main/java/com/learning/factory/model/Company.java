package com.learning.factory.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jszeligowski on 2018-03-03.
 */
@XmlRootElement
public class Company
{
    private String name;
    private List<Employee> employee =new ArrayList<>(  );

    public void addEmployee(Employee employee){
        this.employee.add( employee );
    }

    public List<Employee> getEmployee()
    {
        return employee;
    }

    public void setEmployee( List<Employee> employee )
    {
        this.employee = employee;
    }
}
