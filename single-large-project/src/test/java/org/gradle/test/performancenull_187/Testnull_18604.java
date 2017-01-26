package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18604 {
    private final Productionnull_18604 production = new Productionnull_18604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}