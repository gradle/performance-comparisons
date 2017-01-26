package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36482 {
    private final Productionnull_36482 production = new Productionnull_36482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}