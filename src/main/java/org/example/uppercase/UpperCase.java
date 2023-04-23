package org.example.uppercase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {
        mapToUpperCase("A" , "b", "c");
    }

    public static Collection<String> mapToUpperCase(String... names) {

        Collection<String> upperCaseNames= new ArrayList<>();

        for (String name: names){

            upperCaseNames.add(name.toUpperCase());
        }

        return upperCaseNames;
    }

    public static Collection<String> mapToUpperCaseWithStream(String... names) {
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());

    }
}
