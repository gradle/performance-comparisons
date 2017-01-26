package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36458 {
    private final Productionnull_36458 production = new Productionnull_36458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}