package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25563 {
    private final Productionnull_25563 production = new Productionnull_25563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}