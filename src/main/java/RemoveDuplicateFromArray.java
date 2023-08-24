public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,7,7,8,9,9,9,9,9,10,10};
       int count = removeDuplicates2(arr);
        System.out.println(count);
    }




    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        int uniqueCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[uniqueCount - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }



    public static int removeDuplicates2(int[] arr){
        int j=1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }
        }
        return j;
    }





}
