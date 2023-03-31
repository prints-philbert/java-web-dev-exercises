package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] values = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        for (int i = 0; i < values.length; i = i+2) {
            System.out.println(values[i]);
        }

        String stringExercise = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitSpaces = stringExercise.split(" ");

        System.out.println(Arrays.toString(splitSpaces));

        String[] splitSentence = stringExercise.split("\\.");

        System.out.println(Arrays.toString(splitSentence));


    }
}
