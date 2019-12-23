package com.pankaj.algorithms.hashtable;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable(){

        hashtable = new Employee[10];
    }

    public void put(String key,Employee employee){

        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null){
            // Very Simple and basic collision handling
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        }else{
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    // hash function
    private int hashKey(String key){

        // e.g key = Jones, so 5 mod 10 = 5
        return key.length() % hashtable.length;
    }

    public void printHashTable(){
        for(int i = 0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
