package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;

//   for each character in the string check to see if it's a key in the hashmap, if not, add it to the hashmap (assign in a value of 1 also).
// If it is in the hashmap, add +1 to the value.

public class CountingChars {
    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}