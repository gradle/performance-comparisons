package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3433 {
    private final Productionnull_3433 production = new Productionnull_3433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}