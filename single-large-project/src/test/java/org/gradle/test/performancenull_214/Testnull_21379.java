package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21379 {
    private final Productionnull_21379 production = new Productionnull_21379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}