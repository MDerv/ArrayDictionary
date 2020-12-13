/*
Dhruv Sharma
12/8/2020
12/12/2020
This is the class that defines a queue using stacks.
 */

import java.util.*;

public class ArrayDictionary<T,E> {
    private ArrayList<T> dictList;
    private ArrayList<E> keyList;


    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here.
     */

    public ArrayDictionary() {
        dictList = new ArrayList<T>();
        keyList = new ArrayList<E>();
    }

    //add an key-value pair to the dictionary
    public void put(E key, T value) {
        keyList.add(key);
        dictList.add(value);
    }

    //get the value associated with a given key
    public T get(E key) {
        boolean valueFlag = false;
        int indexValue = -1;
        while(!valueFlag) {
            indexValue++;
            if(keyList.get(indexValue).equals(key)) {
                valueFlag = true;
            }
        }
        return dictList.get(indexValue);
    }

    //remove a key-value pair and return its value
    public T remove(E key) {
        boolean valueFlag = false;
        int indexValue = -1;
        while(!valueFlag) {
            indexValue++;
            if(keyList.get(indexValue).equals(key)) {
                valueFlag = true;
            }
        }

        T dictValue = dictList.get(indexValue);
        dictList.remove(indexValue);
        keyList.remove(indexValue);

        return dictValue;
    }

    //returns true if the given key has an associated value
    public boolean contains(E key) {
        boolean valueFlag = false;
        for(int i = 0; i < keyList.size(); i++) {
            if(keyList.get(i).equals(key)) {
                valueFlag = true;
            }
        }

        if(valueFlag) {
            return true;
        }
        else {
            return false;
        }

    }

    //returns true if the dictionary is empty
    public boolean isEmpty() {
        if(dictList.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //returns the number of key-value pairs in the dictionary
    public int size() {
        return dictList.size();
    }

    //returns a Collection of keys
    public Collection<E> keys() {
        Collection<E> keyCollection = keyList;

        return keyCollection;
    }

    //returns a Collection of values
    public Collection<T>  values(){
        Collection<T> valueCollection = dictList;

        return valueCollection;
    }
}
