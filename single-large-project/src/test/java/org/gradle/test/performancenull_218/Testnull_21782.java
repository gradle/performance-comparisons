package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21782 {
    private final Productionnull_21782 production = new Productionnull_21782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}