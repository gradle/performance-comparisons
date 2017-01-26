package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12370 {
    private final Productionnull_12370 production = new Productionnull_12370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}