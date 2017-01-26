package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15373 {
    private final Productionnull_15373 production = new Productionnull_15373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}