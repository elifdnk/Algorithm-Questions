package codeWars;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class _8_RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        list.removeIf(p->p.contains("!"));


        return list.stream()
                .map(Objects::toString)
                .collect(Collectors.joining());
    }

// solution 2 :
    /*
    return s.replaceAll("!", "");
     */

}
