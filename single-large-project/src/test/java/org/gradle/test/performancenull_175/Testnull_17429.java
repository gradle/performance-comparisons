package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17429 {
    private final Productionnull_17429 production = new Productionnull_17429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}