package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5239 {
    private final Productionnull_5239 production = new Productionnull_5239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}