package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18370 {
    private final Productionnull_18370 production = new Productionnull_18370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}