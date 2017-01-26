package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12366 {
    private final Productionnull_12366 production = new Productionnull_12366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}