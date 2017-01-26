package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1482 {
    private final Productionnull_1482 production = new Productionnull_1482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}