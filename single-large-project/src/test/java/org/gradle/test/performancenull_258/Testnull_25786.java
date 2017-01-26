package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25786 {
    private final Productionnull_25786 production = new Productionnull_25786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}