package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12348 {
    private final Productionnull_12348 production = new Productionnull_12348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}