package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1481 {
    private final Productionnull_1481 production = new Productionnull_1481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}