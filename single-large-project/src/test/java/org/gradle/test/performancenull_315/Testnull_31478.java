package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31478 {
    private final Productionnull_31478 production = new Productionnull_31478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}