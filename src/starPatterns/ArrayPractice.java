package starPatterns;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        System.out.println("Before using myCode method : "+ Arrays.toString(arr));
        myCode(arr);

    }

    static void myCode(int[] array){
        int firstIndex = array[0];
        int lastIndex = array[array.length - 1];
        int temp = firstIndex;
        firstIndex = lastIndex;
        lastIndex = temp;

        array[0] = firstIndex;
        array[array.length - 1] = lastIndex;


        System.out.println(Arrays.toString(array));

    }
}