package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49080 {
    private final Productionnull_49080 production = new Productionnull_49080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}