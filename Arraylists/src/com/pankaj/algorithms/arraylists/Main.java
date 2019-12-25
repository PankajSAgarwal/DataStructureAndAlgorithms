package com.pankaj.algorithms.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("John","Doe",4567));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",3245));

        // Print out the elements in arraylist
       // employeeList.forEach(employee -> System.out.println(employee));

        // Print the second element in the list
        //System.out.println(employeeList.get(1));

        // check if list is empty

       // System.out.println(employeeList.isEmpty());
        // Replace the element at index 1 with new Employee
        employeeList.set(1,new Employee("John","Adams",4567));

        // Size of list
       // System.out.println(employeeList.size());

        employeeList.add(3,new Employee("John","Doe",4567));
       // employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee:employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
        System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));

        // Remove an element from list
        System.out.println(employeeList.remove(2));
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
