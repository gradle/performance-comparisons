package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3521 {
    private final Productionnull_3521 production = new Productionnull_3521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}