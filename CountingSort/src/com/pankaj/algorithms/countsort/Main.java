package com.pankaj.algorithms.countsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {2,5,9,8,2,8,7,10,4,3};
        countSort(intArray,1,10);
        System.out.println("Sorted Array>>");
        printArrays(intArray);

    }

    public static void countSort(int[] input,int min,int max){
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length ;i++){
            countArray[input[i] - min]++;
        }
        System.out.println("Count Array >>>");
        printArrays(countArray);

        int j = 0;
        for(int i = min;i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void printArrays(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
    }
}
