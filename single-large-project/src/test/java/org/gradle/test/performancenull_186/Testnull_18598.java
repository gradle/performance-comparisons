package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18598 {
    private final Productionnull_18598 production = new Productionnull_18598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}