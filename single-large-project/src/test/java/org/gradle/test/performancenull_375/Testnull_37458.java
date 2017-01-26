package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37458 {
    private final Productionnull_37458 production = new Productionnull_37458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}