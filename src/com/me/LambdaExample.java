package com.me;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example 1: Using lambda expression to iterate through the list and print each element
        System.out.println("Example 1: Printing elements using lambda expression");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Example 2: Using lambda expression with functional interfaces
        System.out.println("Example 2: Filtering even numbers using lambda expression and functional interface");
        // Define a predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        // Use the `filter` method with lambda expression
        numbers.stream()
                .filter(isEven)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Example 3: Using lambda expression with functional programming style
        System.out.println("Example 3: Sum of all even numbers using lambda expression and functional programming style");
        // Use the `map` and `reduce` functions to get the sum of all even numbers
        int sumOfEvenNumbers = numbers.stream()
                .filter(isEven)
                .reduce(0, Integer::sum);
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}