package codeWars;

public class _8_ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {

        for(int i=0; i<=haystack.length;i++){
            if("needle".equals(haystack[i])){
                return "found the needle at position "+ i;
            }
        }
        return "not found";
    }


        // Your code here
    }

/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
Note: In COBOL, it should return "found the needle at position 6"
 */