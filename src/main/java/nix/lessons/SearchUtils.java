package nix.lessons;

public class SearchUtils {

    private boolean isSorted(int[] array){

        int count = 0;

        while(array[count] <= array[count+1]){
            count++;
            if(count == array.length-1)
                break;
        }
        return count == array.length-1;
    }

    public int binarySearch(int[] array, int element, int first, int last){

        if(!isSorted(array))
            return -1;

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
