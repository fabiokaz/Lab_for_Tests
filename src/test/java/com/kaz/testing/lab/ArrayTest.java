package com.kaz.testing.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTest {
    public static void main(String[] args) {
        var array = Arrays.asList(1,1,1,2,2,2,2,2,2,2,2,3,3,3, 1,1, 3,3,3,3,3,4,4,4,4, 5,5, 4,4,4,4,5,5);

        List<Integer> list = array.stream().distinct().toList();
        System.out.println(list);

        List<Integer> list1 = removeConsecutiveDuplicates(array);
        System.out.println(list1);

        List<Integer> list2 = anotherRemoveConsecutiveDuplicates(array);
        System.out.println(list2);
    }

    private static List<Integer> removeConsecutiveDuplicates(List<Integer> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i == 0 || list.get(i) != list.get(i - 1))
                .mapToObj(list::get)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static List<Integer> anotherRemoveConsecutiveDuplicates(List<Integer> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i == 0 || list.get(i) != list.get(i - 1))
                .mapToObj(list::get)
                .toList();
    }
}
