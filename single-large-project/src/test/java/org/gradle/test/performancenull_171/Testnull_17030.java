package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17030 {
    private final Productionnull_17030 production = new Productionnull_17030("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}