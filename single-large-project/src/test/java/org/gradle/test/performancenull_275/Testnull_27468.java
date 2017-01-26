package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27468 {
    private final Productionnull_27468 production = new Productionnull_27468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}