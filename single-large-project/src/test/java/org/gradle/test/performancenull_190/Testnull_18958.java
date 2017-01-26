package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18958 {
    private final Productionnull_18958 production = new Productionnull_18958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}