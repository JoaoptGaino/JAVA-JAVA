package com.javinha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TryingNew {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0;i<10;i++){
            numbers.add(i);
        }

        List<String> evenNumbers = numbers.stream().map(number->number %2 ==0 ? "Even" : "Odd").collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
