package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Collection;
import java.util.HashMap;
public class CountingCharacters {
    public static void main(String[] args) {
        String stringForCount = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = stringForCount.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();

            for ( char character : charactersInString ) {
                if (characterCount.containsKey(character)) {
                    characterCount.put(character, characterCount.get(character) + 1);
                } else {
                    characterCount.put(character, 1);
                }
            }

        for ( HashMap.Entry<Character, Integer> entry : characterCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

    }
}
