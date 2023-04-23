package org.example.longerNames;

import java.util.Arrays;

public class LongerNames {


    public static void main(String[] args) {
        getTotalLetterNumbersOfNamesLongerThanFive("A","b","c");
    }

    private static int getTotalLetterNumbersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
