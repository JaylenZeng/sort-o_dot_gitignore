import java.util.ArrayList;

public class Sorts {

  public static void bubbleV(ArrayList<Comparable> data) {
    /* YOUR IMPLEMENTATION HERE */
    int comparisons = 0;
    for (int i = 0; i < data.size(); i++) {
      for (int j = data.size() - 1; j > i; j--) {
        if (data.get(j).compareTo(data.get(j - 1)) < 0) {
          comparisons++;
          Comparable temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j - 1, temp);
        }
      }
    }
    System.out.println("This took:" +comparisons+ "comparisons");
  }

  public static void selectionV(ArrayList<Comparable> data) {

    // maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int comparisons = 0;

    for (int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;
      // iterate thru next-to-last to first element and compare with last.
      for (int i = pass - 1; i >= 0; i--) {

        // if element at i > element at maxPos, new maxPos = i
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          comparisons++;
          maxPos = i;
        }

      }
      // swap last element with element at maxPos.
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);

    }
    System.out.println("This took:" +comparisons+ "comparisons");

  }// end selectionSort

  public static void insertionV(ArrayList<Comparable> data) {
    int comparisons = 0;
    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region

      // traverse sorted region from right to left
      for (int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          comparisons++;
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i - 1, temp);
        } else
          break;
      }
    }
    System.out.println("This took:" +comparisons+ "comparisons");

  }// end insertionSortV
  public static ArrayList<Comparable>
  insertion( ArrayList<Comparable> input )
{
  //declare and initialize empty ArrayList for copying
  ArrayList<Comparable> data = new ArrayList<Comparable>();

  //copy input ArrayList into working ArrayList
  for( Comparable o : input )
    data.add( o );

  //sort working ArrayList
  insertion( data );

  //return working ArrayList
  return data;
}//end insertionSort
public static ArrayList<Comparable>
  insertionSort( ArrayList<Comparable> input )
{
  //declare and initialize empty ArrayList for copying
  ArrayList<Comparable> data = new ArrayList<Comparable>();

  //copy input ArrayList into working ArrayList
  for( Comparable o : input )
    data.add( o );

  //sort working ArrayList
  insertionSortV( data );

  //return working ArrayList
  return data;
}//end insertionSort
public static ArrayList<Comparable>
  insertionSort( ArrayList<Comparable> input )
{
  //declare and initialize empty ArrayList for copying
  ArrayList<Comparable> data = new ArrayList<Comparable>();

  //copy input ArrayList into working ArrayList
  for( Comparable o : input )
    data.add( o );

  //sort working ArrayList
  insertionSortV( data );

  //return working ArrayList
  return data;
}//end insertionSort

}
