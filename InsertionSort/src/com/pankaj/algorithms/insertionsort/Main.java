package com.pankaj.algorithms.insertionsort;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {20,35,-15,7,55,1,-22};

	    for( int firstUnsortedIndex = 1 ; firstUnsortedIndex<intArray.length;firstUnsortedIndex++){

	        int newElement = intArray[firstUnsortedIndex];

	        int i;

	        for(i=firstUnsortedIndex;i>0 && intArray[i - 1]>newElement;i-- ){


	            // 1. newElement = 7 array = [-15,20,35,7,55,1,-22]
                // 2. firstUnsortedIndex = 3
                // 3. i=1 , intArray[1] (20) > intArray[2] (35)
                // 4. intArray[3] = intArray[2] = 35 // [-15,20,35,35,55,1,-22]
	            intArray[i] = intArray[i-1];

            }
            System.out.println("i>>"+i);
	        intArray[i] = newElement;
        }

	    for (int i =0 ;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
