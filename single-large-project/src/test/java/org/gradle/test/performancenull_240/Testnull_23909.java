package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23909 {
    private final Productionnull_23909 production = new Productionnull_23909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}