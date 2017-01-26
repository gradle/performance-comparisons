package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36490 {
    private final Productionnull_36490 production = new Productionnull_36490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}