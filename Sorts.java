import java.util.ArrayList;
public class Sorts {
  public static void bubble(ArrayList<Comparable> data) {
        /* YOUR IMPLEMENTATION HERE */
        for (int i = 0; i < data.size(); i++) {
            for (int j = data.size() - 1; j > i; j--) {
                if (data.get(j).compareTo(data.get(j - 1)) < 0) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
            }
        }
    }
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass--) {

      maxPos = pass;
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      //iterate thru next-to-last to first element and compare with last.
      for(int i = pass - 1; i >= 0 ; i--  ) {

        //if element at i > element at maxPos, new maxPos = i
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }

        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      }

      //swap last element with element at maxPos.
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);

      System.out.println( "after swap: " +  data );//diag


    }
  }//end selectionSort

  public static void insertion( ArrayList<Comparable> data )
  {
    for( int partition = 1; partition < data.size(); partition++ ) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i-1)) < 0 ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i - 1, temp);
        }
        else
          break;
      }
    }
  }//end insertionSortV
}
