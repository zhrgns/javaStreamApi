package org.example.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Transform {
    public static void main(String[] args) {
    }

    private static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();

        for(List<String> subCollection : collection) {
            for(String value: subCollection) {
                newCollection.add(value);
            }
        }

        return newCollection;
    }

    private static List<String> transformWithApi(List<List<String>> collection) {
        return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }


}
