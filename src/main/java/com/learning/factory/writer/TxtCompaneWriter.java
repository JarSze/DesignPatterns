package com.learning.factory.writer;

import com.learning.factory.model.Company;
import com.learning.factory.model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jszeligowski on 2018-03-03.
 */
public class TxtCompaneWriter implements CompanyWriter
{
    private final String path;

    public TxtCompaneWriter( String path )
    {
        this.path = path;
    }

    @Override public void write( Company company )
    {
        List<String> strings = new ArrayList<>();
        for( Employee employee : company.getEmployee() )
        {
            strings.add( employee.toString() );
        }

        List<String> collect = company.getEmployee().stream().map( Employee::toString ).collect( Collectors.toList());

        try
        {
            Files.write( Paths.get( path ),strings );
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
