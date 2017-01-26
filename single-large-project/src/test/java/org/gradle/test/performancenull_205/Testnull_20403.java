package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20403 {
    private final Productionnull_20403 production = new Productionnull_20403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}