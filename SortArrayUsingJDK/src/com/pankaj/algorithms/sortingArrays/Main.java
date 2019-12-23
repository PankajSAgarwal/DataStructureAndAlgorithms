package com.pankaj.algorithms.sortingArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};

        // Dual Pivot quick sort

        //Arrays.sort(intArray);

        // Parallel sort

        Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
