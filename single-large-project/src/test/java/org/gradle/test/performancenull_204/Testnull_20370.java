package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20370 {
    private final Productionnull_20370 production = new Productionnull_20370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}