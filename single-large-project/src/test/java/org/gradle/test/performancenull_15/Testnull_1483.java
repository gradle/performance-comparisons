package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1483 {
    private final Productionnull_1483 production = new Productionnull_1483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}