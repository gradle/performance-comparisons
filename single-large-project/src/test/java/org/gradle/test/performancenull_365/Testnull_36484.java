package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36484 {
    private final Productionnull_36484 production = new Productionnull_36484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}