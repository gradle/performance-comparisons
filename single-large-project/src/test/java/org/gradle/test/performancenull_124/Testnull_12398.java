package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12398 {
    private final Productionnull_12398 production = new Productionnull_12398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}