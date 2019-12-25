package com.pankaj.algorithms.stacks;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        // push employees into stack
        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("John","Doe",4567));
        stack.push(new Employee("Mary","Smith",22));
        stack.push(new Employee("Mike","Wilson",3245));
        stack.push(new Employee("Bill","End",78));

        //stack.printStack();

        // peek the top element in stack
        System.out.println(stack.peek());

        // Pop

        System.out.println("Popped: " + stack.pop() );
        System.out.println(stack.peek());
        stack.printStack();
    }
}
