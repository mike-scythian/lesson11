package nix.lessons;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App
{
    public static void main( String[] args )
    {

        SortUtils bSort = new SortUtils();
        int[] arr = bSort.randInitArray(new int[10],-10,10);
        SearchUtils binSearch = new SearchUtils();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bSort.bubbleSort(arr)));
        System.out.println(binSearch.binarySearch(arr,8,0,arr.length-1));

    }
}
