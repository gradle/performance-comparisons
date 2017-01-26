package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20482 {
    private final Productionnull_20482 production = new Productionnull_20482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}