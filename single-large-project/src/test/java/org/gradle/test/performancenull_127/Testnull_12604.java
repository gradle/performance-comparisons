package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12604 {
    private final Productionnull_12604 production = new Productionnull_12604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}