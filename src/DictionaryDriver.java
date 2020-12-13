/*
Dhruv Sharma
12/11/2020
12/12/2020
This is the driver of ArrayDictionary.
 */

public class DictionaryDriver {
    public static void main(String[] args) {
        ArrayDictionary dict = new ArrayDictionary();

        System.out.println(dict.isEmpty()); //should display true

        dict.put("one", 1);
        dict.put("two", 2);
        dict.put("three", 3);

        System.out.println(dict.isEmpty()); //should display false
        System.out.println(dict.contains("one")); //should display true


        System.out.println(dict.keys());
        System.out.println(dict.values());

        System.out.println(dict.size()); //should display 3

        System.out.println(dict.get("two")); //should display 2

        System.out.println(dict.remove("one")); //should display 2

        System.out.println(dict.keys());
        System.out.println(dict.values());

        System.out.println(dict.size()); //should display 2

        System.out.println(dict.contains("one")); //should display false
    }
}
