package com.pankaj.algorithms.hashtable;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable(){

        hashtable = new StoredEmployee[10];
    }

    public void put(String key,Employee employee){

        int hashedKey = hashKey(key);

        if(occupied(hashedKey)){
            // stop index is current value of hashed key
            int stopIndex = hashedKey;

            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }


        }

        if(occupied(hashedKey)){
            // Very Simple and basic collision handling
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        }else{
            hashtable[hashedKey] = new StoredEmployee(key,employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null &&
            hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length - 1){
            hashedKey = 0;
        }else{
            hashedKey++;
        }

        while(hashedKey != stopIndex &&
                hashtable[hashedKey] !=null &&
                !hashtable[hashedKey].key.equals(key)
        ) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(stopIndex == hashedKey){
            return -1;
        }else{
            return  hashedKey;
        }

    }
    // hash function
    private int hashKey(String key){

        // e.g key = Jones, so 5 mod 10 = 5
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){

        return hashtable[index] != null;
    }

    public void printHashTable(){
        for(int i = 0;i<hashtable.length;i++){
            if(hashtable[i] == null){
                System.out.println("Empty");
            }else{
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }

        }
    }
}
