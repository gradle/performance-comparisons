package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36483 {
    private final Productionnull_36483 production = new Productionnull_36483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}