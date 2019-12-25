package com.pankaj.algorithms.linkedstack;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("Jane","Jones",4567);
        Employee marySmith = new Employee("Jane","Jones",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        LinkedStack stack = new LinkedStack();

        // Push employees on to stack
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        // Peek element in a stack

        System.out.println(stack.peek());
        //Print stack
        stack.printStack();

        System.out.println("Popped :" + stack.pop());
        System.out.println(stack.peek());
    }
}
