package com.bridgelabz.factoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType)
    {
        if(empType.trim().equalsIgnoreCase("androidDeveloper"))
        {
            return new AndroidDeveloper();
        }
        else if (empType.trim().equalsIgnoreCase("DotNetDeveloper")) {
            return new DotNetDeveloper();

        }
        else if (empType.trim().equalsIgnoreCase("JavaDeveloper"))
        {
            return new JavaDeveloper();
        }
        else if (empType.trim().equalsIgnoreCase("WebDeveloper"))
        {
            return new WebDeveloper();
        }
        else
        {
            return null;
        }

    }
}
