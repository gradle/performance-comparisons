package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23601 {
    private final Productionnull_23601 production = new Productionnull_23601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}