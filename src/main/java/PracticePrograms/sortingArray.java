package PracticePrograms;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {

        int arr[] = {11,2,7,9,45,76,98,78};
        int temp =0;
        int size = arr.length;
        Arrays.sort(arr);
        System.out.println(" sorted array : "+ Arrays.toString(arr));

        int res = arr[size-3];
        System.out.println(res);





    }
}
