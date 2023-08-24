import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

    }

    public static void moveZeroes(int[] nums) {

        int k =0;

        for (int i = 0; i < nums.length; i++) {                                          //i=0   k=0     //i=1 k=0
            if (nums[i] != 0) {    // if nums[i] not equal 0                             // nums[0]=0    //nums[1]!=0
                nums[k] = nums[i]; // we change the nums[k] value to nums[i] value                       //num[0]=num[1]=1
               if(k!=i){           // then we check if k not equal the i                                 //0!=1
                   nums[i]=0;      // we change the nums[i] value to 0                                  //num[1]=0
               }
               k++;                                                                                     //k=1
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros2(int[] nums){
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i=j ; i<nums.length;i++){
            nums[i]=0;
        }
    }







}




