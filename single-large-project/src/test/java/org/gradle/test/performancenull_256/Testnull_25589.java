package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25589 {
    private final Productionnull_25589 production = new Productionnull_25589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}