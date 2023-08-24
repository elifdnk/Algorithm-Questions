import java.util.Arrays;

public class FindMaxIntArray {
    public static void main(String[] args) {

        /* Solution 1 : we accept our max value is 0. then we look each arrays element and compare our max value. if arrays element bigger than our max we change the max value. */

        int[] arr1 = {6, 8, 3, 5, 1, 9};
        int max = Integer.MIN_VALUE;
        for (int each : arr1) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);

        System.out.println("----------------------------------------------------------------");

        /* Solution 2: We accept our first index is max, then we compare the other indexs every time if our index is greater than our max index, we change the max number. */

        int[] arr2 = {6, 8, 3, 5, 1, 9};
        int max2 = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }
        System.out.println(max2);

        System.out.println("----------------------------------------------------------------");


        /* solution 3:  with using stream;
                       first we put our Array to stream and we use max() method and we convert to Optional to integer by using getAsInt. */

        System.out.println(Arrays.stream(arr1).max().getAsInt());

        System.out.println("----------------------------------------------------------------");





    }

}
/*Question-1 Find Max from int Array
        Write a function that can find the maximum number from an int Array.
        input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9*/