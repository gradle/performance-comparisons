package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25523 {
    private final Productionnull_25523 production = new Productionnull_25523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}