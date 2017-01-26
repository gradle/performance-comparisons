package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23668 {
    private final Productionnull_23668 production = new Productionnull_23668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}