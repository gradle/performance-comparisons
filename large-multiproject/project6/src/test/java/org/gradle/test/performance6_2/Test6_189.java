package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_189 {
    private final Production6_189 production = new Production6_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}