import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFactorial {
    public static void main(String[] args) {


        System.out.println(solutionWithFor(0));
        System.out.println(solutionWithStream(5));
        System.out.println(solutionWithStream2(5));

    }
//Solution 1:
    public static int solutionWithFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
//Solution2:
    public static int solutionWithStream(int n) {  // IntStream represent stream of integers. range represent of values starting and ending value
        return IntStream.range(1, n + 1)
                .reduce(1, (x, y) -> x * y);// reduce combines the elements of a stream into single result by applying a binary operator
    }
//Solution3:
    public static int solutionWithStream2(int n){
        return Stream.iterate(1,i->i<=n,i->i+1) //iterate;is initial value and function that produces the next element on stream
                .reduce(1, (x, y) -> x * y);
    }
//Solution4:
    public static int factorial(int num){
        return IntStream.rangeClosed(1,num)
                .reduce( (a,b) -> a*b ).getAsInt();
    }


}


/*
Question-2 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.

 */