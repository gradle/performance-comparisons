package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37439 {
    private final Productionnull_37439 production = new Productionnull_37439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}