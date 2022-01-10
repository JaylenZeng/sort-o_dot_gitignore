// dot_gitignore : David Chen, Jaylen Zeng, Yat Long Chan
// APCS pd7
// L04: Never Fear, Big O is Here!
// 2022-01-07
// time spent:  0.1 hrs

import java.util.ArrayList;

public class Sorts {
  // Void Methods:

  public static void bubbleV(ArrayList<Comparable> data) {
    boolean sorted = true;
    int comparisons = 0; // amount of comparisons]
    int swaps = 0;
    int ctr = 0;
    for (int pass = 0; pass < data.size(); pass++) {
      // iterate thru array from last to pass index
      for (int j = data.size() - 1; j > pass; j--) {
        comparisons++;
        // compare adjacent elements and swap if needed
        if (data.get(j).compareTo(data.get(j - 1)) < 0) {
          sorted = false;
          Comparable temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j - 1, temp);
          swaps++;
        }
      }
      ctr++;
      // end loop
      // if no swaps are made, the array is already sorted
      if (sorted) {
        break;
      }
    }
    System.out.println("bubble sort took: " + comparisons + " comparisons to complete");
    System.out.println("bubble sort took: " + ctr + " passes to complete");
    System.out.println("bubble sort took: " + swaps + " swaps to complete \n");
  }

  public static void selectionV(ArrayList<Comparable> data) {

    // maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int comparisons = 0; // amount of comparisons
    int ctr = 0;
    int swaps = 0;
    for (int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;
      // iterate thru next-to-last to first element and compare with last.
      for (int i = pass - 1; i >= 0; i--) {
        comparisons++;
        // if element at i > element at maxPos, new maxPos = i
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
      ctr++;
      // swap last element with element at maxPos.
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
      swaps++;
    }
    System.out.println("selection sort took: " + comparisons + " comparisons to complete");
    System.out.println("selection sort took: " + ctr + " passes to complete");
    System.out.println("selection sort took: " + swaps + " swaps to complete \n");
  }// end selectionV

  public static void insertionV(ArrayList<Comparable> data) {
    int comparisons = 0; // amount of comparisons
    int ctr = 1;
    int swaps = 0;
    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region
      // traverse sorted region from right to left
      for (int i = partition; i > 0; i--) {
        comparisons++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i - 1, temp);
          swaps++;
        } else
          break;
      }
      ctr++;
    }
    System.out.println("insertion sort took: " + comparisons + " comparisons to complete");
    System.out.println("insertion sort took: " + ctr + " passes to complete");
    System.out.println("insertion sort took: " + swaps + " swaps to complete \n");

  }// end insertionV

  // Non void methods:
  public static ArrayList<Comparable> insertion(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input) {
      data.add(o);
    }

    insertionV(data);

    return data;
  }

  public static ArrayList<Comparable> bubble(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input) {
      data.add(o);
    }

    bubbleV(data);

    return data;
  }

  public static ArrayList<Comparable> selection(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input) {
      data.add(o);
    }

    selectionV(data);

    return data;
  }

}
