package nix.lessons;

public class SearchUtils {

    public int binarySearch(int[] array, int element, int first, int last){

        int mid = (last-first) / 2 + first;
        if(array[mid] == element)
            return mid;
        if(first == last)
            return -1;
        if (array[mid] > element)
                return binarySearch(array,element,first, mid-1);
             else
                 return binarySearch(array,element,mid+1,last);
    }
}
