package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37463 {
    private final Productionnull_37463 production = new Productionnull_37463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}