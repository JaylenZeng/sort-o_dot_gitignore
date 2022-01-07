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
            test = populate(i, true);
            System.out.println("\nTest With ArrayList of size: " + test.size());
            Sorts.bubble(test);
            Sorts.selection(test);
            Sorts.insertion(test);
        }

        System.out.println("\n=====Worst Case Tests=====");
        for (int i = 10; i <= 10000; i *= 10) {
            test = populate(i, false);
            System.out.println("\nTest With ArrayList of size: " + test.size());
            Sorts.bubble(test);
            Sorts.selection(test);
            Sorts.insertion(test);
        }

    }

    // create and populate arrayList
    public static ArrayList<Comparable> populate(int length, boolean ascending) {
        ArrayList<Comparable> input = new ArrayList<Comparable>();
        if (ascending) {
            // ascending order
            for (int i = 0; i < length; i++) {
                input.add(i);
            }
        } else {
            // descending order
            for (int i = length - 1; i >= 0; i--) {
                input.add(i);
            }
        }

        return input;
    }
}
