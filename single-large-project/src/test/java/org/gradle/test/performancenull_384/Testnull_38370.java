package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38370 {
    private final Productionnull_38370 production = new Productionnull_38370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}