package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36469 {
    private final Productionnull_36469 production = new Productionnull_36469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}