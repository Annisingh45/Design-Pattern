package com.bridgelabz.factoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args)
    {

       Employee androidDeveloper =EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(androidDeveloper);
        int salary= 0;
        if (androidDeveloper != null) {
            salary = androidDeveloper.salary();
        }
        System.out.println(salary);

        Employee javaDeveloper=EmployeeFactory.getEmployee("javaDeveloper");
        System.out.println(javaDeveloper);
        int salary1= javaDeveloper.salary();
        System.out.println(salary1);

        Employee webDeveloper=EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println(webDeveloper);
        int salary2= webDeveloper.salary();
        System.out.println(salary2);

        Employee phpDeveloper=EmployeeFactory.getEmployee("PHPDeveloper");
        System.out.println(phpDeveloper);
        int salary3= 0;
        if (phpDeveloper != null) {
            salary3 = phpDeveloper.salary();
        }
        System.out.println(salary3);
    }


}
