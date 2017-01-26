package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1604 {
    private final Productionnull_1604 production = new Productionnull_1604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}