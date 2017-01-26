package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12379 {
    private final Productionnull_12379 production = new Productionnull_12379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}