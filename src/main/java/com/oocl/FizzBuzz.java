package com.oocl;

public class FizzBuzz {
    
    private final static String FIZZ = "Fizz";

    public String say(int number) {
        if (isDivisibleBy3(number)) {
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
