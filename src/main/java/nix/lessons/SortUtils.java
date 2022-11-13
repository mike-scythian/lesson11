package nix.lessons;

import java.util.Random;

public class SortUtils {

    private int[] swap(int[] array, int i1, int i2){

        if(i1 == i2)
            return array;

        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;

        return array;
    }
    public int[] randInitArray(int[] array, int origin, int bound){

        Random randNumber = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = randNumber.nextInt(origin,bound);

        return array;
    }
    public int[] bubbleSort(int[] array){

        boolean isSwap;

        for(int i = 0; i < array.length; i++){
            isSwap = false;
            for(int j =  0 ; j < array.length-1-i; j++){
                if(array[j] > array[j+1]) {
                    swap(array, j, j + 1);
                    isSwap = true;
                }
            }
            if(!isSwap)
                break;
        }
        return array;
    }
}
