package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12380 {
    private final Productionnull_12380 production = new Productionnull_12380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}