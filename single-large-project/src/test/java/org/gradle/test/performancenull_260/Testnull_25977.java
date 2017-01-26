package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25977 {
    private final Productionnull_25977 production = new Productionnull_25977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}