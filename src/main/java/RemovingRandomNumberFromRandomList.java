import java.util.ArrayList;
import java.util.Random;

public class RemovingRandomNumberFromRandomList {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbersList.add(random.nextInt(100));    //Create a list of 100 random numbers
        }

        ArrayList<Integer> numbersCopyList = new ArrayList<>(numbersList); // create copy list

        System.out.println(numbersList);  //Check numbersList

          int randomNumber = random.nextInt(100); //Generate a random number between 0 and 100.


        System.out.println(randomNumber); //Check randomNumber

        numbersCopyList.removeIf(p -> p.equals(randomNumber));  //Delete the index containing this random number in the copy list.

        System.out.println(numbersCopyList); //Check numbersCopyList

      findMissingElement(numbersList, numbersCopyList); //By using findMissingElement method, find the missing number


    }

    //Create a method that finds which element is missing.
    public static void findMissingElement(ArrayList<Integer> numbersList, ArrayList<Integer> numbersCopyList) {

        boolean result = false;
        for (int i : numbersList) {
            if (!numbersCopyList.contains(i)) {
                System.out.println("Missing element is "+ i);     //missing element found
                result= true;
                break;
            }
        }
        if (!result){ //there is no missing element both list are same
            System.out.println("Two lists are same");
        }
    }


}
