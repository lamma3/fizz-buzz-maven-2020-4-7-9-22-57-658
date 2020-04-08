package com.oocl;

public class FizzBuzz {
    
    private final static String FIZZ_STRING = "Fizz";
    private final static String BUZZ_STRING = "Buzz";

    public String say(int number) {
        if (isDivisible(number, 15)) {
            return FIZZ_STRING + BUZZ_STRING;
        }
        if (isDivisible(number, 3)) {
            return FIZZ_STRING;
        }
        if (isDivisible(number, 5)) {
            return BUZZ_STRING;
        }
        return String.valueOf(number);
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
