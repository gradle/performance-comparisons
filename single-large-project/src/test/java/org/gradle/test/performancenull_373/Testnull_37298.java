package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37298 {
    private final Productionnull_37298 production = new Productionnull_37298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}