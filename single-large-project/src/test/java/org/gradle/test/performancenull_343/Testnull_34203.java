package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34203 {
    private final Productionnull_34203 production = new Productionnull_34203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}