package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6370 {
    private final Productionnull_6370 production = new Productionnull_6370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}