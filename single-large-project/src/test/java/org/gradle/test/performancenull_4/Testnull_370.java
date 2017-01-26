package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_370 {
    private final Productionnull_370 production = new Productionnull_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}