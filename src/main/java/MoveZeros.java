import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

    }

    public static void moveZeroes(int[] nums) {

        int k =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
               if(k!=i){
                   nums[i]=0;
               }
               k++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}




