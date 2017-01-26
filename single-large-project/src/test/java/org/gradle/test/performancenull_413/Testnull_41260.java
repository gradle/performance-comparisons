package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41260 {
    private final Productionnull_41260 production = new Productionnull_41260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}