package com.pankaj.algorithms.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJones =  new Employee("Jane","Jones",123);
        Employee johnDoe =  new Employee("John","Doe",4567);
        Employee marySmith =  new Employee("Mary","Smith",22);
        Employee mikeWilson =  new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        LinkedList<Employee> list = new LinkedList<>();

        // Add items to the front of the list

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        // Iterate over the linked list
        Iterator item = list.iterator();
        System.out.print("HEAD -> ");
        while(item.hasNext()){
            System.out.print(item.next());
            System.out.print("<=>");
        }
        System.out.println("null");

//        Using for loop to iterate over linked list
//        for(Employee employee:list){
//            System.out.println(employee);
//        }

        // Adding item at the end of the list

        list.add(billEnd);        // Add method of link list adds to the end of the list
        // list.addLast(billEnd); // addLast does the same as add method of the linked list

        // Iterate over the list again
        item = list.iterator();
        System.out.print("HEAD -> ");
        while(item.hasNext()){
            System.out.print(item.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        // Remove item from the front of the list

        list.removeFirst();
        // Iterate over the list again
        item = list.iterator();
        System.out.print("HEAD -> ");
        while(item.hasNext()){
            System.out.print(item.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        // Remove item from end of the list

        list.removeLast();
        // Iterate over the list again
        item = list.iterator();
        System.out.print("HEAD -> ");
        while(item.hasNext()){
            System.out.print(item.next());
            System.out.print("<=>");
        }
        System.out.println("null");

    }
}
