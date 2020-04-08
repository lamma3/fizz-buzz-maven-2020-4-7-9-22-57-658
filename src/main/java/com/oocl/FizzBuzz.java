package com.oocl;

public class FizzBuzz {
    
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";

    public String say(int number) {
        if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
            return FIZZ + BUZZ;
        }
        if (isDivisibleBy3(number)) {
            return FIZZ;
        }
        if (isDivisibleBy5(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
