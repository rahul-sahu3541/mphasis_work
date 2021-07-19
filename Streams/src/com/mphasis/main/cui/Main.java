package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //numbers.stream()
              //  .map(number -> number+1)
                //.forEach(System.out::println);
//         numbers.stream()
//                 .map(String::valueOf)
//                 .map(number -> Integer.valueOf(number)*2)
//                 .forEach(System.out::println);
//        System.out.println(numbers.stream()
//                .map(String::valueOf)
//                .reduce("", (constring,str) -> constring.concat(str)));
//        System.out.println(numbers.stream()
//
//                .reduce(0, (total,number) ->Integer.sum(total,number)));
//        System.out.println(numbers.stream()
//                .filter(number -> number%2 ==0)
//                .map(number -> number*2)
//                .reduce(0, (total,number) -> Integer.sum(total,number)));
//        List<Integer> doubleOfNumber =new  ArrayList<Integer>();
//        numbers.stream()
//                .filter(number -> number%2 ==0)
//                .map(number -> number*2)
//                .forEach(number -> doubleOfNumber.add(number));
//        doubleOfNumber.forEach(System.out::println);
        List<Integer> doubleOfEvenNumbers;
        doubleOfEvenNumbers = numbers.stream()
                .filter(number -> number%2 ==0)
                .map(number -> number*2)
                .collect(Collectors.toList());
    }
}
