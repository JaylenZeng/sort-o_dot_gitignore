// dot_gitignore : David Chen, Jaylen Zeng, Yat Long Chan
// APCS pd7
// L04: Never Fear, Big O is Here!
// 2022-01-07
// time spent:  0.1 hrs

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // ArrayList for testing
        ArrayList<Comparable> test;

        System.out.println("=====Best Case Tests=====");
        for (int i = 10; i <= 10000; i *= 10) {
            test = populateOrder(i, true);
            System.out.println("\nTest With ArrayList of size: " + test.size());
            Sorts.bubble(test);
            Sorts.selection(test);
            Sorts.insertion(test);
        }

        System.out.println("\n=====Worst Case Tests=====");
        for (int i = 10; i <= 10000; i *= 10) {
            test = populateOrder(i, false);
            System.out.println("\nTest With ArrayList of size: " + test.size());
            Sorts.bubble(test);
            Sorts.selection(test);
            Sorts.insertion(test);
        }

        System.out.println("\n=====Average Case Tests=====");
        for (int i = 10; i <= 10000; i *= 10) {
            test = populateRandom(i);
            System.out.println("\nTest With ArrayList of size: " + test.size());
            Sorts.bubble(test);
            Sorts.selection(test);
            Sorts.insertion(test);
        }

    }

    // create ArrayList with random numbers
    public static ArrayList<Comparable> populateRandom(int length) {
        ArrayList<Comparable> array = new ArrayList<Comparable>();
        for (int i = 0; i < length; i ++) {
            array.add( (int) (Math.random() * length) ); // rand num on interval [0, length)
        } 
        return array;
    }
    // create ordered ArrayList 
    public static ArrayList<Comparable> populateOrder(int length, boolean ascending) {
        ArrayList<Comparable> array = new ArrayList<Comparable>();
        if (ascending) {
            // ascending order
            for (int i = 0; i < length; i++) {
                array.add(i);
            }
        } else {
            // descending order
            for (int i = length - 1; i >= 0; i--) {
                array.add(i);
            }
        }

        return array;
    }
}
