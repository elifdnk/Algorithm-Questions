import java.util.HashMap;

public class Generate_Documents {
    public static void main(String[] args) {

        String  list = "abcabc";
        String document = "aabbcc";
        System.out.println(generateDocument(list,document));
        System.out.println(generateDocumentOptional(list,document));


    }


    public static boolean generateDocument(String charString,String document){
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentCharFreq = countCharFrequency(character,document);
            int charListFreq = countCharFrequency(character,charString);
            if (documentCharFreq > charListFreq) return false;
        }
        return true;
    }
    public static int countCharFrequency(Character character,String str){
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (character == c) count ++;
        }
        return count;
    }

    public static boolean generateDocumentOptional(String charString,String document) {

        HashMap<Character,Integer> charCounts = new HashMap<>();
        for (int i = 0; i < charString.length(); i++) {
            char character = charString.charAt(i);
            charCounts.put(character,charCounts.getOrDefault(character,0)+1);
        }
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (!charCounts.containsKey(character)|| charCounts.get(character)==0) return false;
            charCounts.put(character,charCounts.get(character)-1);// remaining elements updated.
        }
        return true;
        }

}
/*
you are given a string of avaible char and a string representing a document that you need to generate. write a func that determines if you can generate the document using the avaible char. ıf you can generate the document your func should return true; otherwise it should return false. you are ablke to generate the document if the frequency of unique chars int the chars string is greater than or equal to the frequency of unique chars in the document string
 */