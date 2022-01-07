import java.util.ArrayList;

public class Sorts {
  // Void Methods:

  public static void bubbleV(ArrayList<Comparable> data) {
    boolean sorted = true;
    int comparisons = 0;
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
        }
      }
      // end loop
      // if no swaps are made, the array is already sorted
      if (sorted) {
        break;
      }
    }
    System.out.println("bubble sort took: " + comparisons + " comparisons to complete");
  }

  public static void selectionV(ArrayList<Comparable> data) {

    // maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int comparisons = 0;

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
      // swap last element with element at maxPos.
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
    }
    System.out.println("selection sort took: " + comparisons + " comparisons to complete");

  }// end selectionV

  public static void insertionV(ArrayList<Comparable> data) {
    int comparisons = 0;
    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region
      // traverse sorted region from right to left
      // for (int i = partition; i > 0; i--) {
      //   comparisons++;
      //   // "walk" the current item to where it belongs
      //   // by swapping adjacent items
      //   if (data.get(i).compareTo(data.get(i - 1)) < 0) {
      //     Comparable temp = data.get(i);
      //     data.set(i, data.get(i - 1));
      //     data.set(i - 1, temp);
      //   } else
      //     break;
      // }
      for (int i = partition; i > 0 && data.get(i).compareTo(data.get(i - 1)) < 0; i--, comparisons++) {
        Comparable temp = data.get(i);
        data.set(i, data.get(i - 1));
        data.set(i - 1, temp);
      }
    }
    System.out.println("insertion sort took: " + comparisons + " comparisons to complete");
  }// end insertionV

  // Non void methods:
  public static ArrayList<Comparable> insertion(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input)
      data.add(o);

    insertionV(data);

    return data;
  }

  public static ArrayList<Comparable> bubble(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input)
      data.add(o);

    bubbleV(data);

    return data;
  }

  public static ArrayList<Comparable> selection(ArrayList<Comparable> input) {
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input)
      data.add(o);

    selectionV(data);

    return data;
  }

}
