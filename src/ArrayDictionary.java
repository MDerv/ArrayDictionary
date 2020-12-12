/*
Dhruv Sharma
12/8/2020
12/11/2020
This is a the class that defines a queue using stacks.
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


    }

    //remove a key-value pair and return its value
    public T remove(E key) {

    }

    //returns true if the given key has an associated value
    public boolean contains(E key) {

    }

    //returns true if the dictionary is empty
    public boolean isEmpty() {

    }

    //returns the number of key-value pairs in the dictionary
    public int size() {

    }

    //returns a Collection¹ of keys
    public Collection<E> keys() {

    }

    //returns a Collection of values
    public Collection<T>  values(){

    }
}
