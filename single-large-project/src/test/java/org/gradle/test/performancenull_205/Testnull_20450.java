package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20450 {
    private final Productionnull_20450 production = new Productionnull_20450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}