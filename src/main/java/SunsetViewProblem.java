import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViewProblem {

    public static void main(String[] args) {
        int[] buildings ={3,5,4,4,3,1,3,2};
        sunsetViews(buildings,"west").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings,String direction){

        Stack<Integer> stack=new Stack<>();   //stack to hold building indicies that can see sunset
        //this part is for East by default
        int i=0;
        int step=1;
        //this part is for west
        if(direction.equalsIgnoreCase("west")){
            i=buildings.length-1;
            step=-1;
        }
        while (i>=0 && i<buildings.length){

            while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }
        //now I have a stack with the buildings indicies that can see sunset
        if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);
         return new ArrayList<>(stack);
    }
}
/*
Given an array of buildings and a direction that all of the buildings face, return
an array of the indices of the buildings that can see the sunset. A building can see
the sunset if it's strictly taller than all of the buildings that come after it in the

direction that it faces. The input array named buildings contains positive, non-
zero integers representing the heights of the buildings. A building at index i thus

has a height denoted by buildings[i] . All of the buildings face the same direction,
and this direction is either east or west, denoted by the input string named
direction , which will always be equal to either "EAST" or "WEST" . In relation to
the input array, you can interpret these directions as right for east and left for
west.
• Important note: the indices in the output array should be sorted in ascending
order.
 */