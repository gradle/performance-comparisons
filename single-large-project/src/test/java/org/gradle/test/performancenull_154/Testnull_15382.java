package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15382 {
    private final Productionnull_15382 production = new Productionnull_15382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}