package com.pankaj.algorithms.quicksort;

public class Main {

    public static void main(String[] args) {
	int[] intArray = {20, 35, -15, 7, 55, 1, -22};

	quickSort(intArray,0, intArray.length);

	printArray(intArray);


    }

    public static void quickSort(int[] input,int start, int end){
        // {20, 35, -15, 7, 55, 1, -22}

        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(input,start,end);
        System.out.println("After each partition");
        printArray(input);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex + 1,end);

    }

    public static int partition(int[] input, int start, int end){
        // {20, 35, -15, 7, 55, 1, -22}

        //Note : This is using first element as pivot

        int pivot = input[start];
        int i = start;
        int j = end ;

        while(i < j){

            // Note : empty loop body

            while(i<j && input[--j]>=pivot){
                printArrayonIteration(i,input);
            }

            if(i < j){
                input[i] = input[j];
                printArrayonIteration(i,input);
            }

            while(i < j && input[++i] <= pivot){
                printArrayonIteration(j,input);
            }
            if(i < j){
                input[j] = input[i];
                printArrayonIteration(j,input);

            }
        }
        input[j] = pivot;
        return j;
    }

    public static void printArrayonIteration(int iteration, int[] input){
        System.out.println("Iteration"+iteration+":");
        for (int i = 0; i < input.length ; i++){
            System.out.println(input[i]);
        }
    }

    public static void printArray( int[] input){
        for (int i = 0; i < input.length ; i++){
           // System.out.println("Iteration"+iteration+":");
            System.out.println(input[i]);
        }
    }
}
