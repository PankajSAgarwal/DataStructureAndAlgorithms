package com.pankaj.algorithms.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    // push employee to top of stack
    public void push(Employee employee){

        if(top == stack.length){

            // resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }

        stack[top++] = employee;

    }

    // pop element from the stack
    public Employee pop(){

        if(isEmpty()){
            throw  new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;

    }

    // peek a element from stack

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    // Check if the stack is empty
    public boolean isEmpty(){

        return  top == 0;
    }

    // printing elements in stack
    public void printStack(){

        for(int i = top - 1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
