package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3004 {
    private final Productionnull_3004 production = new Productionnull_3004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}