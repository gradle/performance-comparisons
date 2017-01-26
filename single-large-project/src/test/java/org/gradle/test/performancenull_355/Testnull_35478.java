package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35478 {
    private final Productionnull_35478 production = new Productionnull_35478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}