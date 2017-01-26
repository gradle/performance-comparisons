package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5370 {
    private final Productionnull_5370 production = new Productionnull_5370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}