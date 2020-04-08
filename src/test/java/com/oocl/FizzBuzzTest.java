package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void test_say_when_receive1_then_return1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(1);
        Assert.assertEquals("1", result);
    }
}
