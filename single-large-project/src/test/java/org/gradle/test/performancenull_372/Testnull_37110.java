package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37110 {
    private final Productionnull_37110 production = new Productionnull_37110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}