package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25521 {
    private final Productionnull_25521 production = new Productionnull_25521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}