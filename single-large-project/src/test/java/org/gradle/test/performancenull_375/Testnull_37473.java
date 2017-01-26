package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37473 {
    private final Productionnull_37473 production = new Productionnull_37473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}