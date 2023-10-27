package codeWars;

public class _8_SumOfNumber {

    public static int summation(int n) {

        return  n*(n+1)/2;
    }



    public static int summation2(int n) {

        int sum =0;
        for (int i = 0; i <=n ; i++) {
            sum +=i;
        }
        return sum;
    }
}
