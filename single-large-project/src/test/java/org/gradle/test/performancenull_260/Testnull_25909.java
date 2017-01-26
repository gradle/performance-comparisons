package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25909 {
    private final Productionnull_25909 production = new Productionnull_25909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}