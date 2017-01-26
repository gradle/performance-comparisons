package org.gradle.test.performancenull_244;

import static org.junit.Assert.*;

public class Testnull_24370 {
    private final Productionnull_24370 production = new Productionnull_24370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}