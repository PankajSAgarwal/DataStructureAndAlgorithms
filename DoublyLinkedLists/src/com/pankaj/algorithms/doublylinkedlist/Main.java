package com.pankaj.algorithms.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        Employee janeJones =  new Employee("Jane","Jones",123);
        Employee johnDoe =  new Employee("John","Doe",4567);
        Employee marySmith =  new Employee("Mary","Smith",22);
        Employee mikeWilson =  new Employee("Mike","Wilson",3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        // add to front
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        // Add to end
        Employee billEnd = new Employee("Bill","End",78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        // Remove from front

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        // Remove from end

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());


    }
}
