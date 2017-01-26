package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12681 {
    private final Productionnull_12681 production = new Productionnull_12681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}