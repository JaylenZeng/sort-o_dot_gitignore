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

        ArrayList<Comparable> yatlongChan = populate(1000, true);


        System.out.println("=====Best Case Tests=====");
        Sorts.bubble(best);
        Sorts.selection(best);
        Sorts.insertion(best);
        Sorts.bubble(yatlongChan);
        Sorts.selection(yatlongChan);
        Sorts.insertion(yatlongChan);
        
        yatlongChan = populate(1000, false);
        System.out.println("\n=====Worst Case Tests=====");
        Sorts.bubble(worst);
        Sorts.selection(worst);
        Sorts.insertion(worst);
        Sorts.bubble(yatlongChan);
        Sorts.selection(yatlongChan);
        Sorts.insertion(yatlongChan);
    
    }

    public static ArrayList<Comparable> populate(int length, boolean ascending) {
        ArrayList<Comparable> input = new ArrayList<Comparable>();
        if(ascending) {
            for(int i = 0; i < length; i++) {
                input.add(i);
            }
        } else {
            for (int i = length - 1; i >= 0; i--) {
                input.add(i);
            }
        }

        return input;
    }
}
