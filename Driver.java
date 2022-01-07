// dot_gitignore : David Chen, Jaylen Zeng, Yat Long Chan
// APCS pd7
// L04: Never Fear, Big O is Here!
// 2022-01-07
// time spent:  0.1 hrs


import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // best case ArrayList. Already Sorted
        ArrayList<Comparable> best = new ArrayList<Comparable>();
        best.add(1);
        best.add(3);
        best.add(5);
        best.add(7);
        best.add(12);

        // worst case ArrayList. Descending/reverse order.
        ArrayList<Comparable> worst = new ArrayList<Comparable>();
        worst.add(12);
        worst.add(7);
        worst.add(5);
        worst.add(3);
        worst.add(1);

        System.out.println("=====Best Case Tests=====");
        System.out.println(Sorts.bubble(best));
        System.out.println(Sorts.selection(best));
        System.out.println(Sorts.insertion(best));
        System.out.println("\n=====Worst Case Tests=====");
        System.out.println(Sorts.bubble(worst));
        System.out.println(Sorts.selection(worst));
        System.out.println(Sorts.insertion(worst));
    
    }
}
